package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts;

public class GetBankingProductUseCase {

    private BankingProductRepository bankingProductRepository;

    public GetBankingProductUseCase(BankingProduct bankingProduct) {
        this.bankingProductRepository = bankingProductRepository;
    }
    public BankingProduct  execute(String codeProduct){

        return   this.bankingProductRepository.obtainBankingProduct(codeProduct);

    }
}
