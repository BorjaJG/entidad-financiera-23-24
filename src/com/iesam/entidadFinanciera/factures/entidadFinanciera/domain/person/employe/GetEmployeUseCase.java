package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person.employe;

public class GetEmployeUseCase {

    private EmployeRepository employeRepository;

    public GetEmployeUseCase(EmployeRepository employeRepository) {
        this.employeRepository = employeRepository;
    }

    public  Employe execute(String dni){
        return  this.employeRepository.obtainEmploye(dni);
    }




}
