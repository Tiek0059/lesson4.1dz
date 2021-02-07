package com.company;

public class Garage<M extends Car> implements Auctionable{
    private M garage;

    public Garage(M garage){
        this.garage = garage;
    }
}
