package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person.customer;

import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person.PersonRepository;

import java.util.ArrayList;

public class GetCustomersUseCase {

    private CustomerRepository customerRepository;

    public GetCustomersUseCase(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public ArrayList<Customer> execute(){
        return customerRepository.obtainCustomers();
    }



}
