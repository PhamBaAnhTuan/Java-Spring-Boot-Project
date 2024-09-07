package group2.baitap1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


// UserController.java
@Controller
public class UserController {

//    @GetMapping("/user")
//    public String getUserName(Model model) {
//        model.addAttribute("user", new User());
//        return "user";
//    }

    @GetMapping("/addUser")
    public String showAddUserForm(Model model) {
        // Create an empty User object to bind form data
        model.addAttribute("user", new User());
        return "addUser";  // Returns the HTML form for adding a user
    }


    @PostMapping("/addUser")
    public String addUser(@ModelAttribute User user, Model model) {
        model.addAttribute("user", user);
        return "user";  // Redirects to a confirmation page
    }
}

