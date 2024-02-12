package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person.employe;

public class DeleteEmployeUseCase {

    private  EmployeRepository employeRepository;

    public DeleteEmployeUseCase(EmployeRepository employeRepository) {
        this.employeRepository = employeRepository;
    }

    public void execute(String dni){
        this.employeRepository.deleteEmploye(dni);
    }


}
