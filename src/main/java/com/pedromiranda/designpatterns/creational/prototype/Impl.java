package com.pedromiranda.designpatterns.creational.prototype;

public class Impl {

    public void implement() {

        //Shallow copy
        Car carro = new Car();
        carro.setName("Corsa");
        carro.setPrice(15000.00);
        carro.setYear(2006);

        Car reserva = carro.createClone();

        System.out.println(reserva);

        //-------------------

        //Deep copy
        Computer comp = new Computer();
        comp.setType("Gamer Computer");
        comp.createClone();

        Computer comp2 = comp.createClone();
        comp2.setYear(2012);

        System.out.println(comp2);

    }
}
