package com.iesam.entidadFinanciera.factures.entidadFinanciera.data;

import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.creditCard.CredicCard;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.bankingProducts.creditCard.CredicCardRepository;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class CreadicCardDataRepository implements CredicCardRepository {

    private static CredicCardRepository instance = null;
    private ArrayList<CredicCard> localCredicCard  = new ArrayList<>();

    public  CreadicCardDataRepository(){
        initDate();
    }






    @Override
    public ArrayList<CredicCard> obtainCredicCards() {
        return localCredicCard;
    }

    @Override
    public CredicCard obtainCredicCard(String codeProduct) {

        for (CredicCard credicCard :  localCredicCard) {
            if(credicCard.getCodeProduct().equals(codeProduct)){

                return  credicCard;

            }

        }


        return null;
    }

    @Override
    public void deleteCredicCard(String codeProduct) {
        for (int i = 0;  i<localCredicCard.size(); i++){
            if(localCredicCard.get(i).getCodeProduct().equals(codeProduct)){
                localCredicCard.remove(i);
            }
        }


    }

    @Override
    public void saveCredicCard(CredicCard credicCard) {

        localCredicCard.add(credicCard);

    }

    @Override
    public void updateCredicCard(CredicCard credicCard) {
        deleteCredicCard(credicCard.getCodeProduct());
        saveCredicCard(credicCard);

    }

    private  void initDate(){
        localCredicCard.add(new CredicCard("","","","",""));
        localCredicCard.add(new CredicCard("","","","",""));
    }





}
