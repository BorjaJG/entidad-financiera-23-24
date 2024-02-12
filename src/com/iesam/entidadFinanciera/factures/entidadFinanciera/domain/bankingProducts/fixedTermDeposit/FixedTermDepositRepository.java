package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.fixedTermDeposit;

import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.mortgage.Mortgage;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.transactions.Transaction;

import java.util.ArrayList;

public interface FixedTermDepositRepository {


    ArrayList<FixedTermDeposit> obtainFixedTermDeposits();
    Transaction obtainFixedTermDeposit(String codeProduct);
    void deleteFixedTermDeposit(String codeProduct);
    void saveFixedTermDeposit(FixedTermDeposit fixedTermDeposit);
    void  updateFixedTermDeposit(FixedTermDeposit fixedTermDeposit);

}
