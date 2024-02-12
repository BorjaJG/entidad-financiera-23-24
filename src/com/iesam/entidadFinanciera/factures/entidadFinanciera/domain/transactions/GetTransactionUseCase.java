package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.transactions;

import java.util.ArrayList;

public class GetTransactionUseCase {

    private  TransactionRepository transactionRepository;

    public GetTransactionUseCase(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }


    public  Transaction execute(String idTransaction){

        return  this.transactionRepository.obtainTransaction(idTransaction);

    }





}
