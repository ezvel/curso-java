/*Clase 14
 * 
 *Bucle For
 *
 *Son bucles determinados
 *Sabemos cuántos se tendrá que repetir
 *Ya que depende del programa y no del 
 * 
 *for (inicio del bucle, condición para que se detenga, el contador del bucle) {
 *	...
 *  ...
 *  ...
 *}
 *
 *A diferencia de While el contador estába dentro del las lineas de código para que por cada iteraccion
 *aumente en 1 el contador. El iniciador estaba fuera del bucle iniciada por ejemplo en 0.
 *En el bucle for el iniciador y el contador se encuentran dentro de la definición del bucle
 *
 *Otra forma de entendero
 *
 *"""
 *Creamos un bucle para o desde un valor inicial hasta cuándo cumple la condición incrementame en 1 y
 *repiteme las siguientes lineas de código{
 *	...
 *	...
 *	...
 *}
 *
 *"""
 *
 *Si quiero incrementar más de 1:
 *
 *i++  => i = i+1;
 *
 *i+=2 => i = i+2;
 *
 *i*=3 => i = i+3;
 *
 *...
 *
 *...
 * 
 * 
 * */

//Imprimir valores del 0 al 10
/*
public class BucleFor {

	public static void main(String[] args) {
	
		for(int i = 0; i <= 10; i++) {
			
			System.out.println(i);
			//System.out.println("Ezequiel");
			
		}

	}

}
*/

//Imprimir valores del 1 al 10

public class BucleFor {

	public static void main(String[] args) {
	
		for(int i = 1; i <= 10; i++) {
			
			System.out.println(i);
			//System.out.println("Ezequiel");
			
		}

	}

}

//Salida

/*

Devolver valores del 0 al 10
0
1
2
3
4
5
6
7
8
9
10

Devolver valores del 1 al 10
1
2
3
4
5
6
7
8
9
10

*/

//Fuentes

/*
Curso Java Bucles 5. Video 21
https://www.youtube.com/watch?v=EUCmFmtX26I&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=21
*/
