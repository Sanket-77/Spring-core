package com.Sterotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component ("employee")
public class Emp {
    @Value("1")
    public int id;
    @Value("sanket")
    public String name;

    @Override
    public String toString() {
        return "Emp{" +
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
}
