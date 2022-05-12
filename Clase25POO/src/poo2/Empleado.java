package poo2;

//GregorianCalendar pertenece a java.util
import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {
	
	//Creamos las variables encapsuladas . Propiedades de nuestro modelo, clase, forma, molde
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	
	//Construtor para darle un estado inicial a mis variables
	public Empleado(String nombre, double sueldo, int año, int mes, int dia) {
		
		this.nombre = nombre; // <--> sin this. --> nombre == nom si ..Empleado(String nom, ...
		this.sueldo = sueldo;
		
		GregorianCalendar calendario = new GregorianCalendar(año, mes - 1, dia);
	    
		this.altaContrato = calendario.getTime(); 
		
	}
	
	//Getter para dar permiso por canal desde un objeto
	public String dameNombre() {
		
		return nombre;
		
	}
	
	public double dameSueldo() {
		
		return sueldo;
		
	}
	
	public Date dameFechaContrato() {
		
		return altaContrato;
		
	}
	
	//Método o función dentro de una clase. Lo hace con un setter, ya que puede ser modificada. Estos métodos dependerán de objeto a objeto
	public void subeSueldo(double porcentaje) {
		
		double aumento = (this.sueldo * porcentaje) / 100;
		sueldo+=aumento;
		
	}
	
	
}


//Utilizar la clase gregorian calendar -> ver constructores -> para instanciar la clase en un objeto pasandole cómo parámetos las variables de dia, mes y año

//java.util.GregorianCalendar hereda de la clase Calendar
//y GregorianCalendar tiene los métodos y propiedades heredadas de Calendar
//y Calendar tiene el método getTime();


//Fuentes:


/*
  
Curso Java POO 9. Constructor objetos. Video 35.
https://www.youtube.com/watch?v=63Uhd3pUZxA&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=35

*/
