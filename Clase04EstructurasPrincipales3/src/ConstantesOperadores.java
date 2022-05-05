/*Clase 4
 *Constantes y operadores
 *
 *Constante
 *Es un espacio en la memoria del computador donde
 *se almacenara un valor que no podrá cambiar durante
 *la ejecucion del progrma
 * 
 * final double aPulgadas = 2.54;
 * 
 * Operadores
 * 
 * Aritméticos: 
 * + - *\/ %
 * 
 * relacionales
 * > < >= <= == !=  
 * 
 * booleanos
 * true false
 * 
 * Lógicos
 * not(!) or(||) and (&&)
 * 
 * Incremento y decremento
 * ++ 
 * --
 * 
 * Asignación
 * = += -= *= /= %=
 * 
 * Concatenación
 * +
 * 
 * Fuentes
 * Curso Java. Estructuras principales 4. Constantes y operadores. Video 7
 * https://www.youtube.com/watch?v=qdxwWkTxcmc&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=7
 * 
 * Curso Java. Estructuras principales 5. Constantes y operadores. Video 8
 * https://www.youtube.com/watch?v=MoJxxPgCBcg&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=8
 * 
 * 
 * */



public class ConstantesOperadores {

	public static void main(String[] args) {
		
		double num1 = 5; // <- En la división tiene que ser float o double para que me de los decimales. Debo convertir a float o double todos las variables que participan en la operación
		double num2 = 6; // <-
		
		//int suma = num1 + num2;   // <- Por el comentario de arriba me daba error al necesitar un entero en el resultado de la suma al trabajar con dos objetos del tipo double. Por eso comenté las siguientes lineas.
		//int resta = num1 - num2;  //<-
		//int mult = num1 * num2;   // <-
		double div = num1 / num2;
		//int mod = num1 % num2;    //<-
		num1 += 6;
		num1++;
		
		//System.out.println(suma); //-<-
		//System.out.println(resta); //<-
		//System.out.println(mult);  //<-
		System.out.println(div);     
		//System.out.println(mod);   //<-
		
		final int c = 5;
		
		//c = 6; // <- No puedo reasignar constantes
		
		System.out.println(c);
		
		/*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			The final local variable c cannot be assigned. It must be blank and not using a compound assignment
			at ConstantesOperadores.main(ConstantesOperadores.java:66)
		 * 
		 * */
		
		//Conversión en constantes
		//Variables
		final double apulgadas = 2.54;
		double cm = 6;
		double resultado = cm / apulgadas;
		
		//Imprimir información
		System.out.println("En " + cm + " centímetros hay " + resultado + " pulgadas.");
		
		//Salida
		//En 6.0 centímetros hay 2.3622047244094486 pulgadas.
		
		//Podemos declarar varias variables en una misma linea siempre y cuándo pertenezcan al mismo tipo de dato
		//int a, b, e, d; //Declaración en una sola linea con el mismo tipo de dato
		int numA = 1, numB = 2, numC = 3; //Declaración e inicialización en una sola linea con el mismo tipo de dato
		
		System.out.println(numA);
		System.out.println(numB);
		System.out.println(numC);
	}

}


/*
 * Notas
 * Dos tipos de errores
 * 
 * Errores de compilación <- errores de sintaxis del programa
 * Errores de ejecución   <- errores lógicos del programador
 * 
 * */
