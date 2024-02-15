package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person.customer;

public class SaveCustomerUseCase {

    private  CustomerRepository customerRepository;

    public SaveCustomerUseCase(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public void  execute(Customer customer){

        this.customerRepository.saveCustomer(customer);

    }


}
