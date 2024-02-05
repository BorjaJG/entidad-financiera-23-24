package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts;

public class BankingProduct {

    private  final  String codeProduct;
    private  final  String name;
    private  final  String description;

    public BankingProduct(String codeProduct, String name, String description) {
        this.codeProduct = codeProduct;
        this.name = name;
        this.description = description;
    }

    public String getCodeProduct() {
        return codeProduct;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "BankingProduct{" +
                "codeProduct='" + codeProduct + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
