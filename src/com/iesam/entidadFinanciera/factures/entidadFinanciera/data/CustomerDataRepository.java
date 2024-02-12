package com.iesam.entidadFinanciera.factures.entidadFinanciera.data;

import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person.customer.Customer;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person.customer.CustomerRepository;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.transactions.Transaction;

import java.util.ArrayList;

public class CustomerDataRepository  implements CustomerRepository {
    @Override
    public ArrayList<Customer> obtainCustomers() {
        return null;
    }

    @Override
    public Customer obtainCustomer(String dni) {
        return null;
    }

    @Override
    public void deleteCustomer(String dni) {

    }

    @Override
    public void saveCustomer(Customer customer) {

    }

    @Override
    public void updateCustomer(Customer customer) {

    }
}
