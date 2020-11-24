package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import model.user;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @RequestMapping("/home")
    public String fragmentExample() {
        return "my-page";
    }

}
