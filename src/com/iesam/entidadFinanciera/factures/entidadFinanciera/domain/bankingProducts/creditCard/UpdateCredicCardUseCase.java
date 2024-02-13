package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.creditCard;

public class UpdateCredicCardUseCase {
    private  CredicCardRepository credicCardRepository;

    public UpdateCredicCardUseCase(CredicCardRepository credicCardRepository) {
        this.credicCardRepository = credicCardRepository;
    }
    public void execute(CredicCard credicCard){
        this.credicCardRepository.updateCredicCard(credicCard);
    }
}
