
/*Clase 7
 *Primer acercamiento a las Api Paquetes
 *
 *Las Api de Java son las bibliotecas de clase
 *que vienen de forma predefinida con Java listas
 *para ser utilizadas
 *
 *Clases
 *Predefinidas - Api Java
 *Pripias - Creada por nosotros
 *
 *Cómo se organizan las clases en Java
 *Por carpetas
 *Estas carpetas se llaman paquetes dónde se guardan las clases prefefinidas
 *
 *
 *API Java organización
 *
 *
 *Paquetes     java     java.awt
 *						java.util		java.util.regex
 *						java.io
 *             
 *             javax    javax.activity
 *                      javax.annotation
 * 
 * 
 * java.lang  -->  String   ---> substring() equals()
 * 				   System
 * 				   Math     ---> round() sqrt()
 *                 Thread
 *                 
 *Paquete por defecto. Puedo usarla sin problemas
 *
 *
 *java.awt         --> ¿Cómo puedo utilizar estas clases?
 *java.utila
 *java.io
 *java.net
 *
 *
 *
 * 
 *Dentro de un paquete podemos tener otro paquete
 *a través del punto
 *Los paquetes son como carpetas, que pueden tener 
 *dentro otras subcarpetas o paquetes
 *Dentro de los paquetes hay clases cómo si fuesen archivos
 *
 *¿Por qué son necesarios los paquetes?
 *
 *Para organzar las clases
 *
 *Para evitar conflictos de nombres. No puedo tener
 *dos archivos con el mismo nombre dentro de una misma
 *carpeta. Así como puedo tener dos archivos con el mismo
 *nombre en diferente carpetas, puedo tener dos clases de java
 *con el mismo nombre en diferentes paquetes
 *
 *Para controlar la visibilidad de las clases
 *
 *Hasta ahora, en Eclipse, estabamos trabajando
 *paquetes por defecto. 
 *Cada vez que creamos una clase se nos ofrece
 *la posibilidad de especificar un paquete
 *"El uso del paquete por defecto está desaconsejado"
 *
 *
 * 
 * 
 * 
 * 
 *Fuentes:
 *Curso Java. Acercamiento a la Api paquetes. Video 13
 *https://www.youtube.com/watch?v=0M6qHYdlqpc&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=13
 *
 * */

//import java.util.*; //<- Importamos y accedemos a todas las clases (*) dentro del paquete util, dentro del paquete java.
//import java.util.Scanner; // <- Importamos y accedemos a la clase Scanner dentro del paquete util, dentro del paquete ava.
//import java.util.Locale;

public class ApiJava {

	public static void main(String args[]) {
		
		//String nombre; //<- String pertenece al paqueta java.lang, no habría problemas en utilizarlas
		//Scanner input;   // <- Pero para hacer uso de otros paquetes, necesito importarlas, no utilizarlas libremente. Le tenemos que decir al programa que valos a utilizar una clase que no está en java.lang
	}
}

// source -> organize imports -> agregará los import en Eclipse de acuerdo a las clases que tienes.



