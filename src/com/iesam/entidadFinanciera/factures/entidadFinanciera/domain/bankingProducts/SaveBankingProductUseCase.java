package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts;

public class SaveBankingProductUseCase {

    private BankingProductRepository bankingProductRepository;

    public SaveBankingProductUseCase(BankingProductRepository bankingProductRepository) {
        this.bankingProductRepository = bankingProductRepository;
    }
    public void  execute(BankingProduct bankingProduct){

        this.bankingProductRepository.saveBankingProduct(bankingProduct);


    }
}
