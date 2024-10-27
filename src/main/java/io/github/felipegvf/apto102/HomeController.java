package io.github.felipegvf.apto102;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @GetMapping("")
    public String home(Model model) {
        var page = new Page("Hello, Java Template Engine!", "This is my home");
        var items = List.of("My item 1", "My item 2", "My item 3");
        model.addAttribute("name", "Felipe");
        model.addAttribute("page", page);
        model.addAttribute("items", items);
        return "index";
    }

}
