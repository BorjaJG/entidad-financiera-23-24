package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.fixedTermDeposit;

import java.util.ArrayList;

public class GetFixedTermDepositsUseCase {
    private FixedTermDepositRepository fixedTermDepositRepository;

    public GetFixedTermDepositsUseCase(FixedTermDepositRepository fixedTermDepositRepository) {
        this.fixedTermDepositRepository = fixedTermDepositRepository;
    }
    public ArrayList<FixedTermDeposit> execute(){
        return this.fixedTermDepositRepository.obtainFixedTermDeposits();
    }
}
