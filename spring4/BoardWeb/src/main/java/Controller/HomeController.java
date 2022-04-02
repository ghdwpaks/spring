package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping(value="/")
    public String main() {
        return "index";
    }

    @RequestMapping(value="/ajax_test")
    public String AjaxMain() {
        return "ajax_test";
    }


    @RequestMapping(value = "detail")
    public String DetailMain() {
        return "detail";
    }
}
