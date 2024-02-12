package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.transactions;

public class UpdateTransactionUseCase {

    private  TransactionRepository transactionRepository;

    public UpdateTransactionUseCase(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public void execute(Transaction transaction){

       this.transactionRepository.updateTransaction(transaction);

    }




}
