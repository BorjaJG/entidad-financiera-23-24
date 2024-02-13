package com.iesam.entidadFinanciera.factures.entidadFinanciera.data;

import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.transactions.Transaction;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.transactions.TransactionRepository;

import java.util.ArrayList;

public class TrasactionDataRepository  implements TransactionRepository {

    private static TransactionRepository instance = null;

    private ArrayList<Transaction> localTransaction = new ArrayList<>();
    public  TrasactionDataRepository() {
        initData();
    }


    @Override
    public Transaction obtainTransaction(String idTransaction) {
        return null;
    }

    @Override
    public ArrayList<Transaction> obtainTransactions() {
        return null;
    }

    @Override
    public void deleteTransaction(String idTransaction) {

    }

    @Override
    public void saveTransaction(Transaction transaction) {

    }

    @Override
    public void updateTransaction(Transaction transaction) {

    }

    private void initData() {
        localTransaction.add(new Transaction(333,"qeqw"));

    }
}
