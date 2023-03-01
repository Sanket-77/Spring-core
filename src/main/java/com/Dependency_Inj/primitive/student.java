package com.Dependency_Inj.primitive;

public class student {
    public int id;
    public String name;
    public  String address;

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void setId(int id) {
        System.out.println("Setter injection id");
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
