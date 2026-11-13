package com.bni.wdl.epayroll.model.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "payroll_transaction")
public class PayrollTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "transaction_id")
    private String transactionId;

    @Column(name = "recipient_account_number")
    private String recipientAccountNumber;

    @Column(name = "recipient_account_name")
    private String recipientAccountName;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "transaction_amount")
    private BigDecimal transactionAmount;

    @Column(name = "transaction_date")
    private Date transactionDate;

    @Column(name = "description")
    private String description;

    @Column(name = "sender_account_number")
    private String senderAccountNumber;
}
