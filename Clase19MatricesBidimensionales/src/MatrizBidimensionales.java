/*
Clase 19
Matrices bidimensionales

En Java hablamos de un arreglo dentro de otro arreglo
Los arreglos multidimensionales es un arreglo dentro de otro dentro de otro ...

[... , ... , ... , ... , ...]


No tenemos filas ni columnas, sino posiciones.





*/
public class MatrizBidimensionales {

	public static void main(String[] args) {
		
		//Matriz de dos dimensiones
		//Para almacenar 20 elementos
		//Rellenarlo de manera manual
		
		int [][] matrix = new int [4][5];
		
		//Rellenar matriz
		matrix[0][0] = 15;  
		matrix[0][1] = 16;
		matrix[0][2] = 17;
		matrix[0][3] = 21;
		matrix[0][4] = -15;
		
		matrix[1][0] = 5;
		matrix[1][1] = 6;
		matrix[1][2] = 7;
		matrix[1][3] = 1;
		matrix[1][4] = -5;
		
		matrix[2][0] = 51;
		matrix[2][1] = 61;
		matrix[2][2] = 71;
		matrix[2][3] = 11;
		matrix[2][4] = -51;
		
		matrix[3][0] = 511;
		matrix[3][1] = 611;
		matrix[3][2] = 711;
		matrix[3][3] = 111;
		matrix[3][4] = -511;
		
		/*
		 * 
		[ [[.][.][.][.][.] ] [ [.][.][.][.][.] ] [ [.][.][.][.][.] ] [ [.][.][.][.][.] ] ]
		
		Recorrerlo en un bucle for anidado
		
		[ 
		   *  *  *  *  * -> recorrido del segundo bucle for
		[ [.][.][.][.][.] ]  *recorrido del primer bucle for
		[ [.][.][.][.][.] ]  *
		[ [.][.][.][.][.] ]  *
		[ [.][.][.][.][.] ]  *
		
		]
		
		El primer bucle for recorre la primera dimensión del
		array. 
		En la posición 0 de la primera dimensión se detiene y recorre la segunda dimensión en la posición 0 y avanza a la posición 1 de la primera dimensión
		En la posición 1 de la primera dimensión se detiene y recorre la segunda dimensión en la posición 1 y avanza a la posición 2 de la primera dimensión
		En la posición 2 de la primera dimensión se detiene y recorre la segunda dimensión en la posición 2 y avanza a la posición 3 de la primera dimensión
		En la posición 3 de la primera dimensión se detiene y recorre la segunda dimensión en la posición 3 y avanza a la posición 4 de la primera dimensión
		...
		...
		...
		
		*/
		
		//Imprimir un valor por consola
		//System.out.println(matrix[2][3]);
		
		for(int i = 0; i < 4; i++) {
			
			System.out.println("");
			
			for(int j = 0; j < 5; j++) {
				
				System.out.println("matrix" + "[" + i + "]" + "[" + j + "]" + " : " + matrix[i][j]);
				
			}
		}
		
	}

}

