package com.generation.polimorfismo.animales;

import java.util.ArrayList;

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

    public Animal(){
        System.out.println("Hola");
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

    /*
    * La sobrecarga de metodos es otro tipo de polimorfismo
    * donde se pueden tener metodos con el mismo nombre siempre y cuando cumplan lo siguiente:
    *  a. Tener un tipo de retorno diferente (ejemplo si suma retorna int, suma debe retornar double)
    *  b. Puede tener el mismo tipo de retorno pero diferente numero de parametros
    *  c. Donde pueden tener diferente tipo de retorno y diferente numero de parametros
    * */
    //metodo base
    public int suma(int a, int b){
        return a + b;
    }

// mismo nombre diferente numero de parametros
    public int suma(int a, int b, int c){
        return a + b + c;
    }

    //mismo nombre diferente tipo de retorno
    public double suma(double a, double b){
        return a + b;
    }

    //mismo nombre diferente tipo de retorno y numero de parametros
    public double suma(double a, double b, double c){
        return a + b + c;
    }

    public ArrayList<Integer> suma(ArrayList<Integer>numeros){
        ArrayList<Integer> sumados =  new ArrayList<>();
        for(Integer numero: numeros){
            sumados.add(numero + 2);
        }
        return sumados;
    }
}
