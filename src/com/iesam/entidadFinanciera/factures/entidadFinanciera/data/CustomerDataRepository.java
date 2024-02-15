package com.iesam.entidadFinanciera.factures.entidadFinanciera.data;

import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person.customer.Customer;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person.customer.CustomerRepository;

import java.util.ArrayList;

public class CustomerDataRepository  implements CustomerRepository {

   private  static  CustomerRepository instance = null;
    private  ArrayList<Customer> localCustomer = new ArrayList<>();

    public CustomerDataRepository(){
        initDate();
    }



    @Override
    public ArrayList<Customer> obtainCustomers() {
        return localCustomer;
    }

    @Override
    public Customer obtainCustomer(String dni) {
        for (Customer customer : localCustomer){
            if (customer.getDni().equals(dni)){
                return customer;
            }
        }
        return null;
    }

    @Override
    public void deleteCustomer(String dni) {
        for (int i = 0 ;  i<localCustomer.size(); i++){
            if(localCustomer.get(i).getDni().equals(dni)){
                localCustomer.remove(i);
            }
        }

    }

    @Override
    public void saveCustomer(Customer customer) {

        localCustomer.add(customer);

    }

    @Override
    public void updateCustomer(Customer customer) {

        deleteCustomer(customer.getDni());
        saveCustomer(customer);

    }

    public void initDate(){
        localCustomer.add(new Customer("1","","","","",""));
        localCustomer.add(new Customer("2","","","","",""));
    }

    public static CustomerRepository newInstance(){
        if (instance == null){
            instance = new CustomerDataRepository();
        }
        return instance;
    }


}
