package SketchingU.SketchingU.Controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginControler {

    @RequestMapping("/login")
    public String Index(Model model) {
        return "login";
    }
}
