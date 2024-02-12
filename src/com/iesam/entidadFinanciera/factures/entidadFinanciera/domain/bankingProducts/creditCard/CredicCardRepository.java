package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.creditCard;

import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.fixedTermDeposit.FixedTermDeposit;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.transactions.Transaction;

import java.util.ArrayList;

public interface CredicCardRepository {

    ArrayList<CredicCard> obtainCredicCards();
    Transaction obtainCredicCard(String codeProduct);
    void deleteCredicCard(String codeProduct);
    void saveCredicCard(FixedTermDeposit fixedTermDeposit);
    void  updateCredicCard(FixedTermDeposit fixedTermDeposit);


}
