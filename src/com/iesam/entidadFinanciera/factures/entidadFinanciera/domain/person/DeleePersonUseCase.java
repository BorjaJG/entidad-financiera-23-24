package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person;

public class DeleePersonUseCase {

    private  PersonRepository personRepository;

    public DeleePersonUseCase(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    public  void execute (String dni){

         this.personRepository.deletePerson(dni);

    }
}
