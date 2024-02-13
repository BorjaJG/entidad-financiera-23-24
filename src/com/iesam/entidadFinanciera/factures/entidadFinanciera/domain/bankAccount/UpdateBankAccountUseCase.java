package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankAccount;

public class UpdateBankAccountUseCase {

    private BankAccountRepository bankAccountRepository;

    public UpdateBankAccountUseCase(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }
    public void execute(BankAccount bankAccount){
        this.bankAccountRepository.updateBankAccount(bankAccount);
    }
}
