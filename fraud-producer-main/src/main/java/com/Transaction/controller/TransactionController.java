package com.Transaction.controller;

import com.Transaction.model.Transaction;
import com.Transaction.repository.TransactionRepository;
import com.Transaction.service.KafkaProducerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    private final TransactionRepository repo;
    private final KafkaProducerService producer;

    public TransactionController(TransactionRepository repo, KafkaProducerService producer) {
        this.repo = repo;
        this.producer = producer;
    }

    @PostMapping
    public String createTransaction(@RequestBody Transaction txn) {
        repo.save(txn);
        producer.sendTransaction(txn);
        return "Transaction received and sent to Kafka.";
    }
}
