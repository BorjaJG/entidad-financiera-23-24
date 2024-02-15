package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.mortgage;

import java.util.ArrayList;

public class GetMortgagesUseCase {

    private MortgageRepository mortgageRepository;

    public GetMortgagesUseCase(MortgageRepository mortgageRepository) {
        this.mortgageRepository = mortgageRepository;
    }

    public ArrayList<Mortgage> execute(){
        return this.mortgageRepository.obtainMortgages();
    }
}
