package Concrete;

import Abstract.BaseCustomerManager;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

    private CustomerCheckService customercheckService; // Referans tutucu interface
    public StarbucksCustomerManager(CustomerCheckService checkService ) {
        this.checkService = checkService;
    }

    @Override
    public void Save(Customer customer) {
        //CustomerCheckManager checkManager = new CustomerCheckManager();
        if(customercheckService.CheckIfRealPerson(customer)) {
            System.out.println(customer.getFirstName()+ " saved to db");
        }
        else {
            System.out.println("Failed to save to db due to invalid person");
        }

    }
}