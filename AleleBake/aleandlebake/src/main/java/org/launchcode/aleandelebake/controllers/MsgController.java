package org.launchcode.aleandelebake.controllers;

import org.launchcode.aleandelebake.models.Msg;
import org.launchcode.aleandelebake.models.data.MsgDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("")
public class MsgController {

    @Autowired
    private MsgDao msgDao;

    @RequestMapping(value = "/msg", method = RequestMethod.GET)
    public String displayAddMsgForm(Model model) {
        model.addAttribute(new Msg());
        model.addAttribute("title", "Add Message");
     //   model.addAttribute("name", "Add Name");
     //   model.addAttribute("email", "Add Email");
     //   model.addAttribute("date", "Add Date");

        return "/index";
    }

    @RequestMapping(value = "/msg", method = RequestMethod.POST)
    public String processAddMsgForm(@ModelAttribute @Valid Msg newMsg,
                                        Errors errors, Model model) {

        if (errors.hasErrors()) {
            model.addAttribute("title", "Add Message");
            return "/index";
        }
        msgDao.save(newMsg);
        return "/msg";
        //redirect
    }
}
