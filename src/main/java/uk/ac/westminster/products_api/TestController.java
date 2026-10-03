package uk.ac.westminster.products_api;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import uk.ac.westminster.products_api.dto.RegisterInput;

@RestController

@RequestMapping("/")
public class TestController {

    @GetMapping("/info")
    public String getInfo() {
        return "Info";
    }

    @GetMapping("/good-bye")
    public String getBye() {
        return "Good bye";
    }

    @PostMapping("/register")
    public String register(@Valid @RequestBody RegisterInput input) {
        return String.format("successful request: %s %s", input.name(), input.email());
    }
}
