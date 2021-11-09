package com.example.springcoredojo.Configuration;

import com.example.springcoredojo.EjercicioSC.Alumno;
import com.example.springcoredojo.EjercicioSC.Usuario;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfiguration {

    @Bean
    public Alumno CrearAlumno(){
        return new Alumno("Alexis", "Hernandez", 23);
    }

    @Bean
    public Usuario CrearUsuario(){
        return new Usuario(new Alumno("Guillermo", "Nieto", 23));
    }
}
