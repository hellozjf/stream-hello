package com.hellozjf.test.streamhello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hellozjf
 */
@RestController
@EnableBinding(Source.class)
public class SenderController {

    @Autowired
    private Source source;

    @PostMapping("/send")
    public void send(Person person) {
        source.output().send(MessageBuilder.withPayload(person).build());
    }
}
