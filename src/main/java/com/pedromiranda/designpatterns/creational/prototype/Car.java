package com.pedromiranda.designpatterns.creational.prototype;

// Shallow copy strategy
public class Car implements Prototype {
    private String name;
    private Integer year;
    private Double price;

    public Car() {
    }

    public Car(Car car) {
        this.name = car.name;
        this.year = car.year;
        this.price = car.price;
    }

    @Override
    public Car createClone() {
        return new Car(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
