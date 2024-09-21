package com.group2.baitap4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/user")
    public String detailPage(Model model) {
        model.addAttribute("userName", "Tuan Pham");
        return "user";
    }

    @GetMapping("/addUser")
    public String addUser(Model model) {
        model.addAttribute("user", new UserModel());
        return "addUser";
    }

    @PostMapping("/addUser")
    public String addUser(@ModelAttribute("user") UserModel user) {
        System.out.println("First Name: " + user.getFirstName());
        System.out.println("Last Name: " + user.getLastName());

        userService.saveOrUpdate(user);
        return "redirect:/userList";
    }
}
