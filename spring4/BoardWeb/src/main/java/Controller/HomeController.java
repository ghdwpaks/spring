package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping(value="/")
    public String main() {
        return "index";
    }

    @RequestMapping(value = "detail")
    public String DetailMain() {
        return "detail";
    }
}
