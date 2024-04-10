package com.example.kafkaconsumerdatabase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaDatabaseConsumere {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaDatabaseConsumere.class);

    @KafkaListener(topics = "wikimedia_recentchange", groupId = "myGroup")
    public void consume(String eventMessage) {
        LOGGER.info(String.format("Message received-> %s",eventMessage));

    }


}
