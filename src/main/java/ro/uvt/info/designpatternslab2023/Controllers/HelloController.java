package ro.uvt.info.designpatternslab2023;

import com.example.splabeugenmiclea.Classes.difexample.ClientComponent;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class HelloController {


    @GetMapping("/")
    public String hello() {
        return "Hello from Spring Boot";
    }



}
