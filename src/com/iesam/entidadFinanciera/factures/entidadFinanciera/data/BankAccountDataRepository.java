package com.iesam.entidadFinanciera.factures.entidadFinanciera.data;

import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankAccount.BankAccount;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankAccount.BankAccountRepository;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.transactions.Transaction;

import java.util.ArrayList;

public class BankAccountDataRepository implements BankAccountRepository {
    @Override
    public ArrayList<BankAccount> obtainBankAccounts() {
        return null;
    }

    @Override
    public Transaction obtainBankAccount(String codeBankAccount) {
        return null;
    }

    @Override
    public void deleteBankAccount(String codeBankAccount) {

    }

    @Override
    public void saveBankAccount(BankAccount bankAccount) {

    }

    @Override
    public void updateBankAccount(BankAccount bankAccount) {

    }
}
