package com.iesam.entidadFinanciera.factures.entidadFinanciera.presentation;

import com.iesam.entidadFinanciera.factures.entidadFinanciera.data.CustomerDataRepository;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person.customer.Customer;
import com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.person.customer.GetCustomerUseCase;
import java.util.ArrayList;
public class MainClient {


    public static void PrintClient(String dni) {
        GetCustomerUseCase getCustomerUseCase = new GetCustomerUseCase(CustomerDataRepository.newInstance());
        Customer customer = getCustomerUseCase.execute(dni);
        System.out.println(customer.toString());
    }

    public  static void PrintClientOfProduct(){


    }
    public  static void PrintClientOfTransaction(){

    }


}
