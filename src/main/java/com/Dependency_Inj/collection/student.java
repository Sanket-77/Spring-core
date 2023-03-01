package com.Dependency_Inj.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class student {

    public String name;

    public List<String> address;

    public Set<String> phone;

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", phone=" + phone +
                ", course=" + course +
                '}';
    }

    public Map<String, String> course;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public void setPhone(Set<String> phone) {
        this.phone = phone;
    }

    public void setCourse(Map<String, String> course) {
        this.course = course;
    }
}
