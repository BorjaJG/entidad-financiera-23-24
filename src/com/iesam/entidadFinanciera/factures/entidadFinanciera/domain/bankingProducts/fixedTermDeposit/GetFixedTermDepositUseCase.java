package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.fixedTermDeposit;

public class GetFixedTermDepositUseCase {
    private FixedTermDepositRepository fixedTermDepositRepository;

    public GetFixedTermDepositUseCase(FixedTermDepositRepository fixedTermDepositRepository) {
        this.fixedTermDepositRepository = fixedTermDepositRepository;
    }
    public FixedTermDeposit execute(String codeProduct){
        return   this.fixedTermDepositRepository.obtainFixedTermDeposit(codeProduct);
    }
}
