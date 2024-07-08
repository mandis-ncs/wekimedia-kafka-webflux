package com.mand.kafka_demo.consumer;

import com.mand.kafka_demo.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "newTopic", groupId = "myGroup")
    public void consumeMessage(String message) {
      log.info(String.format("Consuming the message from newTopic:: %s", message));
    }

    @KafkaListener(topics = "newTopic", groupId = "myGroup")
    public void consumeJsonMessage(Student student) {
      log.info(String.format("Consuming the message from newTopic:: %s", student.toString()));
    }

}
