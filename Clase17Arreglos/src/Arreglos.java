/*
Clase 17
Arreglos

matriz - arreglo - array

Es una estructura de datos que contiene una colección
de valores del mismo tipo

Almacenar valores que se relacionan entre sí

Es una variable pero en vez de un solo valor, sino con
una colección de valores relacionados

Declaración
	variable
	int a;
	
	matriz
	tipo de dato[] nombre de matriz = nuevo tipo de dato [numero de valores que se almacenará]
	int[] miMatriz = new int [3];


Iniciación:
	variables:
	a = 35;
	
	matriz
	miMatriz[0] = 15;
	miMatriz[1] = 25;
	miMatriz[2] = 8;
	
	
Declaración e iniciación
	variables
	int a = 2;
	
	matriz
	int[] miMatriz = {15, 25, 8};
	


Ejemplo

	variable de tipo entero
	35
	
	matriz de tipo entero
	15 25 8  <- collección de valores del mismo tipo






*/
public class Arreglos {

	public static void main(String[] args) {
		
		//int miMatriz[] = new int[3]; <- es válida
		
		//METODO DECLARACIÓN E INICIALIZACIÓN EN LINEAS DISTINTAS
		
		int[] miMatriz = new int[3];
		miMatriz[0] = 15;
		miMatriz[1] = 25;
		miMatriz[2] = 8;
		
		
		/*
		Si queremos recorrer todos los elementos de la matriz
		no sería un buen método lo siguiente:
		
		System.out.println(miMatriz[0]);
		System.out.println(miMatriz[1]);
		System.out.println(miMatriz[3]);
		
		Que ocurriría si tengo muchos elementos
		Es mejor realizar un bucle
		
		*/
		
		//for
		
		for(int i = 0; i < 3; i++) {
			
			System.out.println("Valor del índice " + i + " = " + miMatriz[i]);
			
		}
		
		
		//METODO DECLARACIÓN E INICIACIÓN EN LA MISMA LINEA
		
		int [] miMatriz2 = {15, 25, 8}; //Si agregamos más elementos es mejor en el bucle for condicionarlo hasta que i sea menor a la longitud del arreglo
		
		//for(int i = 0; *i < 3; i++) 
		
		for (int i = 0; i < miMatriz2.length; i++){
			
			System.out.println("Valor del índice " + i + " = " + miMatriz2[i]);
			
		}
		 
		
		/*
		Para o desde la variable i que se inicializa en 0
		se incrementará en 1 por cada bucle
		mientras sea menor a la longitud de la matriz
		
		imprimeme el arreglo en la posición del índice por cada bucle:
		miMatriz[i = 0] ---> miMatriz[i < 3]
		*/
		
	}

}

/*
Salida

Valor del índice 0 = 15
Valor del índice 1 = 25
Valor del índice 2 = 8

*/



/*
Curso Java Arrays 1. Video 23
https://www.youtube.com/watch?v=UID_EKKfpcE&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=23



*/