package com.springapp.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {
    @Autowired
    private UserValidator userValidator;

    @RequestMapping(value = "/")
    public String index(@ModelAttribute(value = "user") User user,
                        BindingResult bindingResult,
                        HttpServletRequest request) {
        if("POST".equals(request.getMethod()))  {
            userValidator.validate(user, bindingResult);
        }
        return "index";
    }
}