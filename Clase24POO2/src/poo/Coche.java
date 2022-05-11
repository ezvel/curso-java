/*
Clase 24
Modularización y encapsulamiento

Dividir un programa en pequeños módulos o clases

Equipo de audio

	clase1 - parte1 - 
	clase2 - parte2 -
	Clase3 - parte3 -
	Clase4 - parte4 -
	
Los objetos dependen de la clase
Un proyecto o paquete divido en  archivos clases arrancará por la clase principal con el método main

El operador new llama al contructor de la clase para
así heredar sus propiedades y métodos
Luego vuelve a la clase principal

La clase public o públic es la que tendrá el nombre
del archivo <- clase principal
Dentro de la clase public tieen que tener el método main

El resto de las clases no tieenn que ser ni pública
ni main

Encapsulación
Módulos conectados entre sí en un equipo de audio
Esa conexión permite que funcionen las partes en un todo

 * ---------- * ----------- * ------------ *
 
Las clases se comunican entre sí con métodos
Hay cosas que solo se pueden hacer desde el propio módulo o clase
Hay cosas que solo se pueden hacer desde la clase principal

Encapsulación la funcionalidad se haga solo de la propia clase

Serie de datos que tienen que encapsularse
Que las propieddes solo se puedan modificar desde la 
propia clase, igual que solo puedo modificar el volumen
del equipo desde la propia parte

Agregar modificador de acceso
Delante del dato que quiero encapsular colocar private <- privado
De esa manera se puede encapsular el dato
Cuándo encapsulas solo el dato se hace visible desde la propia clase

No puedo acceder desde un objeto ni modificarlo ya que las propiedades están en private
Pero los módulos pueden conectarse
Poder en un equipo modificar el volumen por ejemplo
Pero habrá cosas que solo se pueden modificar desde el propio módulo

Hay datos o propiedaeds que están encapsulados
Hay funcionalidades que no están encapsuladas cómo el volumen

Cómo conectar las clases <- métodos <- nuestras clases interactuen entre sí formando una unidad para que funcione


Encapsulación
Modificación y propiedades
Métodos setters y getters <- métodos para interactuar entre módulos

Modificar el objeto desde el canal correspondiente
de aquello que se pueden modificaar
	
	
Métodos Setters o definidores
	Encargado de establecer el valor de una propiedad
	
	public void nombreMetodo(){
		
		codigo
	}
	
	void indica que el método no devuelve ningún valor
	
	
Métodos Getters o captadores
	Encargado de obtener el valor de una propiedad
	
	public tipoDato datoObtener nombreMetodo() {
		
		codigo + return
	
	}
	
	
	
*/

package poo;

public class Coche {
	
	//Características comunes <- encapsulamos con private aquellas propiedades que no queremos que se accedan o modifiquen
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoPlataforma;
	private int pesoTotal;
	//Características que pueden variar en cada objeto
	private String color;
	private int asientos;
	private boolean climatizador;
	
	public Coche() {
		
		//Con el constructor estado inicial de nuestra clase o los objetos que se creen a partir de él
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		pesoPlataforma = 500;
		
	}
	
	//método getter para dar permiso al objeto a obtener el valor de una propiedad, pero sin modificarla
	public String dimeDatosGenerales() {
		
		return "La plataforma del vehículo tiene " + ruedas + " ruedas." + 
		" Mide " + largo/1000 + " metros con un ancho de " +
		ancho + "cm y un peso de plataforma de " + pesoPlataforma + " kg.";
		
	}
	//Le estoy dando el permiso desde la clase para que se obtenga la propiedad
	
	//método setter para dar permiso a poder modificarse desde un objeto
	
	//SETTERS color - asientos - climatizador
	
	//color - setters
	public void estableceColor(String color) { //<- parámetros para pasarle un valor
		
		this.color = color;
		
	}
	
	//asientos - setters
	public void establecerAsientos(int asientos) {
		
		this.asientos = asientos;
		
	}
	
	//climatizador - setters
	public void establecerClimatizador(boolean climatizador) {
		
		if(climatizador == true) {
			
			this.climatizador = true;
			
		} else if (climatizador == false) {
			
			this.climatizador = false;
			
		}
		
	}
	
	//GETTER color - asientos - climatizador
	
	//color - getters
	public String dimeColor() {
		
		return "El color del coche es " + color + ".";
		
	}
	
	//asientos - getters
	public String dimeAsientos() {
		
		return "El coche tiene " + asientos + " asientos.";
		
	}
	
	//climatizador - getters
	public String dimeClimatizador() {
		
		if(climatizador == true) {
			
			return "El coche tiene climatizador";
			
		}else {
			return "El choche no tiene climatizador";
		}
		
	}
	
	//Setter y getter  <- Practica no recomendada, mejor tener los getters y setters por separado
	
	//Peso del coche
	public String dimePesoCoche() {
		
		int pesoCarroceria = 500;
		
		pesoTotal = pesoPlataforma + pesoCarroceria;
		
		if (asientos == 4) {
			
			pesoTotal = pesoTotal + 50;
			
		}
		
		
		if(climatizador = true) {
			
			pesoTotal = pesoTotal + 10; //Establece valor variable
		}
		
		return "El peso del coche es " + pesoTotal + "Kg."; //Devuelve o obtiene el peso total
		
		
	}
	
	//Precio del coche según el peso
	public String dimePrecioCoche() {
		
		int precioFinal = 10000;
		
		if(asientos == 4) {
			
			precioFinal+=2000;
			
		}
		
		if(climatizador == true) {
			
			precioFinal+=1500;
			
		}
		
		return "El precio final es " + precioFinal;
		
	}
	
	
}



/*
Fuentes:
Curso Java. POO 3. Video 29
https://www.youtube.com/watch?v=RZOSJ2zuxIs&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=29

Curso Java. POO 4. Getters y Setters. Video 30
https://www.youtube.com/watch?v=7ALMZymOs_s&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=30

Curso Java. POO 5. Paso de parámetros. Video 31
https://www.youtube.com/watch?v=YQinPQVpSd4&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=31

Curso Java. POO 6. Construcción objetos. Video 32
https://www.youtube.com/watch?v=jht07O7_R9w&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=32

Curso Java. POO 7. Construcción objetos 2. VIdeo 33

*/

