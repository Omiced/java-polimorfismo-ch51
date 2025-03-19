package com.generation.polimorfismo.animales;

public class Animal {
    protected String name;
    protected String color;
    protected String tipoAlimento;
    protected int edad;
    protected int numPatas;

    public Animal(String name, String color, String tipoAlimento, int edad, int numPatas) {
        this.name = name;
        this.color = color;
        this.tipoAlimento = tipoAlimento;
        this.edad = edad;
        this.numPatas = numPatas;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   public String comer(){

        return "Este animal come " + this.tipoAlimento;
    }

   public String dormir(){
        return "Es hora de dormir";
    }

   public void hacerRuido(){

        System.out.println("Hacer ruidos de animal generico");
    }
}
