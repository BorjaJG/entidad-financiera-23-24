package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person.employe;

import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person.Person;

public class Employe extends Person {



    public final String socialSecurityNumber;

    public Employe(String dni, String name, String surname, String socialSecurityNumber) {
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
