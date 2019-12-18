package org.launchcode.aleandelebake.controllers;

import org.launchcode.aleandelebake.models.Ourservices;
import org.launchcode.aleandelebake.models.data.OurservicesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "")

public class OurservicesController {


    @Autowired
    private OurservicesDao ourservicesDao;

    @RequestMapping(method = RequestMethod.GET, value = "/ourservices")
    public String ourservices(Model model) {
        model.addAttribute(new Ourservices());
        model.addAttribute("title", "ourservices");
        return "Services/ourservices";

    }

    @RequestMapping(value = "/ourservices", method = RequestMethod.POST)
    public String add(Model model, @RequestParam String name, String email, String date, String message, String workshops) {

        Ourservices newOurservices = new Ourservices(name, email, date, message, workshops);
        ourservicesDao.save(newOurservices);
        return "Services/ourservices";

    }

}


