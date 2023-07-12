package acc.handson.web.controller;


import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @GetMapping("/health")
    public String healthCheckAPI(){return "I'm healthy!";}
}
