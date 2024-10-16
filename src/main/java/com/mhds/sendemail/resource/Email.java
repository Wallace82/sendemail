package com.mhds.sendemail.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Email {
    @GetMapping("/send")
    public ResponseEntity<?> send(){
        return ResponseEntity.ok("Enviado comsucesso");
    }
}
