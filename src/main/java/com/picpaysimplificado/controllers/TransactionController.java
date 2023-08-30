package com.picpaysimplificado.controllers;

import com.picpaysimplificado.Services.TransactionService;
import com.picpaysimplificado.domain.transaction.Transaction;
import com.picpaysimplificado.dtos.TransactionDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
    @Autowired
    private TransactionService transaction;

    @PostMapping
    public ResponseEntity<Transaction>createTransactions(@RequestBody  TransactionDTO transactionDTO) throws Exception {
        Transaction transaction = this.transaction.createTransaction(transactionDTO);
        return new ResponseEntity<>(transaction, HttpStatus.CREATED);

    }
}
