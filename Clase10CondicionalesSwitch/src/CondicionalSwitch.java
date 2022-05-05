/*Clase 10
 *Condicional Switch
 *
 * Problema
 * Area de cuadrado
 * Area de rectángulo
 * Area de triángulo
 * Area de círculo
 * 
 * 
 * 
 * */

import java.util.*; // Para utilizar Scanner -> Pedirles datos a los usuario
import javax.swing.*;


public class CondicionalSwitch {

	public static void main(String[] args) {
		
		
		
		//Variables
		int lado;
		int base;
		int altura;
		double area = 0.0;
		int radio;
		int figuraNum;
		String figuraString = "";
		final double PI = Math.PI;
		
		
		
		//Scanner
		Scanner input = new Scanner(System.in); //<- system.in <- para que por la consola se pueda introducir información
		
		/*
		System.out.println("ELige una opción: ");
		System.out.println("1: Cuadrado");
		System.out.println("2: Rectángulo");
		System.out.println("3: Triángulo");
		System.out.println("4: Círculo");
		*/
		
		System.out.println("Elige una opción:  \n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Círculo"); // \n hacer saltos de linea
		
		figuraNum = input.nextInt();
		
		
		
		switch(figuraNum) {
		
		case 1:
			
			lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
			area = Math.pow(lado, 2);
			figuraString = "cuadrado";
			break;
			
		case 2:
			
			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			area = base * altura;
			figuraString = "rectángulo";
			break;
			
		case 3:
			
			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			area = (base * altura) / 2;
			figuraString = "triángulo";
			break;
			
 		case 4:
 			
			radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
			area = Math.pow((PI * radio), 2);
			figuraString = "círculo";
			break;
			
		default:
			
			System.out.println("No ha escogido la opción correcta.");
			break;
		}

		
		
		//Mostrar información
		if (figuraNum <= 4) {
			
			System.out.println("El area de la figura " + figuraString + " es " + area);		
			
		}else {
			
			System.out.println("No hemos podido calcular el area de una figura por fuera del rango indicado en las opciones");
			
		}

	}

}

/*Salida

	Elige una opción:  
	1: Cuadrado 
	2: Rectángulo 
	3: Triángulo 
	4: Círculo
	2
	El area de la figura rectángulo es 4.0
 
*/

/*
 *
 *
 * Curso Java. Condicionales 2. Video 17
 * https://www.youtube.com/watch?v=8t5-D5dZu5Y&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=17
 * 
 * 
 */