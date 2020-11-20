package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import model.user;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @RequestMapping("/user")
    public String showUserList(Model model) {
        List<user> userList = new ArrayList<>();
        userList.add(new user(0, "Ken", "American"));
        userList.add(new user(1, "James", "English"));
        userList.add(new user(2, "Bob", "France"));
        userList.add(new user(3, "Andy", "Russia"));

        model.addAttribute("userList", userList);
        return "thymeleaf-variable-example";
    }

}
