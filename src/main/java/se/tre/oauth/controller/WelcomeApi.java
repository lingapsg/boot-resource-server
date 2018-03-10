package se.tre.oauth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeApi {

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public ModelAndView getEmployeeInfo() {
        return new ModelAndView("welcome");
    }
}
