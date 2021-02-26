package com.jms.jmstest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;

public class Sender {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(Sender.class);

    @Autowired
    private JmsTemplate jmsTemplate;

    public void send(String message) {
        LOGGER.info("sending message='{}'", message);
        jmsTemplate.convertAndSend("helloworld.q1", message);
        jmsTemplate.convertAndSend("helloworld.q2",message);
    }
}
