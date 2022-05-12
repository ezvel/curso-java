package poo;

public class Empleados {

	public static void main(String[] args) {
		
		Empleado[] misEmpleados = new Empleado[3]; 
		
		misEmpleados[0] = new Empleado("Carlos Lopez", 63000, 2000, 05, 23);
		misEmpleados[1] = new Empleado("Ana Gutierrez", 81000, 2008, 06, 03);
		misEmpleados[2] = new Empleado("Juan Martinez", 63000, 2010, 10, 23);
		
		
		for(int i = 0; i < misEmpleados.length; i++) {
			
			misEmpleados[i].subeSueldo(5);
			
		}
		
		for(int i = 0; i < misEmpleados.length; i++) {
			
			System.out.println("Nombre: " + misEmpleados[i].dameNombre() + 
					"\n" + "Sueldo: " + misEmpleados[i].dameSueldo() +
					"\n" + "Fecha de alta: " + misEmpleados[i].dameFechaContrato());
			System.out.println("");
			
		}
		
		
		
		//ForEach
		/*
		for(Empleado e: misEmpleados) {
			
			e.subeSueldo(5);
		}
		
		for(Empleado e: misEmpleados) {
			
			System.out.println("Nombre: " + e.dameNombre() + 
					"\n" + "Sueldo: " + e.dameSueldo() +
					"\n" + "Fecha de alta: " + e.dameFechaContrato());
			System.out.println("");
			
		}
		*/
		
	}
}


/*

SALIDA


Nombre: Carlos Lopez
Sueldo: 66150.0
Fecha de alta: Tue May 23 00:00:00 ART 2000

Nombre: Ana Gutierrez
Sueldo: 85050.0
Fecha de alta: Tue Jun 03 00:00:00 ART 2008

Nombre: Juan Martinez
Sueldo: 66150.0
Fecha de alta: Sat Oct 23 00:00:00 ART 2010

*/
