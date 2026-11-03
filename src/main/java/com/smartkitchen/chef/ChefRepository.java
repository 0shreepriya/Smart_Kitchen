

package com.smartkitchen.chef;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ChefRepository extends JpaRepository<Chef, Long> {

	 List<Chef> findByVerifiedTrue();
	

    List<Chef> findByLocationIgnoreCaseAndVerifiedTrue(
            String location);
}
