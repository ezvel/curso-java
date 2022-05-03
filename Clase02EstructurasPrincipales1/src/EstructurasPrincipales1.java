/*
Clase 2
Estructuras principales 1


Tipos de programas Java:

	Aplicaciones de consola
	Propósito general -> Programas de escritorio, web, ...
	Applets           -> Programas que se ejecutan en un navegador


Anatomía de un programa Java:

	public class NombreClase {

	 public static void main(String args[]) {
	   
	   System.out.println("Hello world!");
	 }
	}


public:   modificador de acceso (ver después).
class:    el código que escribimos está dentro de una clase. Todo programa Java tiene que
		  estar dentro, por lo menos, dentro de una clase.
llaves{}: Delimitan bloques de código. Dónde empiezan y terminan:
			clases
			método
 			bucles
			...
		

*/



public class EstructurasPrincipales1 {
	
	public static void main(String args[]) {
		
		System.out.println("Hello world!");
	}
}

/*
Salida

	┌─[±][main ?:1 ✗][clase02EstructurasPrincipales1][]
	└─▪ ls
	EstructurasPrincipales1.java
	┌─[±][main ?:1 ✗][clase02EstructurasPrincipales1][]
	└─▪ javac EstructurasPrincipales1.java 
	┌─[±][main ?:1 ✗][clase02EstructurasPrincipales1][]
	└─▪ java EstructurasPrincipales1 
	Hello world!

Notas
Al compilar el programa se crea un archivo a
interpretar (bytecode) .class en la carpeta
bin

Fuentes:
Curso Java. Estructuras principales 1. Video 4
https://www.youtube.com/watch?v=Lj97ujkeUXc&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=4


*/



