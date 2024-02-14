package com.iesam.entidadFinanciera.factures.entidadFinanciera.data;

import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.fixedTermDeposit.FixedTermDeposit;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.fixedTermDeposit.FixedTermDepositRepository;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.transactions.Transaction;

import java.util.ArrayList;

public class FixedTermDepositDataRepository implements FixedTermDepositRepository {

    private static FixedTermDepositRepository instance = null;
    private ArrayList<FixedTermDeposit> localFixedTermDeposit = new ArrayList<>();

    public FixedTermDepositDataRepository() {
        initData();
    }


    @Override
    public ArrayList<FixedTermDeposit> obtainFixedTermDeposits() {
        return localFixedTermDeposit;
    }

    @Override
    public FixedTermDeposit obtainFixedTermDeposit(String codeProduct) {
       for(FixedTermDeposit fixedTermDeposit : localFixedTermDeposit){
           if (fixedTermDeposit.getCodeProduct().equals(codeProduct)){
               return fixedTermDeposit;
           }
       }
       return null;
    }

    @Override
    public void deleteFixedTermDeposit(String codeProduct) {
        for (int i = 0; i<localFixedTermDeposit.size();i++){
            if (localFixedTermDeposit.get(i).getCodeProduct().equals(codeProduct)){
                localFixedTermDeposit.remove(i);
            }
        }

    }

    @Override
    public void saveFixedTermDeposit(FixedTermDeposit fixedTermDeposit) {

        localFixedTermDeposit.add(fixedTermDeposit);

    }

    @Override
    public void updateFixedTermDeposit(FixedTermDeposit fixedTermDeposit) {
        deleteFixedTermDeposit(fixedTermDeposit.getCodeProduct());
        saveFixedTermDeposit(fixedTermDeposit);

    }


    private void initData(){
        localFixedTermDeposit.add(new FixedTermDeposit("","","","",""));
        localFixedTermDeposit.add(new FixedTermDeposit("","","","",""));

    }



}
