package org.example;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private Person partner;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getPartner() {
        return this.partner;
    }

    public void setPartner(Person partner) {
        this.partner = partner;
    }

    // register both partners at once
    public void registerPartnership(Person partner) {
        setPartner(partner);
        partner.setPartner(this);
    }

    // deregister both partners at once
    public void deregisterPartnership(boolean returnToPreviousLastName) {
        if (returnToPreviousLastName) {
            if (getPartner() != null){
                getPartner().setPartner(null);
            }
            setPartner(null);
        }
    }
}

