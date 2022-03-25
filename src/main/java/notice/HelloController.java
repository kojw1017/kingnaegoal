package notice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
public class HelloController {
    @GetMapping("/api/hello")
    public String hello() {
        return 
        "안녕 산내골 게시판에 온걸 환영해~ 현재 시간은 " + new Date() + "\n";

    }
}