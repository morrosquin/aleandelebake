package org.launchcode.aleandelebake.controllers;
import org.launchcode.aleandelebake.models.data.RecipesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("Recipes")
public class RecipesController {
    @Autowired
    private RecipesDao recipesDao;

    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("recipes", recipesDao.findAll());
        model.addAttribute("title", "Recipes");

        return "Recipes/index";

    }
}
