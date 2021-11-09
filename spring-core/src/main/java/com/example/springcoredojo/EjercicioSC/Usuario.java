package com.example.springcoredojo.EjercicioSC;

public class Usuario {
    private Alumno alumno;


    public Usuario(){}

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Usuario(Alumno alumno) {
        this.alumno = alumno;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "alumno=" + alumno +
                '}';
    }
}
