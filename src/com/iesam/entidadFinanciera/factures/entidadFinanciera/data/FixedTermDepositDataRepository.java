package com.iesam.entidadFinanciera.factures.entidadFinanciera.data;

import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.fixedTermDeposit.FixedTermDeposit;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.fixedTermDeposit.FixedTermDepositRepository;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.transactions.Transaction;

import java.util.ArrayList;

public class FixedTermDepositDataRepository implements FixedTermDepositRepository {
    @Override
    public ArrayList<FixedTermDeposit> obtainFixedTermDeposits() {
        return null;
    }

    @Override
    public Transaction obtainFixedTermDeposit(String codeProduct) {
        return null;
    }

    @Override
    public void deleteFixedTermDeposit(String codeProduct) {

    }

    @Override
    public void saveFixedTermDeposit(FixedTermDeposit fixedTermDeposit) {

    }

    @Override
    public void updateFixedTermDeposit(FixedTermDeposit fixedTermDeposit) {

    }
}
