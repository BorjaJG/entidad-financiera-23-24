package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.creditCard;

import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.BankingProduct;

public class CredicCard extends BankingProduct {

    private  final  String expirationDateCard;
    private  final  String numCard;

    public CredicCard(String codeProduct, String name, String description, String expirationDateCard, String numCard) {
        super(codeProduct, name, description);
        this.expirationDateCard = expirationDateCard;
        this.numCard = numCard;
    }

    public String getExpirationDateCard() {
        return expirationDateCard;
    }

    public String getNumCard() {
        return numCard;
    }

    @Override
    public String toString() {
        return "CredicCard{" +
                "expirationDateCard='" + expirationDateCard + '\'' +
                ", numCard='" + numCard + '\'' +
                '}';
    }
}
