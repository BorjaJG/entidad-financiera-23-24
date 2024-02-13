package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.creditCard;

import java.util.ArrayList;

public interface CredicCardRepository {

    ArrayList<CredicCard> obtainCredicCards();
    CredicCard obtainCredicCard(String codeProduct);
    void deleteCredicCard(String codeProduct);
    void saveCredicCard(CredicCard fixedTermDeposit);
    void  updateCredicCard(CredicCard fixedTermDeposit);


}
