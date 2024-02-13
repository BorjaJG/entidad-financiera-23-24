package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankAccount;

public class GetBankAccountUseCase {

    private BankAccountRepository bankAccountRepository;

    public GetBankAccountUseCase(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }
    public  BankAccount execute(String idBankAccount){
        return this.bankAccountRepository.obtainBankAccount(idBankAccount);
    }

}
