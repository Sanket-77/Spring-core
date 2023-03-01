package com.Spring_LifeCycle;

public class student {
    public int id;
    public String name;

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void init(){
        System.out.println(" init call: initialization started");
    }

    public void Distroy(){
        System.out.println("Distroy csll : Distroy started");
    }
}

