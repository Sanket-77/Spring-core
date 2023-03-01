package com.spring_Autowire_Xml;

public class student {
    public Address address;

    @Override
    public String toString() {
        return "student{" +
                "address=" + address +
                '}';
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
