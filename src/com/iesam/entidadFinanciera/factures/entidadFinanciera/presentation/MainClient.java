package com.iesam.entidadFinanciera.factures.entidadFinanciera.presentation;

import com.iesam.entidadFinanciera.factures.entidadFinanciera.data.CustomerDataRepository;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person.customer.Customer;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person.customer.CustomerRepository;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person.customer.GetCustomerUseCase;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person.customer.GetCustomersUseCase;

import java.util.ArrayList;

public class MainClient {


    public static void PrintClient() {
        GetCustomersUseCase customerUseCase = new GetCustomersUseCase(new CustomerDataRepository());
        ArrayList<Customer> customers = customerUseCase.execute();
        System.out.println(customers.toString());
    }

    public  static void PrintClientOfProduct(){

    }
    public  static void PrintClientOfTransaction(){

    }


}
