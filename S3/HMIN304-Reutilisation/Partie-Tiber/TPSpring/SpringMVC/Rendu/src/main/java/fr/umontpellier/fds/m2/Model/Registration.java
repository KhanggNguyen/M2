package fr.umontpellier.fds.m2.Model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class Registration {
    @NotEmpty(message = "Name must not be empty")
    private String name;
    @NotEmpty(message = "Email must not be valid")
    @Email(message= "Email should be valid")
    private String email;

    public Registration(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

}
