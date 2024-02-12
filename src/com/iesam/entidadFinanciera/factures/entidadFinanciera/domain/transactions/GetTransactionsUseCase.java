package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.transactions;

import java.util.ArrayList;

public class GetTransactionsUseCase {

    private  TransactionRepository transactionRepository;

    public GetTransactionsUseCase(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }
    public   ArrayList<Transaction> execute(){
        return  transactionRepository.obtainTransactions();
    }



}
