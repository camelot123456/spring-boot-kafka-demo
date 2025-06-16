package com.example.kafka_demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

  @KafkaListener(
    topics = "powB",
    groupId = "groupId"
  )
  void listener(String data) {
    System.out.println("Listeners received: " + data);;
  }
}
