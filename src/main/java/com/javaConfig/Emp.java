package com.javaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Emp {


    public Address address;

    public Emp(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emp{" +
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
