package com.Transaction.service;

import com.Transaction.model.Transaction;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    private final KafkaTemplate<String, Transaction> kafkaTemplate;

    public KafkaProducerService(KafkaTemplate<String, Transaction> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendTransaction(Transaction txn) {
        kafkaTemplate.send("transactions", txn);
    }
}
