package fr.umontpellier.fds.m2.Controller;

import fr.umontpellier.fds.m2.Model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Map;


@Controller
public class RegistrationController {
    @GetMapping("registration")
    public String getRegistration(@ModelAttribute("registration") Registration registration){
        return "registration";
    }

    @PostMapping("registration")
    public String addRegistration(@Valid
                                      @ModelAttribute("registration")
                                              Registration registration,
                                  BindingResult result){
        if(result.hasErrors()) return "registration";

        System.out.println("Registration : " + registration.getName());
        System.out.println("Registration : " + registration.getEmail());
        return "redirect:registration";
    }

    @GetMapping("home")
    public String getRegistration(Map<String, Object> model){
        model.put("message", "Fantastic Thymeleaf!!!");
        return "home";
    }
}
