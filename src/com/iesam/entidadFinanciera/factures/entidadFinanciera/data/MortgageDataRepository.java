package com.iesam.entidadFinanciera.factures.entidadFinanciera.data;

import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.mortgage.MortgageRepository;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.mortgage.Mortgage;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.mortgage.MortgageRepository;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.transactions.Transaction;

import java.util.ArrayList;

public class MortgageDataRepository implements  MortgageRepository  {


    @Override
    public ArrayList<Mortgage> obtainMortgages() {
        return null;
    }

    @Override
    public Mortgage obtainMortgage(String codeProduct) {
        return null;
    }

    @Override
    public void deleteMortgage(String codeProduct) {

    }

    @Override
    public void saveMortgage(Mortgage mortgage) {

    }

    @Override
    public void updateMortgage(Mortgage mortgage) {

    }
}
