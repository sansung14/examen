package main;

import java.util.ArrayList;
import java.util.Scanner;
import Coches.*;

public class Menu {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int option1=0;
		while(option1!=5) {
				System.out.println("#################");
				System.out.println("1. Crear Coche");
				System.out.println("2. Crear Moto");
				System.out.println("3. Mostrar Coches");
				System.out.println("4. Mostrar Motos");
				System.out.println("5. Salir");
				System.out.println("#################");
				System.out.println("Selecciona Vehiculo:");
				option1 = teclado.nextInt();

				switch (option1) {
				case 1:
					pedir.afegirCoche();
					break;
				case 2:
					pedir.afegirMoto();
					break;
				case 3:
					System.out.println("#################");
					for(int i=0;i<pedir.coches.size();i++) {
						System.out.println(pedir.coches.get(i).toString());
					}
					break;
					
				case 4:
					System.out.println("#################");
					for(int i=0;i<pedir.motos.size();i++) {
						System.out.println(pedir.motos.get(i).toString());
					}
					break;
				}
			}

		}
}


	

	


