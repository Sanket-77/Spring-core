package com.Dependency_Inj.Constructor_inj;

import java.util.List;

public class student {
    public int id;
    public String name;
    public String address;
    public List<String> course;
    public certificete certificete;

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", course=" + course +
                ", certificete=" + certificete +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List<String> getCourse() {
        return course;
    }

    public com.Dependency_Inj.Constructor_inj.certificete getCertificete() {
        return certificete;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCourse(List<String> course) {
        this.course = course;
    }

    public void setCertificete(com.Dependency_Inj.Constructor_inj.certificete certificete) {
        this.certificete = certificete;
    }

    public student(int id, String name, String address, List<String> course, com.Dependency_Inj.Constructor_inj.certificete certificete) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.course = course;
        this.certificete = certificete;
    }

    public student(int id, String name) {
        System.out.println("Constructor calling");
        this.id = id;
        this.name = name;
    }
}
