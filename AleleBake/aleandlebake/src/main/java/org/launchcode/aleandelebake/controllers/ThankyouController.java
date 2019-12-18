package org.launchcode.aleandelebake.controllers;

import org.launchcode.aleandelebake.models.Thankyou;
import org.launchcode.aleandelebake.models.User;
import org.launchcode.aleandelebake.models.data.ThankyouDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "")

public class ThankyouController {


    @Autowired
    private ThankyouDao thankyouDao;

    @RequestMapping(method = RequestMethod.GET, value = "/thankyou")
    public String thankyou(Model model) {
        model.addAttribute(new User());
        model.addAttribute("title", "thankyou");
        return "Contact/thankyou";

    }

    @RequestMapping(value = "/thankyou", method = RequestMethod.POST)
    public String add(Model model, @RequestParam String name, String email, String date, String message) {

        Thankyou newThankyou = new Thankyou(name, email, date, message);
        thankyouDao.save(newThankyou);
        return "Contact/thankyou";

    }

}


