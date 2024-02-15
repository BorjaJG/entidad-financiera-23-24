package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person.customer;

import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.transactions.Transaction;

import java.util.ArrayList;

public interface CustomerRepository {

    ArrayList<Customer> obtainCustomers();
    Customer obtainCustomer(String dni);
    void deleteCustomer(String dni);
    void saveCustomer(Customer customer);
    void  updateCustomer(Customer customer);


}
