package SketchingU.SketchingU.Controler;
import SketchingU.SketchingU.Model.User;
import SketchingU.SketchingU.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserControler {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("list",userService.getAllUsers());
        return "index";
    }
    @GetMapping("/save/{email}")
    public String showSave(@PathVariable("email") String email, Model model){
        if(email != null){
            model.addAttribute("user",userService.get(email));
        }
        return "save";
    }

    /**
     *
     * @param user
     * @param model
     * @return redirecciona a index mostrando que el usuario ha sido guardado
     */
    @PostMapping("/save")
    public String save(User user, Model model){

        userService.save(user);
        return "redirect:/";
    }

    public String delete(@PathVariable("email") String email, Model model){
        userService.delete(email);

        return "redirect:/";
    }

}
