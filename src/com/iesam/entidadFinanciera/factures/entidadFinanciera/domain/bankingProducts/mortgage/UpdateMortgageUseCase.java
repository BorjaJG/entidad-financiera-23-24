package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.mortgage;

public class UpdateMortgageUseCase {

    private MortgageRepository mortgageRepository;

    public UpdateMortgageUseCase(MortgageRepository mortgageRepository) {
        this.mortgageRepository = mortgageRepository;
    }

    public void execute(Mortgage mortgage){

        this.mortgageRepository.updateMortgage(mortgage);

    }


}
