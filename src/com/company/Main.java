package com.company;

public class Main {

    public static void main(String[] args) {
        Dodge dodge = new Dodge("Dodge");
        Garage garage = new Garage(dodge);
        garage.makeVoice("bep bep",dodge.getInhabitant());


        garage = new Garage(new Mersedes("Mersedes"));
        garage.makeVoice("bip beep","Mers");

        garage = new Garage(new Mustang("Mustang"));
        garage.makeVoice("bep bep","Mustang");

        Lamborgini lamborgini = new Lamborgini("Lamborgini");
        garage = new Garage(new Lamborgini("Lamborgini"));
        garage.makeVoice("beeip biep",lamborgini.getInhabitant());

    }
}
