package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;


@Controller
@RequestMapping("cheese") // /cheese en el browser
public class CheeseController {

    static ArrayList<String> cheeses = new ArrayList<>();

    @RequestMapping(value = "") //Requests path /cheese
    public String index(Model model){
        //ArrayList<String> cheeses = new ArrayList<>();//We move this list to make it
        // accessible to all methods not just thi one
        /*cheeses.add("cheddar"); //remove to add it to our form and not just hardcoded here
        cheeses.add("parmesan");
        cheeses.add("blanco");*/

        model.addAttribute("cheeses", cheeses);
        model.addAttribute("title", "My Cheeses");
        return "cheese/index"; //make sure this handler returns the mapping "cheese" and then the template (index)
    }

    @RequestMapping(value = "add", method = RequestMethod.GET) //where the form lives at. That is the url named "add"
    public String displayAddCheeseForm (Model model){ //controller method to display a form
        model.addAttribute("title", "Add Cheese"); //this adds the title for the form
        return "cheese/add"; //returns the form
    }
    @RequestMapping(value = "add", method = RequestMethod.POST )

    /*public String processAddCheeseForm(HttpServletRequest request){
        String cheeseName= request.getParameter("Cheesename"); /*uses the name (cheeseName) of the parameter that was passed in
        at the input type in the form (template). This is one way to do it but not exclusive to Spring*/

    public String processAddCheeseForm(@RequestParam String cheeseName){ //My handler expects to be passed a parameter
        // that is a string that Spring should look for in the template

        cheeses.add(cheeseName); //this will access the cheese list the uses enters in the field
        return "redirect:"; //Redirect to /cheese or the handler under the value of the requestMapping in the Controller

    }
}
