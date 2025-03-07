package controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloControler {
    @GetMapping("/TEST")
    public String helloWorld(){
        return "Hello World!";
    }
}