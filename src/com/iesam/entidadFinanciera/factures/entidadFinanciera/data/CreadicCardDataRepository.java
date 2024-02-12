package com.iesam.entidadFinanciera.factures.entidadFinanciera.data;

import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.creditCard.CredicCard;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.creditCard.CredicCardRepository;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.fixedTermDeposit.FixedTermDeposit;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.transactions.Transaction;

import java.util.ArrayList;

public class CreadicCardDataRepository implements CredicCardRepository {
    @Override
    public ArrayList<CredicCard> obtainCredicCards() {
        return null;
    }

    @Override
    public Transaction obtainCredicCard(String codeProduct) {
        return null;
    }

    @Override
    public void deleteCredicCard(String codeProduct) {

    }

    @Override
    public void saveCredicCard(FixedTermDeposit fixedTermDeposit) {

    }

    @Override
    public void updateCredicCard(FixedTermDeposit fixedTermDeposit) {

    }
}
