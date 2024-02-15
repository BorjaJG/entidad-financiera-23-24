package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person.employe;

public class SaveEmployesRepository {

    private  EmployeRepository employeRepository;

    public SaveEmployesRepository(EmployeRepository employeRepository) {
        this.employeRepository = employeRepository;
    }

    public void execute(Employe employe){

        this.employeRepository.saveEmploye(employe);


    }




}
