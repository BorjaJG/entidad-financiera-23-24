package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.fixedTermDeposit;

public class UpdateFixedTermDepositUseCase {
    private  FixedTermDepositRepository fixedTermDepositRepository;

    public UpdateFixedTermDepositUseCase(FixedTermDepositRepository fixedTermDepositRepository) {
        this.fixedTermDepositRepository = fixedTermDepositRepository;
    }
    public void execute(FixedTermDeposit fixedTermDeposit){
        this.fixedTermDepositRepository.updateFixedTermDeposit(fixedTermDeposit);
    }
}
