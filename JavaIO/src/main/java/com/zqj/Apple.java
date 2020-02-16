package com.zqj;

import java.io.Serializable;

public class Apple implements Serializable {


    private static final long serialVersionUID = 2577987703951291309L;
    private String name;
    private String taste;

    public Apple(String name, String taste) {
        this.name = name;
        this.taste = taste;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", taste='" + taste + '\'' +
                '}';
    }
}
