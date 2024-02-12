package com.iesam.entidadFinanciera.factures.entidadFinanciera.data;

import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person.Person;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person.PersonRepository;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.transactions.Transaction;

import java.util.ArrayList;

public class PersonDataRepository implements PersonRepository {
    @Override
    public ArrayList<Person> obtainPersons() {
        return null;
    }

    @Override
    public Person obtainPerson(String dni) {
        return null;
    }

    @Override
    public void deletePerson(String dni) {

    }

    @Override
    public void savePerson(Person person) {

    }

    @Override
    public void updatePerson(Person person) {

    }
}
