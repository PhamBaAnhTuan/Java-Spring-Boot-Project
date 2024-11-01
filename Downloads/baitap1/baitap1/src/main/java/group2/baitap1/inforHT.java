package group2.baitap1;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class inforHT {
    @GetMapping("/trangchuHT")
    public String toString() {
        return "Nguyen Phan Hoa Thuan - Lop ST21A1B - Chuyen nganh IoT - Dai hoc Dong A";
    }
}
