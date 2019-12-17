package org.launchcode.aleandelebake.controllers;

import org.launchcode.aleandelebake.models.Comment;
import org.launchcode.aleandelebake.models.data.CommentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping(value="")
public class CommentController {
    @Autowired
    private CommentDao commentDao;

    @RequestMapping(value ="Bunuelo", method = RequestMethod.GET)
    public String displayCommentForm(Model model) {
        model.addAttribute("title", "Add Comment");

        model.addAttribute(new Comment());
        model.addAttribute("name", "Add Name");
        return "Recipes/bunuelos";
    }

    @RequestMapping(value = "Bunuelo", method = RequestMethod.POST)
    public String processCommentForm(@ModelAttribute @Valid Comment newComment,
                                     Errors errors, Model model) {

        if (errors.hasErrors()) {
            model.addAttribute("title", "Add Comment");
            return "Recipes/bunuelos";
        }

        commentDao.save(newComment);
        return "redirect:/Bunuelo";
    }
}