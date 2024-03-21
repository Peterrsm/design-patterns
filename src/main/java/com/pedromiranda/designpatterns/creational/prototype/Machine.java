package com.pedromiranda.designpatterns.creational.prototype;

// Deep copy strategy
public abstract class Machine {
    private String type;
    private String model;

    public Machine() {
    }

    public Machine(Machine machine) {
        this.type = machine.type;
        this.model = machine.model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract Machine createClone();
}
