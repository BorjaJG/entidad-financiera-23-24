package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person;

import java.util.ArrayList;

public class GetPersonsUseCase {

    private  PersonRepository personRepository;

    public GetPersonsUseCase(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public ArrayList<Person> execute(){

      return   personRepository.obtainPersons();

    }




}
