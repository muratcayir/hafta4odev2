package com.company;

import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main {

    public static void main(String[] args) {

        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapters());
        customerManager.Save(new Customer(1,"Murat","ÇAYIR", LocalDate.of(1996,5,7),"252275272278"));

    }
}
