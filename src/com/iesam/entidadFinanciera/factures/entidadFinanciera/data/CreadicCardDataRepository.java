package com.iesam.entidadFinanciera.factures.entidadFinanciera.data;

import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.creditCard.CredicCard;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.creditCard.CredicCardRepository;

import java.util.ArrayList;

public class CreadicCardDataRepository implements CredicCardRepository {
    @Override
    public ArrayList<CredicCard> obtainCredicCards() {
        return null;
    }

    @Override
    public CredicCard obtainCredicCard(String codeProduct) {
        return null;
    }

    @Override
    public void deleteCredicCard(String codeProduct) {

    }

    @Override
    public void saveCredicCard(CredicCard credicCard) {

    }

    @Override
    public void updateCredicCard(CredicCard credicCard) {

    }
}
