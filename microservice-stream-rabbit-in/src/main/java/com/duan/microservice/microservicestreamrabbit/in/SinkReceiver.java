package com.duan.microservice.microservicestreamrabbit.in;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @author duanjw
 * @version 1.0
 * @date 2018/1/18 14:59
 */
@EnableBinding(Sink.class)
public class SinkReceiver {
    private static Logger logger = LoggerFactory.getLogger(SinkReceiver.class);
    @StreamListener(Sink.INPUT)
    public void receive(Object playload) {
        System.out.println("Received:"+playload);
    }
}
