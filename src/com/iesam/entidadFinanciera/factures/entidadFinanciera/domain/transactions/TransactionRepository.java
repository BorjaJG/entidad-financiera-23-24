package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.transactions;

import java.util.ArrayList;

public interface TransactionRepository {
    ArrayList<Transaction> obtainTransactions();
    Transaction obtainTransaction(String idTransaction);
    void deleteTransaction(String idTransaction);
    void saveTransaction(Transaction transaction);
    void  updateTransaction(Transaction transaction);





}
