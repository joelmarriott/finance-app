package app.finance.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    Logger logger = LoggerFactory.getLogger(WebController.class);

    @GetMapping("/")
    public String home(Model model) {
        return "index";
    }
}
