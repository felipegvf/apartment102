package io.github.felipegvf.apto102;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("")
    public String home(Model model) {
        for (int i = 0; i < 1000; i++){
            logger.info("Home page {}", i);
        }

        var page = new Page("Hello, Java Template Engine!", "This is my home");
        var items = List.of("My item 1", "My item 2", "My item 3");
        model.addAttribute("name", "Felipe");
        model.addAttribute("page", page);
        model.addAttribute("items", items);
        return "index";
    }

}
