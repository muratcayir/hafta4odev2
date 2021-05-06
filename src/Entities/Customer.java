package Entities;
import Abstract.IEntity;

import java.sql.Time;

public class Customer implements IEntity {


    private int Id;
    private String FirstName;
    private String LastName;
    private Time  DateOfBirth;
    private String NationalityId;

    public Customer(int id, String firstName, String lastName, Time dateOfBirth, String nationalityId) {
       this.Id=Id;
       this.FirstName=FirstName;
       this.LastName=LastName;
       this.DateOfBirth=DateOfBirth;
       this.NationalityId=NationalityId;

    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Time getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Time dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getNationalityId() {
        return NationalityId;
    }

    public void setNationalityId(String nationalityId) {
        NationalityId = nationalityId;
    }
}
