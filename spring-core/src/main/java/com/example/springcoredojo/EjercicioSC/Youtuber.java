package com.example.springcoredojo.EjercicioSC;

public class Youtuber {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Youtuber(String nombre) {
        this.nombre = nombre;
    }

    public Youtuber(){}

    @Override
    public String toString() {
        return "Youtuber{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
