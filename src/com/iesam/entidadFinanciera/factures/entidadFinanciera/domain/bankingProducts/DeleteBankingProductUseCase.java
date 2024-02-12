package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts;

public class DeleteBankingProductUseCase {

    private BankingProductRepository bankingProductRepository;

    public DeleteBankingProductUseCase(BankingProductRepository bankingProductRepository) {
        this.bankingProductRepository = bankingProductRepository;
    }

    public void execute(String codeProduct){

        this.bankingProductRepository.deleteBankingProduct(codeProduct);

    }




}
