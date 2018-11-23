package com.kolema.infrabbitmq.rabbit.producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

@Component
public class HelloSender1 {

    @Resource
    private AmqpTemplate rabbitTemplate;

    public void send(String sendMsg) {
        rabbitTemplate.convertAndSend("helloQueue", sendMsg);
    }

}
