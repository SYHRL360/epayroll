package com.bni.wdl.epayroll.repository;

import com.bni.wdl.epayroll.model.entity.PayrollTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PayrollTransactionRepository extends JpaRepository<PayrollTransaction, Long> {

    Optional<PayrollTransaction> findPayrollTransactionByTransactionId(String transactionId);
}
