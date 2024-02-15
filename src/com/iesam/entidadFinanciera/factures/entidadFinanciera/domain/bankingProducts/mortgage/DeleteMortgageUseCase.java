package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.mortgage;

public class DeleteMortgageUseCase {

    private MortgageRepository mortgageRepository;

    public DeleteMortgageUseCase(MortgageRepository mortgageRepository) {
        this.mortgageRepository = mortgageRepository;
    }

    public void  execute(String codeProduct){
        this.mortgageRepository.deleteMortgage(codeProduct);
    }


}
