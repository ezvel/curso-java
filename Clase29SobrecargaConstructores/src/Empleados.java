/*
Clase 29. Sobrecargas de constructores.

Tomamos el ejemplo de clases pasadas
Los constructores le dan estados iniciales a los objetos
El método constructor tiene el mismo nombre que la clase
No lleva no void ni devolver datos
Una clase puede tener varios métodos con el mismo nombre de la clase
Es decir una clase puede tener varios métodos constructores
Pero debe tener diferentes números de argumentos
Para darle a los objetos diferentes estados iniciales
nombre
sueldo
fecha de alta
Que pasa si desconocemos una fecha de alta o un sueldo a un empleado nuevo
Si desconocemos el sueldo o fecha de alta que le pasamos cómo parámetro?
Otro método constructor


Cómo distingue Java a que constructor llamar si los dos
tienen el mismo nombre?

misEmpleados[0] = new Empleado(---,---,---,----,----);
misEmpleados[3] = new Empleado(---);

Java lo distingue por el número de parámetros que le pases
Si queres llamar al constructor que tiene un solo argumento
le pasarías 1 solo parámetro.
De esta manera Java sabrá a que método constructor llamar

¿Qué hacemos con esto?

	Sueldo: 0.0  
	Fecha de alta: null

Datos por defecto
Colocarle por defecto en la llamada al método en el main
Que pasaría si son muchos empleados?
Colocarlos manualmente?
No es una buena idea
Utilizar el this <- el this referencia a la variable de la clase a que hace referencia

Colocamos el this y entre paréntesis el nombre y los demás datos. 
EL this hará referencia a la clase que tiene ese número de argumentos
Relacionará cada dato de mi this con esas variables
Por lo tanto cada objeto que instancia a la clase recibirá esos datos por defecto

public Empleado(String nombre) {

	this(nombre, 30000, 2000, 01, 01);

}

Este this hace referencia a la clase que tiene esa cantidad de argumentos

public Empleado(String nombre, double sueldo, int año, int mes, int dia) <---- {
	
	
	
}




*/

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleados {

	public static void main(String[] args) {
		
		Empleado[] misEmpleados = new Empleado[4]; 
		
		misEmpleados[0] = new Empleado("Carlos Lopez", 63000, 2000, 05, 23);
		misEmpleados[1] = new Empleado("Ana Gutierrez", 81000, 2008, 06, 03);
		misEmpleados[2] = new Empleado("Juan Martinez", 63000, 2010, 10, 23);
		misEmpleados[3] = new Empleado("Gabriel Perez");
		
		
		/*
		  Nombre: Carlos Lopez
			Sueldo: 66150.0
			Fecha de alta: Tue May 23 00:00:00 ART 2000
			
			Nombre: Ana Gutierrez
			Sueldo: 85050.0
			Fecha de alta: Tue Jun 03 00:00:00 ART 2008
			
			Nombre: Juan Martinez
			Sueldo: 66150.0
			Fecha de alta: Sat Oct 23 00:00:00 ART 2010
			                                                  ^
			Nombre: Gabriel Perez <-   solo tiene el nombre   |
			Sueldo: 0.0  
			Fecha de alta: null

		  */
		
		/*
		 LUEGO DE UTILIZAR EL THIS:
		 
			Nombre: Carlos Lopez
			Sueldo: 66150.0
			Fecha de alta: Tue May 23 00:00:00 ART 2000
	
			Nombre: Ana Gutierrez
			Sueldo: 85050.0
			Fecha de alta: Tue Jun 03 00:00:00 ART 2008
	
			Nombre: Juan Martinez
			Sueldo: 66150.0
			Fecha de alta: Sat Oct 23 00:00:00 ART 2010
	
			Nombre: Gabriel Perez  <--- AHORA TENGO LOS DATOS POR DEFECTO SIN AGREGARLOS MANUALMENTE POR CADA OBJETO CREADO. SINO QUE YA ESTÁN LOS DATOS ESCRITOS EN LA CLASE.
			Sueldo: 31500.0
			Fecha de alta: Sat Jan 01 00:00:00 ARST 2000
		
		*/

		
		
		for(int i = 0; i < misEmpleados.length; i++) {
			
			misEmpleados[i].subeSueldo(5);
			
		}
		
		for(int i = 0; i < misEmpleados.length; i++) {
			
			System.out.println("Nombre: " + misEmpleados[i].dameNombre() + 
					"\n" + "Sueldo: " + misEmpleados[i].dameSueldo() +
					"\n" + "Fecha de alta: " + misEmpleados[i].dameFechaContrato());
			System.out.println("");
			
		}
		
	}
}


class Empleado {
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	
	public Empleado(String nombre, double sueldo, int año, int mes, int dia) {
		
		this.nombre = nombre;    // <- estados iniciales
		this.sueldo = sueldo;
		
		GregorianCalendar calendario = new GregorianCalendar(año, mes - 1, dia);
	    
		this.altaContrato = calendario.getTime(); 
		
	}
	
	//OTRO MÉTODO CONSTRUCTOR <- sobrecarga de constructores <- varios constructores dentro de la misma clase
	public Empleado(String nombre) {
		
		//this.nombre = nombre;
		this(nombre, 30000, 2000,01,01); //Sigue teniendo un argumento. Pero al utilizar el this hace referencia al constructor que tiene el número de parámetros que tiene el this(--- --- -- -- --)
		
	}
	
	public String dameNombre() {
		
		return nombre;
		
	}
	
	public double dameSueldo() {
		
		return sueldo;
		
	}
	
	public Date dameFechaContrato() {
		
		return altaContrato;
		
	}
	
	public void subeSueldo(double porcentaje) {
		
		double aumento = (this.sueldo * porcentaje) / 100;
		sueldo+=aumento;
		
	}
	
	
}

/*
 FUENTES:
 Curso Java. Sobrecargas de constructores. Video 39
 https://www.youtube.com/watch?v=_ZWcobe9afw&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=39
 
 * */


