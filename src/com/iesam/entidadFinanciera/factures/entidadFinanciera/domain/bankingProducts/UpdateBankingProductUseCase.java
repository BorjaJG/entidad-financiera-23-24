package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts;

public class UpdateBankingProductUseCase {

    private BankingProductRepository bankingProductRepository;

    public UpdateBankingProductUseCase(BankingProductRepository bankingProductRepository) {
        this.bankingProductRepository = bankingProductRepository;
    }
    public void  execute(BankingProduct bankingProduct){

        this.bankingProductRepository.updateBankingProduct(bankingProduct);

    }
}
