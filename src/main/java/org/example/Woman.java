package org.example;

public class Woman extends Person {

    public Woman(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public boolean isRetired() {
        return getAge() >= 60;
    }

    public String getLastName() {
        if (super.getPartner() != null) {
            return super.getPartner().getLastName();

        } else {
            return super.getLastName();
        }

    }
}
