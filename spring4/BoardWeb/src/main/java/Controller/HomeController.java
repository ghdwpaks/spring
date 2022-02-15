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
        System.out.println("entered main");
        return "indexmain";
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

    @RequestMapping(value="/views/detail")
    public String DetailMain1() {
        System.out.println("detailmain1 에 진입하셨습니다");
        return "detail";
    }
    @RequestMapping(value="views/detail")
    public String DetailMain3() {
        System.out.println("detailmain3 에 진입하셨습니다");
        return "detail";
    }
    @RequestMapping(value="/detail")
    public String DetailMain4() {
        System.out.println("detailmain4 에 진입하셨습니다");
        return "detail";
    }
    @RequestMapping(value="detail")
    public String DetailMain5() {
        System.out.println("detailmain5 에 진입하셨습니다");
        return "detail";
    }


}
