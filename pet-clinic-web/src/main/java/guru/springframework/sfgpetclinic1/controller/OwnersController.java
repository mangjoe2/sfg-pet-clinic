package guru.springframework.sfgpetclinic1.controller;

import guru.springframework.sfgpetclinic1.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnersController {

    private final OwnerService ownerService;

    public OwnersController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/owners", "/Owners", "/owner", "/Owner", "/owner/index.html"})
    public String listOfOwners(Model model){

        model.addAttribute("owner", ownerService.findAll());
        return "owner/index";
    }
}
