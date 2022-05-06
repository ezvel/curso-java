import java.util.*;

public class AdivinaNumero {

	public static void main(String[] args) {
		
		
		//Variables a utilizar: numero ingresado por el usuariom intentors, numero aleatorio
		int aleatorio = 0;
		int numero = 0;
		int intentos = 0;
		/*
		 * 1. Creamos 3 espacios en memoria para introducir datos que pueden cambiar a lo largo del programa
		 * 		aleatorio: numero aleatorio generado por el programa
		 * 		numero: numero ingresador por el usuario a comparar con el número aleatorio
		 * 		intentos: la cantidad de intentos hechos por el usuario. El que adivine en menos intentos gana
		 * 
		 * */
		
		
		//Generar número aleatorio
		aleatorio = (int)(Math.random()*100);
		/*
		 * 2. Generamos un número aleatorio
		 * 		Utilizamos la clase Math
		 * 		La clase Math es estática. Lo que significa que no tengo que instanciar la clase cómo objeto sino llamarlo o convocarla
		 * 		Utilizo el método random, que es un conjunto de código escrito cómo función que al convocarla se la puede utilizar. Un método o, bien llamada, función dentro de una clase, puede recibir parámetros para configurar su salida
		 * 		La documentación dice que devolverá un double y un número aleatorio entre 0 y 1. Mayor o igual a 0 y menor a 1
		 * 		Al necesitar un número del 1 a 100 corro las comas multiplicandolo por 100 1.0 -> 100
		 * 		Al necesitar la parte entera lo convierto o refundo a entero (int)()
		 * 		Al refundirlo a entero, puedo guardar el valor en una variable tipo entera y no double
		 * 		Tengo capturado el número aleatorio entre el 1 al 100 que no cambiará en esta sesión del programa ya que está fuera de un bucle
		 * 
		 * */
		
		
		//3.Instanciar clase Scanner creando un objeto input, ya que Scanner no es una clase estática
		Scanner input = new Scanner(System.in);
		
		
		//4.Comenzando el juego
		System.out.println("*************************");
		System.out.println("****Adivina el número****");
		System.out.println("*************************");
		System.out.println("");
		System.out.println("Tienes que adivinar un número entre el 1 al 100. Se te dirá mayor o menor para guiarte a ganar el juego");
		
		
		//5.Pedirle un número al usuario
		System.out.println("Ingrese un número: ");
		numero = input.nextInt();
		System.out.println("");
		/*
		 * Por la consola del sistema generamos una salida utilizando el método de impresión para pedirle un número
		 * Utilizando la clase Scanner le decimos que se genere una entrada al sistema por el próximo entero (nextInt()) que se vaya a ingresar por consola
		 * Imprimos un salto de linea por cuestioes estética del sistema
		 * */
		
		
		//5.Operar
		while (numero != aleatorio) {
			
			/* Entramos en un ciclo while
			 * Un bucle indeterminado, ya que la cantidad de repeticiones no depende del programa,
			 * sino del usuario.
			 * Mientras sea cierto que el número ingresado por el usuario sea distinto al número a adivinar, repetir la siguientes lineas de código.
			 * Si es falso que el número ingresador por el usuario sea distinto al número a adivinar. En otras palabras, si el número del usuario es igual al número a adivinar, finalizar el bucle, ya que se adivinó el número
			 * 		Si el número es mayor que el número a adivinar, decirle al usuario que ingrese un número menor
			 * 		Si el número es menor que el número a adivinar, decirle al usuario que ingrese un número mayor
			 * 		El número introducido guardarlo en una variable, que almacenará por entrada por consola el próximo entero a ingresar.
			 * 		Acumular la cantidad de intentos ++
			 * */
			
			if (numero > aleatorio) {
				System.out.println("Menor");
				System.out.println("Introduce un número");
				numero = input.nextInt();
				System.out.println("");
			}else if (numero < aleatorio){
				System.out.println("Mayor");
				System.out.println("Introduce un número");
				numero = input.nextInt();
				System.out.println("");
			}
			
			intentos++;
			
			
		}
		
		
		//6.Mostrar información en sistema
		/*Mostrar por consola el mensaje de felicitación, el número adivinado y la cantidad de intentos.
		 * 
		 * */
		System.out.println("");
		System.out.println("***************************************************************");
		System.out.println("Felicitaciones. Haz adivinado el número \nNúmero aleatorio a adivinar: " + aleatorio + "\nIntentos: " + intentos);
		System.out.println("***************************************************************");
		

	}

}


/*
 *Mientras el número ingresado por el usuario no sea igual al aleatorio
 *Pedirle al usuario que ingrese un número
 *Cuándo el número ingresado por el usuario sea igual al número aleatorio, es decir, la condición sea falsa
 *Decirle al usuario que ganó y finalizar el juego 
 * */
 