package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankAccount;

import java.util.ArrayList;

public class GetBankAccountsUseCase {

private  BankAccountRepository bankAccountRepository;

    public GetBankAccountsUseCase(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }

    public ArrayList<BankAccount> execute(){
        return bankAccountRepository.obtainBankAccounts();
    }





}
