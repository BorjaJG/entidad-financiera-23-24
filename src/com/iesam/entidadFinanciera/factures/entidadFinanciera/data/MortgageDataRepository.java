package com.iesam.entidadFinanciera.factures.entidadFinanciera.data;

import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.BankingProduct;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.mortgage.MortgageRepository;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.mortgage.Mortgage;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.mortgage.MortgageRepository;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person.Person;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person.employe.EmployeRepository;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.transactions.Transaction;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.transactions.TransactionRepository;

import java.util.ArrayList;

public class MortgageDataRepository implements  MortgageRepository  {

    private static EmployeDataRepositoy instance = null;

    private ArrayList<Mortgage> localMartgage = new ArrayList<>();
    public  MortgageDataRepository() {
        initData();
    }


    @Override
    public ArrayList<Mortgage> obtainMortgages() {
        return localMartgage;
    }

    @Override
    public Mortgage obtainMortgage(String codeProduct) {
        for (Mortgage mortgage : localMartgage){
            if(mortgage.getCodeProduct().equals(codeProduct)){
                return mortgage;
            }
        }

        return null;
    }

    @Override
    public void deleteMortgage(String codeProduct) {

        for (int i=0 ; i<localMartgage.size(); i++){
            if (localMartgage.get(i).getCodeProduct().equals(codeProduct)){
                localMartgage.remove(i);
            }
        }

    }

    @Override
    public void saveMortgage(Mortgage mortgage) {
        localMartgage.add(mortgage);
    }

    @Override
    public void updateMortgage(Mortgage mortgage) {
        deleteMortgage(mortgage.getCodeProduct());
        saveMortgage(mortgage);

    }

    public void initData(){
        localMartgage.add(new Mortgage("ewqe","qwe","qe","","",""));
        localMartgage.add(new Mortgage("","","","","",""));
    }
    public static EmployeDataRepositoy newInstance(){
        if (instance == null){
            instance = new EmployeDataRepositoy();
        }
        return instance;
    }

}
