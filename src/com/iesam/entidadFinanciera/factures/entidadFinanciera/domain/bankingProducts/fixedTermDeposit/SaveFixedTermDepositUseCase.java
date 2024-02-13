package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.fixedTermDeposit;

public class SaveFixedTermDepositUseCase {

    private FixedTermDepositRepository fixedTermDepositRepository;

    public SaveFixedTermDepositUseCase(FixedTermDepositRepository fixedTermDepositRepository) {
        this.fixedTermDepositRepository = fixedTermDepositRepository;
    }
    public  void  execute(FixedTermDeposit fixedTermDeposit){
        this.fixedTermDepositRepository.saveFixedTermDeposit(fixedTermDeposit);
    }
}
