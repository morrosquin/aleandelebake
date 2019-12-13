package org.launchcode.aleandelebake.controllers;

import org.launchcode.aleandelebake.models.data.BunuelosDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("Bunuelo")
public class BunuelosController {

        @Autowired
        private BunuelosDao bunuelosDao;

        @RequestMapping(value = "")
        public String index(Model model) {

            model.addAttribute("bunuelos", bunuelosDao.findAll());
            model.addAttribute("title", "Bunuelo");


            return "Recipes/bunuelos";

        }



    }

