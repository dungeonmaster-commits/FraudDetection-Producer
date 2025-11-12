package com.Transaction.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String transactionId;
    private String userId;
    private double amount;
    private String location;
    private LocalDateTime timestamp;
    private String ipAddress;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTransactionId() { return transactionId; }
    public void setTransactionId(String transactionId) { this.transactionId = transactionId; }

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }

    public String getIpAddress() { return ipAddress; }
    public void setIpAddress(String ipAddress) { this.ipAddress = ipAddress; }
}
