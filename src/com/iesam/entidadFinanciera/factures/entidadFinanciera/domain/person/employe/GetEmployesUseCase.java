package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person.employe;

import java.util.ArrayList;

public class GetEmployesUseCase {

    private EmployeRepository employeRepository;

    public GetEmployesUseCase(EmployeRepository employeRepository) {
        this.employeRepository = employeRepository;
    }

    public ArrayList<Employe> execute(){

       return this.employeRepository.obtainEmployes();


    }



}
