package org.launchcode.aleandelebake.controllers;

import org.launchcode.aleandelebake.models.data.HomeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("Categories/Cakes")
public class CatCakesController {

        @Autowired
        private CategoriesDao categoriesDao;

        @RequestMapping(value = "")
        public String index(Model model) {

            model.addAttribute("categories", categoriesDao.findAll());
            model.addAttribute("title", "Categories");


            return "Categories/Cakes";

        }

    }

