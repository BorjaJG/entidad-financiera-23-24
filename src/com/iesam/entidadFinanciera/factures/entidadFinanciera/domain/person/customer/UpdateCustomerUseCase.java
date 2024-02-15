package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person.customer;

import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person.PersonRepository;

public class UpdateCustomerUseCase {

    private CustomerRepository customerRepository;

    public UpdateCustomerUseCase(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public void execute(Customer customer){
        this.customerRepository.updateCustomer(customer);
    }



}
