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
@Table(name = "bank_statement")
public class BankStatement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "company_account_number")
    private String companyAccountNumber;

    @Column(name = "transaction_id", nullable = false)
    private String transactionId;

    @Column(name = "transaction_date")
    private Date transactionDate;

    @Column(name = "description")
    private String description;

    @Column(name = "transaction_amount")
    private BigDecimal transactionAmount;

    @Column(name = "balance")
    private BigDecimal balance;

}
