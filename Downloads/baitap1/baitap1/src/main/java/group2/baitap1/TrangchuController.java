package group2.baitap1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TrangchuController {
    @GetMapping("/trangchu")
    public String toString() {
        return "trangchu";
    }
}
