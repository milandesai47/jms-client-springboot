package com.jms.jmstest;

import java.util.concurrent.CountDownLatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;

public class Receiver {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(Receiver.class);

    private CountDownLatch latch = new CountDownLatch(1);

    public CountDownLatch getLatch() {
        return latch;
    }

    @JmsListener(destination = "helloworld.q1")
    public void receive1(String message) {
        LOGGER.info("received message='{}'", message);
        latch.countDown();
    }
    @JmsListener(destination = "helloworld.q2")
    public void receive2(String message) {
        LOGGER.info("received message='{}'", message);
        latch.countDown();
    }
}
