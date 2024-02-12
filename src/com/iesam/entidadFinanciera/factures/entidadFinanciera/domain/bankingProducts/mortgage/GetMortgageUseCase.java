package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.mortgage;

public class GetMortgageUseCase {
    private MortgageRepository mortgageRepository;

    public GetMortgageUseCase(MortgageRepository mortgageRepository) {
        this.mortgageRepository = mortgageRepository;
    }

    public  Mortgage execute(String codeProduct){
        return this.mortgageRepository.obtainMortgage(codeProduct);
    }

}
