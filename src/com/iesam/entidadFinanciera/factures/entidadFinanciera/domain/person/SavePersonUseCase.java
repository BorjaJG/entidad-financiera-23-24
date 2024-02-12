package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person;

public class SavePersonUseCase {

    private PersonRepository personRepository;

    public SavePersonUseCase(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void execute(Person person){

        this.personRepository.savePerson(person);

    }




}
