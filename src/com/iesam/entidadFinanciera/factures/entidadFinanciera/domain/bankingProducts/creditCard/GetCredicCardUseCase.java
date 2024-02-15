package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.creditCard;

public class GetCredicCardUseCase {

    private CredicCardRepository credicCardRepository;

    public GetCredicCardUseCase(CredicCardRepository credicCardRepository) {
        this.credicCardRepository = credicCardRepository;
    }
    public CredicCard execute(String codeProduct){
        return this.credicCardRepository.obtainCredicCard(codeProduct);
    }
}
