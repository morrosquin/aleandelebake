package org.launchcode.aleandelebake.controllers;

import org.launchcode.aleandelebake.models.data.ContactDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("Contact")
public class ContactController {
    @Autowired
    private ContactDao contactDao;

    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("contact", contactDao.findAll());
        model.addAttribute("title", "Contact Us");

        return "Contact/index";

    }
}
