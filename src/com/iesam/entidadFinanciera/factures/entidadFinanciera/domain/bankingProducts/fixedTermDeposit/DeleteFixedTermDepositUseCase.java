package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.fixedTermDeposit;

public class DeleteFixedTermDepositUseCase {

    private FixedTermDepositRepository fixedTermDepositRepository;

    public DeleteFixedTermDepositUseCase(FixedTermDepositRepository fixedTermDepositRepository) {
        this.fixedTermDepositRepository = fixedTermDepositRepository;
    }
    public void  execute(String codeProduct){

        this.fixedTermDepositRepository.deleteFixedTermDeposit(codeProduct);


    }
}
