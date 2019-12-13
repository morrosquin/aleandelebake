package org.launchcode.aleandelebake.controllers;

import org.launchcode.aleandelebake.models.User;
import org.launchcode.aleandelebake.models.data.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="")

public class UserController {


    @Autowired
    private UserDao userDao;

    @RequestMapping(method = RequestMethod.GET, value = "/subscribe")
    public String subscribe(Model model) {
        model.addAttribute(new User());
        model.addAttribute("title", "subscribe");
        return "Home/subscribe";


    }

    @RequestMapping(value = "/subscribe", method = RequestMethod.POST)
    public String add(Model model, @RequestParam String email) {

      User newUser=new User(email);

        userDao.save (newUser);
//            User myvaliduser = new User(user.getUsername(), user.getPassword());
//            UserDao.save(myvaliduser);
        return "redirect: Home/subscribe";

    }

}


