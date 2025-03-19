package com.generation.polimorfismo.animales;

public class Delfin extends Animal{

    public Delfin(String name, String color, String tipoAlimento, int edad, int numPatas) {
        super(name, color, tipoAlimento, edad, numPatas);
    }



    @Override
    public void hacerRuido(){
        System.out.println("Silba y chasquea en delfinezco");
    }
}
