package fr.umontpellier.fds.m2.Controller;

import fr.umontpellier.fds.m2.Model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @GetMapping("/user")
    public User getUser(
            @RequestParam(value="prenom", defaultValue = "Elon") String prenom,
            @RequestParam(value="nom", defaultValue = "Ela") String nom,
            @RequestParam(value="age", defaultValue = "18") int age
    ){
        User user = new User(prenom, nom, age);

        return user;
    }

    @PostMapping("/user")
    public User postUser(@RequestBody User user){
        System.out.println("Prenom : " + user.getPrenom());

        return user;
    }

}
