package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import MernisReferance.TPTKPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService,MernisService {

    @Override
    public boolean checkIfRealPerson(Customer customer) {

        TPTKPSPublicSoap mernisclient= new TPTKPSPublicSoap();
        try
        {
            return mernisclient.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityID()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth());
        }
        catch (Exception e)
        {
        }
        return false;
    }
}

