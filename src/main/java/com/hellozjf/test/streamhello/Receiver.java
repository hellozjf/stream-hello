package com.hellozjf.test.streamhello;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

/**
 * @author hellozjf
 */
@Component
@EnableBinding(Sink.class)
@Slf4j
public class Receiver {

    @StreamListener(Sink.INPUT)
    public void receive(Person person) {
        log.info("Received: {}", person);
    }
}
