package org.launchcode.aleandelebake.controllers;

import org.launchcode.aleandelebake.models.Contacted;
import org.launchcode.aleandelebake.models.User;
import org.launchcode.aleandelebake.models.data.ContactedDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="")

public class ContactedController {


    @Autowired
    private ContactedDao contactedDao;

    @RequestMapping(method = RequestMethod.GET, value = "/contacted")
    public String contacted(Model model) {
        model.addAttribute(new Contacted());
        model.addAttribute("title", "contacted");

        return "Contact/contacted";

    }

    @RequestMapping(value = "/contacted", method = RequestMethod.POST)
    public String add(Model model, @RequestParam String email) {

        User newUser=new User(email);
     //   contactedDao.save (newUser);
       return "Contact/contacted";

    }

}


