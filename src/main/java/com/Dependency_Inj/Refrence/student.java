package com.Dependency_Inj.Refrence;

public class student {
    public String name;
    public Address address;

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
