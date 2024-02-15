package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person;

import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.transactions.Transaction;

import java.util.ArrayList;

public interface PersonRepository {


    ArrayList<Person> obtainPersons();
    Person obtainPerson(String dni);
    void deletePerson(String dni);
    void savePerson(Person person);
    void  updatePerson(Person person);




}
