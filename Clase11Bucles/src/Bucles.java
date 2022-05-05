/*Clase 11
 *Bucles
 *
 *Dos tipos de bucles
 *
 *Bucles indeterminados
 *Bucle es repetir series de código
 *No sabemos cuántas veces se repetirán las lineas de código
 *Puede depender del usuario
 * 
 * While
 * Mientras la condición es cierta
 * repetir
 * Cuándo la condición sea falsa
 * Detenerse
 * 
 * <- Si la condición siempre es cierta entramos en un bucle infinito <- nunca se detenrá
 * 
 * DO While
 * Ejecutar lineas de código
 * Mientras la condición sea cierta
 * Repetir
 * Cuándo la condición sea falsa
 * Detenerse
 * 
 * While(condición){
 * 		linea1;
 * 		...;
 * }
 * 
 * Do {
 * 	
 * 	linea1;
 * 	...
 * 
 * }While(condición)
 * 
 * 
 *Bucle determinado
 *Bucle es repetir series de código
 *Sabemos cuántas veces se repetirá las lineas de código
 *Depende del programa
 *
 * 
 * 
 * */

//Acceder a una hipotética aplicación

import javax.swing.*;


public class Bucles {

	public static void main(String[] args) {
		
		String clave = "Ezequiel";
		String pass = "";
		
		while(clave.equals(pass) == false) {
			
			pass = JOptionPane.showInputDialog("Introduce la contraseña");
			
			if (clave.equals(pass)==false) {
				
				System.out.println("Contraseña incorrecta. Introduce una contraseña válida");
				
			}
		}
		
		System.out.println("Contraseña correcta. Acceso permitido");
		
	}

}

/*Tengo dos variables
 * 
 * clave <- Ezequiel
 * pass <- cadena vacia
 * 
 * Mientras la clave no sea igual a pass <- Contraseña no sea igual a Ezequiel
 * 	pedirle la contraseña al usuario
 *  si la clave no es igual a la contraseña <- SI la contraselña no es igual a Ezequiel
 *  Mostrar que la contraseña es incorrecta
 *  
 * Al momento en que la contrasaña sea igual a clave, Contraseña sea igual a Ezequiel o la condición sea falsa
 * Finalizar bucle
 * Mostrar contraseña correcta. Acceso permitido
 * 
 * 
 * */

/*
 * 
 *Fuentes
 *Curso Java Bucles 1. Video 18
 * 
 * */
