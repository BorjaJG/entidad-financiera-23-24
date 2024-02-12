package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.transactions;

public class SaveTransactionUseCase {

    private  TransactionRepository transactionRepository;


    public SaveTransactionUseCase(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public  void execute(Transaction transaction){
        this.transactionRepository.saveTransaction(transaction);

    }



}
