package guru.springframework.sfgpetclinic1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnersController {

    @RequestMapping({"/owners", "/Owners", "/owner", "/Owner", "/owner/index.html"})
    public String listOfOwners(){

        return "owner/index";
    }
}
