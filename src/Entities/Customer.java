package Entities;

public class Customer {



    public Customer(){

   }


   public Customer(int id,String firstName,String lastName,int dateOfBirth,String nationalityID) {

        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.dateOfBirth=dateOfBirth;
        this.nationalityID=nationalityID;

   }

int id;
String firstName;
String lastName;
int dateOfBirth;
String nationalityID;









public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationalityID() {
        return nationalityID;
    }

    public void setNationalityID(String nationalityID) {
        this.nationalityID = nationalityID;
    }
}
