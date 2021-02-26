package main;

import java.util.ArrayList;
import java.util.Scanner;

import Coches.Bike;
import Coches.Car;

public class pedir {
	public static ArrayList<Car> coches = new ArrayList<Car>();
	public static ArrayList<Bike> motos = new ArrayList<Bike>();

	public static void afegirCoche() {
		Scanner teclado = new Scanner(System.in);
		String matricula="";
		double diametro_delantero = 0;
		double diametro_trasero = 0;
		boolean correcto = true;
		while(correcto) {
			System.out.println("Introduce la Matricula:");
			matricula = teclado.next();
			if(Car.comprobarMatricula(matricula)) {
				correcto = false;
			}else{
				System.out.println("mal");
			};
		}
		correcto=true;
		System.out.println("Introduce la Marca del coche:");
		String marca = teclado.next();
		System.out.println("Introduce el color:");
		String color = teclado.next();
		while(correcto) {
			System.out.println("Introduce el diametro de las ruedas delanteras?");
			diametro_delantero = teclado.nextDouble();
			System.out.println("Introduce el diametro de las ruedas traseras?");
			diametro_trasero = teclado.nextDouble();
			if(Car.comprobarDiametro(diametro_delantero, diametro_trasero)) {
				correcto = false;
			}else{
				System.out.println("mal");
			};
		}
		System.out.println("Introduce la marca de las ruedas delantera?");
		String marca_delantero = teclado.next();
		System.out.println("Introduce la marca de las ruedas trasera?");
		String marca_trasera = teclado.next();
		System.out.println("#################");
		Car c = new Car(matricula, marca, color,diametro_delantero,diametro_trasero, marca_delantero, marca_trasera);
		coches.add(c);
	}
	
	public static void afegirMoto() {
		Scanner teclado = new Scanner(System.in);
		String matricula="";
		double diametro_delantero = 0;
		double diametro_trasero = 0;
		boolean correcto = true;
		while(correcto) {
			System.out.println("Introduce la Matricula:");
			matricula = teclado.next();
			if(Car.comprobarMatricula(matricula)) {
				correcto = false;
			}else{
				System.out.println("mal");
			};
		}
		correcto=true;
		System.out.println("Introduce la Marca del coche:");
		String marca = teclado.next();
		System.out.println("Introduce el color:");
		String color = teclado.next();
		while(correcto) {
			System.out.println("Introduce el diametro de las ruedas delanteras?");
			diametro_delantero = teclado.nextDouble();
			System.out.println("Introduce el diametro de las ruedas traseras?");
			diametro_trasero = teclado.nextDouble();
			if(Car.comprobarDiametro(diametro_delantero, diametro_trasero)) {
				correcto = false;
			}else{
				System.out.println("mal");
			};
		}
		System.out.println("Introduce la marca de las ruedas delantera?");
		String marca_delantero = teclado.next();
		System.out.println("Introduce la marca de las ruedas trasera?");
		String marca_trasera = teclado.next();
		System.out.println("#################");
		Bike c = new Bike(matricula, marca, color,diametro_delantero,diametro_trasero, marca_delantero, marca_trasera);
		motos.add(c);
	}
	
}
