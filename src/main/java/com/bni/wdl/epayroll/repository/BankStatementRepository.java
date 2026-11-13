package com.bni.wdl.epayroll.repository;

import com.bni.wdl.epayroll.model.entity.BankStatement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BankStatementRepository extends JpaRepository<BankStatement, Long> {

    Optional<BankStatement> findBankStatementByCompanyAccountNumber(String companyAccountNumber);
}
