package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person.employees;

import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person.Person;

public class Employees extends Person {



    public final String socialSecurityNumber;

    public Employees(String dni, String name, String surname, String socialSecurityNumber) {
        super(dni, name, surname);
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", dni='" + dni + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
