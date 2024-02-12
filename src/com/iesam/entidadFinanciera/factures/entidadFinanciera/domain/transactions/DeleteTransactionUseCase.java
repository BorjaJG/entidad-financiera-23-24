package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.transactions;

public class DeleteTransactionUseCase {

    private  TransactionRepository transactionRepository;

    public DeleteTransactionUseCase(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }



    public  void  execute(String idTransaction){
        transactionRepository.deleteTransaction(idTransaction);
    }





}
