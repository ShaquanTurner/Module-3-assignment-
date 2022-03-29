package com.company;

public class  Employee implements Payable {
    protected  String firstName;
    protected  String lastName;
    protected String socialSecurityNumber;

    public String setFirstName() {
        firstName="Joe";
        this.firstName = firstName;

        return null;
    }

    public String getFirstName() {return this.firstName;}

    public void setLastName(String lastName) {
        lastName ="Robinson";
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public double getPaymentAmount() {

        return 0;
    }
}
