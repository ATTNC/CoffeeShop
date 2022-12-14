import Abstract.BaseCustomerManager;
import Abstract.CustomerService;
import Adapters.MernisServiceAdapter;
import Concretes.NeroCustomerManager;
import Concretes.StarbucksCustomerManager;
import Entities.Customer;


public class Main {



    public static void main(String[] args) {

        Customer customer =new Customer();
        customer.setId(1);
        customer.setFirstName("Abdullah");
        customer.setLastName("Tütüncü");
        customer.setDateOfBirth(1999);
        customer.setNationalityID("Enter your Nationality Number");

        BaseCustomerManager baseCustomerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
        baseCustomerManager.save(customer);


    }
}