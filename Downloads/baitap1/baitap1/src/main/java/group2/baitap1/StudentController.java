package group2.baitap1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    @GetMapping("/addStudent")
    public String addStudent(Model model) {
        model.addAttribute("student", new Student());
        return "addStudent";
    }

    @PostMapping("/addStudent")
    public String addStudent(@ModelAttribute Student student, Model model) {
        model.addAttribute("student", student);
        return "student";  // Redirects to a confirmation page
    }
}
