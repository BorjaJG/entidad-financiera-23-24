package com.iesam.entidadFinanciera.factures.entidadFinanciera.data;

import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person.employe.Employe;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person.employe.EmployeRepository;

import java.util.ArrayList;

public class EmployeDataRepositoy implements EmployeRepository {

    private static EmployeRepository employeRepository;
    private ArrayList<Employe> localEmploy = new ArrayList<>();
    public  EmployeDataRepositoy(){
        initData();
    }



    @Override
    public ArrayList<Employe> obtainEmployes() {
        return localEmploy;
    }

    @Override
    public Employe obtainEmploye(String dni) {
        for (Employe employe : localEmploy){
            if(employe.getDni().equals(dni)){
                return employe;
            }
        }
        return null;
    }

    @Override
    public void deleteEmploye(String dni) {

        for (int i= 0 ;i<localEmploy.size();i++ ){
            if (localEmploy.get(i).getDni().equals(dni)){

                localEmploy.remove(dni);

            }
        }

    }

    @Override
    public void saveEmploye(Employe employe) {

        localEmploy.add(employe);

    }

    @Override
    public void updateEmploye(Employe employe) {
        deleteEmploye(employe.getDni());
        saveEmploye(employe);

    }


    private  void  initData(){
        localEmploy.add(new Employe("","","",""));
        localEmploy.add(new Employe("","","",""));
    }




}
