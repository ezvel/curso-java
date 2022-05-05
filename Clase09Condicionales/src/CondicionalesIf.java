/*Clase 9
 * 
 *Condicionales if
 *
 *Hasta ahora hemos utilizado el paradigma
 *de programación imperativa
 *De arriba a abajo
 *Ese es el flujo de ejecución
 *
 *Control de flujo
 *Intervenir en el flujo
 *Tomar caminos diferentes de acuerdo a condicones
 *Repetir ciertas tareas hasta que se cumpla determinada condición
 *Puede dar saltos entre lineas
 *Puede parar en una linea y salirse del flujo
 *
 *Contamos de dos estructuras
 *
 *condicional -> saltos -> saltamos una linea para ejecutar la que cumple la condición
 *
 *bucle       -> repetir
 *
 *
 *if (condicion) {
 *	
 *	codigos a ejecutar
 *	...
 *
 *}
 *
 *if (condición) {
 *
 *	código a ejecutar
 *	...
 *
 *}else{
 *
 *	código a ejecutar
 *	...
 *
 *}
 *
 *
 *if (condición) {
 *
 *	código a ejecutar
 *	...
 *
 *}else if(condición) {
 *
 *	código a ejecutar
 *	...
 *
 *}else{
 *
 *	código a ejecutar
 *	...
 *
 *}
 *
 *
 *
 *switch(valor a evaluar) {
 *
 *	case valor1:
 *		codigo a ejecutar
 *		break
 *	
 *	case valor2:
 *		codigo a ejecutar
 *		break
 *
 *	case valor1:
 *		codigo a ejecutar
 *		break
 *
 *	default:
 *		codigo a ejecutar
 *		break
 *
 *}
 * 
 * 
 * 
 * 
 * */


import java.util.*;

public class CondicionalesIf {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce tu edad: ");
		
		int edad = input.nextInt();
		
		//Evaluar la edad
		if (edad >= 18) {
			System.out.println("Usted es mayor de edad");		
		}else{
			System.out.println("Usted es menor de edad");
		}
		
		
	}
	
/*
 * 
 * Fuentes:
 * Curso Java. Condicionales 1. Video 16
 * https://www.youtube.com/watch?v=b2ZtZndiT1Y&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=16
 * 
 * 
 * 
 * */
	
}
