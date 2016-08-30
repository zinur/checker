package com.heroku.undertow;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloWorldServer {

    @RequestMapping(method = RequestMethod.GET)
    public String home(ModelMap model) {

        return "home";
    }

}
