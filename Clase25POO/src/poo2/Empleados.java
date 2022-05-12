package poo2;

public class Empleados {

	public static void main(String[] args) {
		
		//Instanciar clases por cada objeto - empleado
		Empleado empleado1 = new Empleado("Carlos Lopez", 60000, 2000, 05, 23);
		Empleado empleado2 = new Empleado("Ana Gutierrez", 75000, 2008, 06, 03);
		Empleado empleado3 = new Empleado("Juan Martinez", 81000, 2010, 01, 10);
		
		//Convoco a la función o método y le paso al setter el porcentaje de aumento y devolverá el sueldo total
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		
		
		//Mostrar por consola al empleado1
		System.out.println("Nombre: " + empleado1.dameNombre() + 
				"\n" + "Sueldo: " + empleado1.dameSueldo() +
				"\n" + "Fecha de alta: " + empleado1.dameFechaContrato());
		System.out.println("");
		
		//Mostrar por consola al empleado2
		System.out.println("Nombre: " + empleado2.dameNombre() + 
				"\n" + "Sueldo: " + empleado2.dameSueldo() +
				"\n" + "Fecha de alta: " + empleado2.dameFechaContrato());
		System.out.println("");
		
		//Mostrar por consola al empleado3
		System.out.println("Nombre: " + empleado3.dameNombre() + 
				"\n" + "Sueldo: " + empleado3.dameSueldo() +
				"\n" + "Fecha de alta: " + empleado3.dameFechaContrato());
		System.out.println("");
		
	}

}
