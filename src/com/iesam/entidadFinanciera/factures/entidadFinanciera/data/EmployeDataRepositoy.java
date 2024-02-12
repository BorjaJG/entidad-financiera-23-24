package com.iesam.entidadFinanciera.factures.entidadFinanciera.data;

import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person.employe.Employe;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person.employe.EmployeRepository;

import java.util.ArrayList;

public class EmployeDataRepositoy implements EmployeRepository {
    @Override
    public ArrayList<Employe> obtainEmployes() {
        return null;
    }

    @Override
    public Employe obtainEmploye(String dni) {
        return null;
    }

    @Override
    public void deleteEmploye(String dni) {

    }

    @Override
    public void saveEmploye(Employe employe) {

    }

    @Override
    public void updateEmploye(Employe employe) {

    }
}
