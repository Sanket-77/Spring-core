package com.Dependency_Inj.Constructor_inj;

public class certificete {
    public int id;
    public String name;

    @Override
    public String toString() {
        return "certificete{" +
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

    public certificete(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
