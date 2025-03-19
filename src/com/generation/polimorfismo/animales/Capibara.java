package com.generation.polimorfismo.animales;

public class Capibara extends Animal{
    public Capibara(String name, String color, String tipoAlimento, int edad, int numPatas) {
        super(name, color, tipoAlimento, edad, numPatas);
    }

    @Override
    public void hacerRuido(){
        System.out.println("Bufando ando");
    }
}
