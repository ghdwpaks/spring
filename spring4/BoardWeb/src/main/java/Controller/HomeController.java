package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

@Controller
public class HomeController {
    @RequestMapping(value="/")
    public String main() {
        return "index";
    }

    @RequestMapping(value="/ajax_test")
    public String AjaxMain() {
        return "/views/ajax_test.jsp";
    }
    @GetMapping("/ajax")
    public String ajax(Locale locale, Model model) {
        System.out.println("ajax 에 접속을 시도하셨습니다.");
        return "/views/ajax_test";
    }

    @RequestMapping(value = "detail")
    public String DetailMain() {
        return "detail";
    }
}
