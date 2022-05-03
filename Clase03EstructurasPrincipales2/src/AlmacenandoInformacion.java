/*Clase03 
 *Estructuras principales 2 y 3
 *Almacenando información
 *
 *
 *Tipos de datos
 *Primitivos
 *
 *Los tipos de datos primitivos son 8
 *
 *Enteros
 *Representa números enteros
 *
 *	int:   Se reserva 4 bytes de espacio para almacenar en memoria
 *		   Desde -2147483648 hasta 2147483647
 *	short: Se reserva 2 bytes de espacio para almacenar en memoria
 *		   Desde -32768 hast 32767
 *	Long:  Se reserva 8 bytes de espacio para almacenar en memoria
 *		   Números más grande
 *         Colocar sufijo l
 *         5000000000l
 *  byte:  Se reserva 1 byte de espacio para almacenar en memoria
 *         Desde -128 hasta 127
 *      
 *  Nota:
 *  35 Podría ser considerado tanto un byte, cómo un long, un short o un entero
 *  
 *Flotantes
 *Representa números decimales
 *	
 *	float:  Se reserva 4 bytes de espacio para almacenar en memoria
 *	        Aproximadamente 6 a 7 cifras decimales
 *          sufijo f 
 *          4.56432f	
 *  double: Se reserva 8 bytes de espacio para almacenar en memoria. 
 *          Aproximadamente 15 cifras decimales.
 *          Mayor precisión
 *          
 *Char 
 *Representa caracteres
 *	
 *	char: Van entre comillas simples
 *		  'a','*',
 *
 *Boolean
 *Representa valores lógicos
 *	
 *	boolean: true or false
 *			 Evalúan condiciones. Sirven para condicionales
 *
 *	
 *Variables
 *
 *Es un espacio en la memoria del computador dónde se 
 *almacenará un valor que podrá variar o cambiar
 *durante la ejecución del programa
 *
 *Tipo de dato + nombre de variable 
 *
 *Tipo de dato + nombre de variable = valor
 *
 *Ahora bien, ¿por qué la necesidad de varios tipos
 *de datos?
 *Por una cuestión de optimización de memoria. Anteriormente
 *vimos que dependiendo del tipo de dato, se reserva una cantidad
 *de bytes en memoria. Además dijimos que las varibles son espacios reservados
 *en memoria para almacenar datos. Por lo tanto al declarar una variable, determinamos
 *la cantidad de espacio en bytes que se reservará en memoria con los tipos de datos.
 *
 *El problema surge cuándo por ejemplo tenemos un número cómo el 32 que entra en el rango
 *de byte, cómo de short, int, long. Sabemos que ese número cabe perfectamente en 
 *el tipo de dato byte, pero se decide colocarle un long. Lo que ocurre aquí es que
 *se reservará un espacio en memoria mayor al necesario. Si tenemos muchas
 *variables y acudimos a esa práctica, desperdiciaremos, por lo tanto, mucho espacio
 *en memoria. En efecto, nuestro programa puede correr más lento de lo esperado.
 *
 *Por este motivo, es primordial utilizar los tipos de datos que reserven 
 *espacio en memoria necesario para el valor que se requiera, para así, entonces,
 *optimizar la memoria del computador.
 *
 *
 *¿Qué significa System.out.println("")?
 *
 *En Java trabaja con programación orientada a objeto
 *En Java todo es un objeto
 *Hasta la consola 
 *Todo objeto en Java imita los rasgos de los objetos en la vida real
 *Tienen propiedades
 *Tienen métodos o cosas que el objeto puede hacer
 *La consola tiene el método o funcionalidad de imprimir lo que le digamos entre los paréntesis
 *
 *El objeto out (consola) del sistema (System) acceder al método
 *o funcionalidad de imprimir (print) lo que le digamos entre paréntesis(""), en una sola
 *linea (println(""))
 *
 *
 *
 *
 * 
 *Fuentes
 *
 *Curso Java. Estructuras principales 2. Video 5
 *https://www.youtube.com/watch?v=OS1F6VNA6hs&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=5
 *Curso Java. Estructuras principales 3. Video 6 
 *https://www.youtube.com/watch?v=bq6nJRJq27A&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=6 
 * 
 * */

//Ejemplo

public class AlmacenandoInformacion {
	
	public static void main(String args[]) {
		
		//Declaración de variables
		byte age;
		//Inicialización de variables
		age = 27;
		//Declaración en inicialización en la misma linea
		int num = 130;
		//Reasignación de variables
		num = 200;
		
		//Mostrar por pantalla
		System.out.println(age);
		System.out.println(num);
		
		
	}

}

/*
 * Nota:
 * No se puede utilizar variables que no se hayan
 * inicializado.
 * La resignación o cambio de variables es posible gracias
 * a cómo el JRE de Java y la JVM interpreta y ejecuta
 * Java: De arriba hacia abajo.
 * Primero num = 130
 * Luego   num = 200
 * 
 * 
 * */
