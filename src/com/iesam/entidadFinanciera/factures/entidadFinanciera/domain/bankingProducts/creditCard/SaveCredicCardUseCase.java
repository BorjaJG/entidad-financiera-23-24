package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.creditCard;

public class SaveCredicCardUseCase {

    private CredicCardRepository credicCardRepository;

    public SaveCredicCardUseCase(CredicCardRepository credicCardRepository) {
        this.credicCardRepository = credicCardRepository;
    }
    public void  execute(CredicCard credicCard){
        this.credicCardRepository.saveCredicCard(credicCard);
    }
}
