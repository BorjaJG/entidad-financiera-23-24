package com.iesam.entidadFinanciera.factures.entidadFinanciera.data;

import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person.Person;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person.PersonRepository;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.transactions.Transaction;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.transactions.TransactionRepository;

import java.util.ArrayList;

public class PersonDataRepository implements PersonRepository {

    private static TransactionRepository instance = null;

    private ArrayList<Person> localPerson = new ArrayList<>();
    public  PersonDataRepository() {
        initData();
    }



    @Override
    public ArrayList<Person> obtainPersons() {
        return localPerson;
    }

    @Override
    public Person obtainPerson(String dni) {
        for (Person person : localPerson) {
            if (person.getDni().equals(dni)) {
                return person;
            }
        }
        return null;
    }

    @Override
    public void deletePerson(String dni) {
        for (int i = 0; i<localPerson.size();i++){
            if (localPerson.get(i).getDni().equals(dni)){
                localPerson.remove(i);
            }
        }
    }

    @Override
    public void savePerson(Person person) {
        localPerson.add(person);
    }

    @Override
    public void updatePerson(Person person) {
        deletePerson(person.getDni());
        savePerson(person);
    }


    public void initData(){

         localPerson.add( new Person("1","",""));
         localPerson.add( new Person("2","",""));
    }



}
