package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankAccount;

public class SaveBankAccountUseCase {

    private BankAccountRepository bankAccountRepository;

    public SaveBankAccountUseCase(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }
    public void execute(BankAccount bankAccount){
        this.bankAccountRepository.saveBankAccount(bankAccount);
    }
}
