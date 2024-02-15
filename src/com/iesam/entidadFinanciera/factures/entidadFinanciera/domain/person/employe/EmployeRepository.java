package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person.employe;

import java.util.ArrayList;

public interface EmployeRepository {


    ArrayList<Employe> obtainEmployes();
    Employe obtainEmploye(String dni);
    void  deleteEmploye(String dni);
    void  saveEmploye(Employe employe);
    void updateEmploye(Employe employe);









}
