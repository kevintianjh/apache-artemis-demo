package com.kevintian.artemisdemo.controller;

import com.kevintian.artemisdemo.service.DispatcherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private DispatcherService dispatcherService;

    @PostMapping("/send")
    public ResponseEntity<String> send(@RequestBody String message) {
        dispatcherService.sendMessage(message);
        return ResponseEntity.ok("Message sent: " + message);
    }
}
