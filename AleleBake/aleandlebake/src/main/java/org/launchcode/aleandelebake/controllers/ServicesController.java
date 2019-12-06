package org.launchcode.aleandelebake.controllers;

import org.launchcode.aleandelebake.models.data.ServicesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("Services")
public class ServicesController {
    @Autowired
    private ServicesDao servicesDao;

    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("services", servicesDao.findAll());
        model.addAttribute("title", "Services");

        return "Services/index";

    }
}
