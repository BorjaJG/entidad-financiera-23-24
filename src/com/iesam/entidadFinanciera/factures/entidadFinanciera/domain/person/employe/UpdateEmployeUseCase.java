package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person.employe;

public class UpdateEmployeUseCase {

    private  EmployeRepository employeRepository;

    public UpdateEmployeUseCase(EmployeRepository employeRepository) {
        this.employeRepository = employeRepository;
    }
    public void execute(Employe employe){
        this.employeRepository.updateEmploye(employe);
    }
}
