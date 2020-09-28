package guru.springframework.sfgpetclinic1.controller;

import guru.springframework.sfgpetclinic1.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnersController {

    private final OwnerService ownerService;

    public OwnersController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/index", "/index.html","/find"})
    public String listOfOwners(Model model){

        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }
//    @RequestMapping("/find")
//    public String findOwners(){
//
//        return "notimplemented";
//    }
}
