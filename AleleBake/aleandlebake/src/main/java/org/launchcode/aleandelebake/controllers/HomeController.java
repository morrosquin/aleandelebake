package org.launchcode.aleandelebake.controllers;

import org.launchcode.aleandelebake.models.data.HomeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("Home")
public class HomeController {

        @Autowired
        private HomeDao homeDao;

        @RequestMapping(value = "")
        public String index(Model model) {

            model.addAttribute("home", homeDao.findAll());
            model.addAttribute("title", "Home");


            return "Home/index";

        }

    }

