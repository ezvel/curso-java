/*Clase 6
 *Clase String
 *
 *Manipulación de cadenas
 *
 *String <- palabras y frases. Más de 1 caracter
 *
 *No es un tipo de dato primitivo
 *Es un tipo de dato tipo clase
 *	Al ser una clase...
 *	Tiene propiedades
 *	Tiene métodos
 *
 *Para reservar un espacio en memoria para string
 *
 *String name = "Nombre";
 *
 *El "Nombre" o valor de la clase String es una instancia
 *de la clase String. Por lo tanto se heredan todas
 *las propiedades y métodos de String
 *
 *Al ser una instancia, es un objeto de la clase String
 *
 *Se acceden a sus métodos con un punto cómo en Math
 *
 *Math.sqrt(2);
 *
 *String.
 *
 *
 *length() <- devuelve la longitud de una cadena de caracteres
 *charAt(n) <- Posición de un caracter dentro de una cadena
 *substring(x, y ) <- extraer una subcadena dentro de la cadena 
 *equals(cadena) <- Versi dos cadenas son iguales
 *
 *Los valores de las variables objeto de tipo String van entre comillas: ("")
 * 
 * */


public class ClaseString {

	public static void main(String[] args) {
		
		String nombre = "Ezequiel";
		System.out.println("Mi nombre es " + nombre);
		
		//length()
		System.out.println("Mi nombre tiene " + nombre.length() + " caracteres. ");
		
		//charAt()
		System.out.println("La primera letra de mi nombre " + nombre + " es " + "\"" + nombre.charAt(0) + "\"");
		
		//Última letra
		int ultimaLetra;
		ultimaLetra = nombre.length();
		System.out.println("La última letra de mi nombre es " + "\"" + nombre.charAt(ultimaLetra - 1) + "\"");
		
		//Substring
		String frase = "Hola mundo";
		String mundo = frase.substring(5, frase.length());
		System.out.println(mundo);
		
		//equals
		String alumno1 = "Jorge", alumno2 = "Jorge";
		System.out.println(alumno1.equals(alumno2));
		

	}

}

/*
 * 
Salida

Mi nombre es Ezequiel
Mi nombre tiene 8 caracteres. 
La primera letra de mi nombre Ezequiel es "E"
La última letra de mi nombre es "l"
mundo
true

*/

/*Fuentes:
 *Curso Java. Manipulación de cadena. Clase String 1. Video 11
 *https://www.youtube.com/watch?v=YMyJLs22uY4&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=11
 * 
 *Curso Java. Manipulación de cadena. Clase String 2. Video 12
 *https://www.youtube.com/watch?v=8yU7jLJ4xvo&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=12 
 * 
 * */