/*
 Comienza el bucle en la posición 0 de la primera dimensión representada con la variable i.  
 Está dentro de la condición porque i es menor a las posiciones de elementos que tiene la primera dimensión
 Devuelve la posición en 0 y la incrementa en 1 para la segunda vuelta
 
 Ejecuta lo que está dentro del bucle
 	Dentro del bucle hay otro bucle
 
   Comienza con la posición 0 de la segunda dimensión representada con la variable j
   Está dentro de la condición porque j es menor a las posiciones de elementos que tiene la segunda dimensión
   Devuelve la posición 0 y la incrementa en 1 para la segunda vuelta
   Ejecuta lo que está dentro del bucle
   Dentro del bucle se imprimen por consola la matriz en la posición 0 de la primera dimensión y 0 de la segunda dimensión
 	
   Da una vuelta
   En la segunda se continua con la posición 1 de la segunda dimensión representada con la variable j
   Está dentro de la condición porque j es menor a las posiciones de elementos que tiene la segunda dimensión
   Devuelve la posición 1 y la incrementa en 2 para la tercera vuelta
   Ejecuta lo que está dentro del 
   Dentro del bucle se imprimen por consola la matriz en la posición 0 de la primera dimensión y 1 de la segunda dimensión
  	
   ...
   ...
   ...
   ...
   Dentro del bucle se imprimen por consola la matriz en la posición 0 de la primera dimensión y 2 de la segunda dimensión
   
   ...
   ...
   ...
   ...
   Dentro del bucle se imprimen por consola la matriz en la posición 0 de la primera dimensión y 3 de la segunda dimensión
  
   ...
   ...
   ...
   ...
   Dentro del bucle se imprimen por consola la matriz en la posición 0 de la primera dimensión y 4 de la segunda dimensión
  
 Continúa el bucle en la posición 1 de la primera dimensión representada con la variable i.  
 Está dentro de la condición porque i es menor a las posiciones de elementos que tiene la primera dimensión
 Devuelve la posición en 1 y la incrementa en 2 para la segunda vuelta
 
 Ejecuta lo que está dentro del bucle
 	Dentro del bucle hay otro bucle
 
   Comienza con la posición 0 de la segunda dimensión representada con la variable j
   Está dentro de la condición porque j es menor a las posiciones de elementos que tiene la segunda dimensión
   Devuelve la posición 0 y la incrementa en 1 para la segunda vuelta
   Ejecuta lo que está dentro del bucle
   Dentro del bucle se imprimen por consola la matriz en la posición 0 de la primera dimensión y 0 de la segunda dimensión
 	
   Da una vuelta
   En la segunda se continua con la posición 1 de la segunda dimensión representada con la variable j
   Está dentro de la condición porque j es menor a las posiciones de elementos que tiene la segunda dimensión
   Devuelve la posición 1 y la incrementa en 2 para la tercera vuelta
   Ejecuta lo que está dentro del 
   Dentro del bucle se imprimen por consola la matriz en la posición 1 de la primera dimensión y 1 de la segunda dimensión
  	
   ...
   ...
   ...
   ...
   Dentro del bucle se imprimen por consola la matriz en la posición 1 de la primera dimensión y 2 de la segunda dimensión
   
   ...
   ...
   ...
   ...
   Dentro del bucle se imprimen por consola la matriz en la posición 1 de la primera dimensión y 3 de la segunda dimensión
  
   ...
   ...
   ...
   ...
   Dentro del bucle se imprimen por consola la matriz en la posición 1 de la primera dimensión y 4 de la segunda dimensión
   
 Continúa el bucle en la posición 2 de la primera dimensión representada con la variable i.  
 Está dentro de la condición porque i es menor a las posiciones de elementos que tiene la primera dimensión
 Devuelve la posición en 2 y la incrementa en 3 para la segunda vuelta
 
 Ejecuta lo que está dentro del bucle
 	Dentro del bucle hay otro bucle
 
   Comienza con la posición 0 de la segunda dimensión representada con la variable j
   Está dentro de la condición porque j es menor a las posiciones de elementos que tiene la segunda dimensión
   Devuelve la posición 0 y la incrementa en 1 para la segunda vuelta
   Ejecuta lo que está dentro del bucle
   Dentro del bucle se imprimen por consola la matriz en la posición 2 de la primera dimensión y 0 de la segunda dimensión
 	
   Da una vuelta
   En la segunda se continua con la posición 1 de la segunda dimensión representada con la variable j
   Está dentro de la condición porque j es menor a las posiciones de elementos que tiene la segunda dimensión
   Devuelve la posición 1 y la incrementa en 2 para la tercera vuelta
   Ejecuta lo que está dentro del 
   Dentro del bucle se imprimen por consola la matriz en la posición 2 de la primera dimensión y 1 de la segunda dimensión
  	
   ...
   ...
   ...
   ...
   Dentro del bucle se imprimen por consola la matriz en la posición 2 de la primera dimensión y 2 de la segunda dimensión
   
   ...
   ...
   ...
   ...
   Dentro del bucle se imprimen por consola la matriz en la posición 2 de la primera dimensión y 3 de la segunda dimensión
  
   ...
   ...
   ...
   ...
   Dentro del bucle se imprimen por consola la matriz en la posición 2 de la primera dimensión y 4 de la segunda dimensión
   
... y así sucesivamente..
 * */

//SALIDA

/*


matrix[0][0] : 15
matrix[0][1] : 16
matrix[0][2] : 17
matrix[0][3] : 21
matrix[0][4] : -15

matrix[1][0] : 5
matrix[1][1] : 6
matrix[1][2] : 7
matrix[1][3] : 1
matrix[1][4] : -5

matrix[2][0] : 51
matrix[2][1] : 61
matrix[2][2] : 71
matrix[2][3] : 11
matrix[2][4] : -51

matrix[3][0] : 511
matrix[3][1] : 611
matrix[3][2] : 711
matrix[3][3] : 111
matrix[3][4] : -511

*/

/*
Curso Java Arrays 3. Arrays bidimensionale. Video 25.
https://www.youtube.com/watch?v=_tUncS0AsNE&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=25
*/