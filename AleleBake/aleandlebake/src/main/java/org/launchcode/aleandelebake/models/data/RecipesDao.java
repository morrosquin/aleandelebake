package org.launchcode.aleandelebake.models.data;

import org.launchcode.aleandelebake.models.Recipes;
import org.springframework.data.repository.CrudRepository;

public interface RecipesDao extends CrudRepository <Recipes, Integer>{

}
