package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.creditCard;

import java.util.ArrayList;

public class GetCredicCardsUseCase {

    private  CredicCardRepository credicCardRepository;

    public GetCredicCardsUseCase(CredicCardRepository credicCardRepository) {
        this.credicCardRepository = credicCardRepository;
    }

    public ArrayList<CredicCard> execute(){

        return this.credicCardRepository.obtainCredicCards();

    }


}
