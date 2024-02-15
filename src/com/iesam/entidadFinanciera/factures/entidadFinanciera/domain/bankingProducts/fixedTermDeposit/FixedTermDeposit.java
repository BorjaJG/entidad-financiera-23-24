package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.fixedTermDeposit;

import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.BankingProduct;

public class FixedTermDeposit extends BankingProduct {


   private  final  String interest;
   private final  String duration;

    public FixedTermDeposit(String codeProduct, String name, String description, String interest, String duration) {
        super(codeProduct, name, description);
        this.interest = interest;
        this.duration = duration;
    }

    public String getInterest() {
        return interest;
    }

    public String getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "FixedTermDeposit{" +
                "interest='" + interest + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
