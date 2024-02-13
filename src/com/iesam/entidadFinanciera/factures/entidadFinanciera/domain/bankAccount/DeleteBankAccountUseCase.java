package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankAccount;

public class DeleteBankAccountUseCase {
    private BankAccountRepository bankAccountRepository;

    public DeleteBankAccountUseCase(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }
    public void execute(String idBankAccount){

        this.bankAccountRepository.deleteBankAccount(idBankAccount);

    }
}
