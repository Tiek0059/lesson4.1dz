package com.company;

public class Garage<M extends Car> implements Auctionable<M> {
    private M garage;

    public Garage(M garage) {
        this.garage = garage;
    }

    public M getGarage() {
        return garage;
    }

    @Override
    public void makeVoice(String w, Object car ) {
       System.out.println("This is " + " " + car + " "+ w);
    }
}
