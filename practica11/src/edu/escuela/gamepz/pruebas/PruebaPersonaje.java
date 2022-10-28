package edu.escuela.gamepz.pruebas;
import edu.escuela.gamepz.personajes.Personaje;

public class PruebaPersonaje {
	public static void main(String[] args) {
		Personaje alumno = new Personaje("Kal El");
		alumno.Saludar();
		System.out.println("Nombre: "+alumno.getNombre()+" vida: "+alumno.getVida());
		System.out.println("Modificando el nombre "+alumno.getNombre());
		alumno.setNombre("Muchael Jordan");
		alumno.Saludar();
		if (!alumno.setVida(30)){
			System.out.println("vida sin cambios");
		}
		System.out.println("Nombre: "+alumno.getNombre()+" vida: "+alumno.getVida());
		System.out.println("Modificando vida en 130");
		if (!alumno.setVida(130)){
			System.out.println("vida sin cambio");
		}
		System.out.println("Nombre: "+alumno.getNombre()+" vida: "+alumno.getVida());

		Personaje per01 = new Personaje("Almendra");
		per01.setVida(200);
		Personaje per02 = new Personaje("Ricardo");
		per02.setVida(10);
		Personaje per03 = new Personaje("Bianca");
		per03.setVida(1);
		Personaje per04 = new Personaje("Leonel");
		per04.setVida(-10);
		Personaje per05 = new Personaje("Hector");
		per05.setVida(500);

		System.out.println(per01.getDetalle());
		System.out.println(per02.getDetalle());
		System.out.println(per03.getDetalle());
		System.out.println(per04.getDetalle());
		System.out.println(per05.getDetalle());

		Personaje per06 = per05;
		Personaje per07 = per04;
		Personaje per08 = per03;
		Personaje per09 = per02;
		Personaje per10 = per01;

		per07.setVida(((int)(Math.random()*100)));
		per09.setVida(((int)(Math.random()*100)));
		System.out.println("---");

		per06.setNombre("Francisco Xavier Zepeda Flores");
		per08.setNombre("Dayana");
		per10.setNombre("Axel Fabian Eduardo David");

		System.out.println(per01.getDetalle());
		System.out.println(per02.getDetalle());
		System.out.println(per03.getDetalle());
		System.out.println(per04.getDetalle());
		System.out.println(per05.getDetalle());
	}
}