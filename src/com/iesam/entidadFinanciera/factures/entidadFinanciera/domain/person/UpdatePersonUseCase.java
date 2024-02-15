package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person;

public class UpdatePersonUseCase {

    private PersonRepository personRepository;

    public UpdatePersonUseCase(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    public void execute(Person person){

        this.personRepository.updatePerson(person);


    }

}
