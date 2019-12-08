package org.launchcode.aleandelebake.models.data;

import org.launchcode.aleandelebake.models.Services;
import org.springframework.data.repository.CrudRepository;

public interface CategoriesDao extends CrudRepository<Services, Integer> {
}
