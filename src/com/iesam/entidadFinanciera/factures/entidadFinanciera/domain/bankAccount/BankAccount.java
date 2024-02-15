package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankAccount;

import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.BankingProduct;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person.Person;

public class BankAccount {

    private  final  String idBankAccount;
    private final  String nameBankAccount;

    private  final Person person;

    private  final BankingProduct bankingProduct;

    public BankAccount(String idBankAccount, String nameBankAccount, Person person, BankingProduct bankingProduct) {
        this.idBankAccount = idBankAccount;
        this.nameBankAccount = nameBankAccount;
        this.person = person;
        this.bankingProduct = bankingProduct;
    }

    public String getIdBankAccount() {
        return idBankAccount;
    }

    public String getNameBankAccount() {
        return nameBankAccount;
    }

    public Person getPerson() {
        return person;
    }

    public BankingProduct getBankingProduct() {
        return bankingProduct;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "idBankAccount='" + idBankAccount + '\'' +
                ", nameBankAccount='" + nameBankAccount + '\'' +
                ", person=" + person +
                ", bankingProduct=" + bankingProduct +
                '}';
    }
}
