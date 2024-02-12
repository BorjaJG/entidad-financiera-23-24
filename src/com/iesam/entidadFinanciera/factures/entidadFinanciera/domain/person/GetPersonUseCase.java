package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person;


public class GetPersonUseCase {

    private PersonRepository personRepository;

    public GetPersonUseCase(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    public Person execute(String dni){
        return  this.personRepository.obtainPerson(dni);
    }





}
