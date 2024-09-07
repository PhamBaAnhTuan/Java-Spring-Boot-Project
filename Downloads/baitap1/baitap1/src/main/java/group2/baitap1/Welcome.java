package group2.baitap1;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Welcome {
    @GetMapping("/trangchu")
    public String toString() {
        return "Lop ST21A1B - Chuyen nganh IoT";
    }
}
