package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.mortgage;

import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.BankingProduct;

public class Mortgage extends BankingProduct {



    private  final  String  start;
    private  final  String  end;
    private  final  String   loanAmount;

    public Mortgage(String codeProduct, String name, String description, String start, String end, String loanAmount) {
        super(codeProduct, name, description);
        this.start = start;
        this.end = end;
        this.loanAmount = loanAmount;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public String getLoanAmount() {
        return loanAmount;
    }

    @Override
    public String toString() {
        return "Mortgage{" +
                "start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", loanAmount='" + loanAmount + '\'' +
                '}';
    }
}
