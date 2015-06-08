package com.springapp.mvc;

import models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
public class HelloController {
    @RequestMapping(value="/")
    public String printWelcome(@ModelAttribute(value = "user")User user, ModelMap model) {
        model.addAttribute("name", user.getName());
        model.addAttribute("age", user.getAge());
        model.addAttribute("address", user.getAddress());
        return "index";
    }

//    @RequestMapping(value="/user", method=RequestMethod.POST)
//    public createUser(Model model, @Valid @ModelAttribute("user") User user, BindingResult result){
//        if (result.hasErrors()){
//            // do something
//        }
//        else {
//            // do something else
//        }
//    }
}