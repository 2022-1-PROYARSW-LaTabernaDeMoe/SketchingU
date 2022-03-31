package SketchingU.SketchingU.Controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginControler {

    @GetMapping({"/","/login"})
    public String index() {
        return "index";
    }

    @GetMapping({"/menu"})
    public String menu() {
        return "menu";
    }
}
