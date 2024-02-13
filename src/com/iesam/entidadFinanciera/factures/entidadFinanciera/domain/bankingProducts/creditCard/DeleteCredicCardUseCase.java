package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.creditCard;

public class DeleteCredicCardUseCase {
    private  CredicCardRepository credicCardRepository;

    public DeleteCredicCardUseCase(CredicCardRepository credicCardRepository) {
        this.credicCardRepository = credicCardRepository;
    }
    public void execute(String codeProduct){
        this.credicCardRepository.deleteCredicCard(codeProduct);
    }
}
