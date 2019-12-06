package org.launchcode.aleandelebake.controllers;

import org.launchcode.aleandelebake.models.data.AboutDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("About")
public class AboutController {

    @Autowired
    private AboutDao aboutDao;

    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("About", aboutDao.findAll());
        model.addAttribute("title", "About Us");

        return "About/index";

    }
}
