package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankAccount;

import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.BankingProduct;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.transactions.Transaction;

import java.util.ArrayList;

public interface BankAccountRepository {


    ArrayList<BankAccount> obtainBankAccounts();
    BankAccount obtainBankAccount(String codeBankAccount);
    void deleteBankAccount(String codeBankAccount);
    void saveBankAccount(BankAccount bankAccount);
    void  updateBankAccount(BankAccount bankAccount);


}
