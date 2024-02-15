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
        for (Transaction transaction : localTransaction) {
            if (transaction.getIdTransaction().equals(idTransaction)) {
                return transaction;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Transaction> obtainTransactions() {
        return localTransaction;
    }

    @Override
    public void deleteTransaction(String idTransaction) {
        for (int i = 0; i<localTransaction.size();i++){
            if (localTransaction.get(i).getIdTransaction().equals(idTransaction)){
                localTransaction.remove(i);
            }
        }
    }

    @Override
    public void saveTransaction(Transaction transaction) {
        localTransaction.add(transaction);
    }

    @Override
    public void updateTransaction(Transaction transaction) {
        deleteTransaction(transaction.getIdTransaction());
        saveTransaction(transaction);

    }

    private void initData() {
        localTransaction.add(new Transaction(50,"Transaction 1"));
        localTransaction.add(new Transaction(-30,"Transaction 2"));

    }

    public static TransactionRepository newInstance(){
        if (instance == null){
            instance = new TrasactionDataRepository();
        }
        return instance;
    }


}
