package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.mortgage;

import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.BankingProduct;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.transactions.Transaction;

import java.util.ArrayList;

public interface MortgageRepository {

    ArrayList<Mortgage> obtainMortgages();
    Mortgage obtainMortgage(String codeProduct);
    void deleteMortgage(String codeProduct);
    void saveMortgage(Mortgage mortgage);
    void  updateMortgage(Mortgage mortgage);






}
