package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

/**
 * Week 1 starter controller.
 * Already provided:
 *   GET /hello   -> a simple greeting
 *   GET /status  -> a simple status message
 */

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello from Spring Boots!";
    }

    @GetMapping("/status")
    public String status(){
        return "API running -" + LocalDate.now().toString();
    }

    @GetMapping("/good-bye")
    public String getBye() {
        return "Good bye";
    }
}
