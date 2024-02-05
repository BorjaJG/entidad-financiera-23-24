package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person.customer;

import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person.Person;

public class Customer extends Person {

    public final String address;
    public final String city;
    public final String postalCode;

    public Customer(String dni, String name, String surname, String address, String city, String postalCode) {
        super(dni, name, surname);
        this.address = address;
        this.city = city;
        this.postalCode = postalCode;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
