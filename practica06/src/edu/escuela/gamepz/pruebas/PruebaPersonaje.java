package com.patito.poo1pract.pruebas;
import com.patito.poo1pract.personajes.Personaje;

public class PruebaPersonaje {
	public static void main(String[] args) {
		Personaje alumno = new Personaje("Kal El");
		alumno.Saludar();
		System.out.println("Nombre: "+alumno.getNombre()+" Edad: "+alumno.getEdad());
		System.out.println("Modificando el nombre "+alumno.getNombre());
		alumno.setNombre("Muchael Jordan");
		alumno.Saludar();
		if (!alumno.setEdad(30)){
			System.out.println("Edad sin cambios");
		}
		System.out.println("Nombre: "+alumno.getNombre()+" Edad: "+alumno.getEdad());
		System.out.println("Modificando edad en 130");
		if (!alumno.setEdad(130)){
			System.out.println("Edad sin cambio");
		}
		System.out.println("Nombre: "+alumno.getNombre()+" Edad: "+alumno.getEdad());

		Personaje per01 = new Personaje("Almendra");
		per01.setEdad(200);
		Personaje per02 = new Personaje("Ricardo");
		per02.setEdad(10);
		Personaje per03 = new Personaje("Bianca");
		per03.setEdad(1);
		Personaje per04 = new Personaje("Leonel");
		per04.setEdad(-10);
		Personaje per05 = new Personaje("Hector");
		per05.setEdad(500);

		per01.getDetalle();
		per02.getDetalle();
		per03.getDetalle();
		per04.getDetalle();
		per05.getDetalle();

		Personaje per06 = per05;
		Personaje per07 = per04;
		Personaje per08 = per03;
		Personaje per09 = per02;
		Personaje per10 = per01;

		Random random = new Random();
		per07.setEdad(((int)(Math.random()*1001)));
		per09.setEdad(((int)(Math.random()*1001)));

		per06.setNombre(Francisco Xavier Zepeda Flores);
		per08.setNombre(Dayan);
		per10.setNombre(Axel Fabian Eduardo David);
	}
}