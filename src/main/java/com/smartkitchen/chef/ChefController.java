

package com.smartkitchen.chef;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/chefs")
public class ChefController {

    private final ChefService chefService;

    // Constructor injection
    public ChefController(ChefService chefService) {
        this.chefService = chefService;
    }

    // GET: Retrieve all verified chefs
    @GetMapping
    public List<Chef> getAllVerifiedChefs() {
        return chefService.getAllVerifiedChefs();
    }

    // GET: Retrieve verified chefs by location
    @GetMapping("/location/{location}")
    public List<Chef> getChefsByLocation(
            @PathVariable String location) {

        return chefService.getVerifiedChefsByLocation(location);
    }

    // GET: Retrieve a chef by ID
    @GetMapping("/{id}")
    public Chef getChefById(@PathVariable Long id) {
        return chefService.getChefById(id);
    }
}
