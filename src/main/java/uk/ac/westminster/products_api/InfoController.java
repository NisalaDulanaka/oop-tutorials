package uk.ac.westminster.products_api;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import uk.ac.westminster.products_api.dto.RegisterInput;

@RestController
public class InfoController {
    @GetMapping("/info")
    public String getInfo() {
        return "This is the test application created for week 1 tutorial";
    }

    @PostMapping("/register")
    public String register(@Valid @RequestBody RegisterInput input) {
        return String.format("successful request: %s %s", input.name(), input.email());
    }
}
