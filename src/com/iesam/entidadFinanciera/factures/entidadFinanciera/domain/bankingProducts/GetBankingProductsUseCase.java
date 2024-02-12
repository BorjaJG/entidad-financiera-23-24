package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts;

import java.util.ArrayList;

public class GetBankingProductsUseCase {


    private BankingProductRepository bankingProductRepository;

    public GetBankingProductsUseCase(BankingProductRepository bankingProductRepository) {
        this.bankingProductRepository = bankingProductRepository;
    }
    public ArrayList<BankingProduct> execute(){

        return this.bankingProductRepository.obtainBankingProducts();
    }


}
