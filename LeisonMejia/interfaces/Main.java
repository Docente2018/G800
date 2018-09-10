package com.app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Accion accion = null;
		int opcionSeleccionada = 0;
		Scanner scanner = null;
		
		try {
			System.out.print("Ingresa la opción para ejecutar (1- crear, 2- editar, 3- eliminar): ");
			scanner = new Scanner(System.in);
			opcionSeleccionada = scanner.nextInt();
			
		} 
		catch (Exception e) {
			opcionSeleccionada = 0;
		}
		finally {
			scanner.close();
		}
		
		accion = AccionFactory.getInstancia(opcionSeleccionada);
		
		accion.ejecutar();		

	}

}
