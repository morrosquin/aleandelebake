package org.launchcode.aleandelebake.controllers;

import org.launchcode.aleandelebake.models.Msg;
import org.launchcode.aleandelebake.models.data.MsgDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("")
public class MsgController {

    @Autowired
    private MsgDao msgDao;

    @RequestMapping(value = "Msg", method = RequestMethod.GET)
    public String displayAddMsgForm(Model model) {
        model.addAttribute(new Msg());
        model.addAttribute("title", "Add Message");
        return "Contact/msg";
    }

    @RequestMapping(value = "Msg", method = RequestMethod.POST)
    public String add(Model model, @RequestParam String email, @RequestParam String name,
                      @RequestParam String date, @RequestParam String message) {

///
        Msg newMsg = new Msg();
        msgDao.save(newMsg);
        return "redirect:msg";
    }
}

