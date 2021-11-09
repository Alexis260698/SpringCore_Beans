package com.example.springcoredojo;

import com.example.springcoredojo.Configuration.AppConfiguration;
import com.example.springcoredojo.EjercicioSC.Alumno;
import com.example.springcoredojo.EjercicioSC.Usuario;
import com.example.springcoredojo.EjercicioSC.Youtuber;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringCoreDojoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringCoreDojoApplication.class, args);

		/*
		----Bean Youtuber

		ApplicationContext appcontext = new ClassPathXmlApplicationContext("user-bean-config.xml");
		Youtuber youtuber= (Youtuber)appcontext.getBean("youtuber");

		System.out.println(youtuber.getNombre());
		((ConfigurableApplicationContext) appcontext).close();
			*/


		/*
		--------Bean Alumno implementado diferente------
		ConfigurableApplicationContext context= new AnnotationConfigApplicationContext(AppConfiguration.class);
		Alumno alumno= context.getBean(Alumno.class);
		System.out.println(alumno.toString());
		*/


		ApplicationContext appcontext = new ClassPathXmlApplicationContext("user-bean-config.xml");
		Usuario usuario= (Usuario) appcontext.getBean("Usuario");

		System.out.println(usuario);
		((ConfigurableApplicationContext) appcontext).close();



	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			beanAlumno();
			beanUsuario();
		};
	}

	public void beanAlumno(){
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		Alumno alumno = context.getBean(Alumno.class);
		System.out.println("Alumno: "+ alumno);
	}

	public void beanUsuario(){
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		Usuario usuario = context.getBean(Usuario.class);
		System.out.println("Alumno de la clase Usuario: "+ usuario);
	}


}
