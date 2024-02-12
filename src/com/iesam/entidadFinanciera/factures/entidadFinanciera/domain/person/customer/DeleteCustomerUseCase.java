package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person.customer;

public class DeleteCustomerUseCase {

    private CustomerRepository customerRepository;

    public DeleteCustomerUseCase(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public  void execute(String dni){

        this.customerRepository.deleteCustomer(dni);

    }



}
