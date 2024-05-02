package com.example.project_methodo.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoMVCController {
    @GetMapping("/getMessage")
    public ResponseEntity<String> displayMessage() {
        // return "Hello World";
        return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }
}