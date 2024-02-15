package com.iesam.entidadFinanciera.factures.entidadFinanciera.data;

import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankAccount.BankAccount;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankAccount.BankAccountRepository;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.BankingProduct;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person.Person;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.transactions.Transaction;

import java.util.ArrayList;

public class BankAccountDataRepository implements BankAccountRepository {

    private static BankAccountRepository instance =null;
    private  ArrayList<BankAccount> localBankAccount = new ArrayList<>();
    public      BankAccountDataRepository(){
        initDate();

    }








    @Override
    public ArrayList<BankAccount> obtainBankAccounts() {
        return null;
    }

    @Override
    public BankAccount obtainBankAccount(String codeBankAccount) {
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


    private void initDate(){

        Person person1 = new Person("John", "Doe","");
        BankingProduct product1 = new BankingProduct("", "","");
        localBankAccount.add(new BankAccount("","",person1,product1));




    }
    public static BankAccountRepository newInstance(){
        if (instance == null){
            instance = new BankAccountDataRepository();
        }
        return instance;
    }



}
