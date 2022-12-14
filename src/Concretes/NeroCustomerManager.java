package Concretes;

import Abstract.BaseCustomerManager;
import Abstract.CustomerService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager implements CustomerService {

    @Override
    public void save(Customer customer) {

        System.out.println("Customer save to database "+customer.getFirstName()+" "+customer.getLastName());

    }
}
