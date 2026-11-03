

package com.smartkitchen.chef;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ChefService {

    private final ChefRepository chefRepository;

    // Constructor injection
    public ChefService(ChefRepository chefRepository) {
        this.chefRepository = chefRepository;
    }

    // Get all verified chefs
    public List<Chef> getAllVerifiedChefs() {
        return chefRepository.findByVerifiedTrue();
    }

    // Get verified chefs by location
    public List<Chef> getVerifiedChefsByLocation(
            String location) {

        return chefRepository
                .findByLocationIgnoreCaseAndVerifiedTrue(location);
    }

    // Get a chef by ID
    public Chef getChefById(Long id) {
        return chefRepository.findById(id)
                .orElseThrow(() ->
                    new RuntimeException(
                        "Chef not found with ID: " + id));
    }
}
