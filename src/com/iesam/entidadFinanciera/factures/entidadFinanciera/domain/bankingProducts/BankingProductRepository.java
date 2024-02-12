package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts;

import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person.customer.Customer;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.transactions.Transaction;

import java.util.ArrayList;

public interface BankingProductRepository {

    ArrayList<BankingProduct> obtainBankingProducts();
    BankingProduct obtainBankingProduct(String codeProduct);
    void deleteBankingProduct(String codeProduct);
    void saveBankingProduct(BankingProduct bankingProduct);
    void  updateBankingProduct(BankingProduct bankingProduct);
}
