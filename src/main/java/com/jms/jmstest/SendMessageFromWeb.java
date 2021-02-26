package com.jms.jmstest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class SendMessageFromWeb {

    @Autowired
    private Sender sender;

    @GetMapping("/send")
    public void sendMessage(@RequestBody(required = false) String message){
        if (message != null && !message.trim().isEmpty())
            sender.send(message);
        else
            sender.send("Hello World from web endpoint!");
    }
}
