//Clase 27. Uso de final y constantes
//Esta vez se hará en el mismo fichero
public class Empleados {

	public static void main(String[] args) {
		
		 Empleado empleado1 = new Empleado("Carlos");
		 Empleado empleado2 = new Empleado("Agustina");
		 
		 
		 System.out.println(empleado1.dameDatos());
		 System.out.println("");
		 System.out.println(empleado2.dameDatos());
		 System.out.println("");
		 
		 //Cambiar sección del empleado 1
		 empleado1.cambiarSeccion("Limpieza");
		 
		 //Con la modificación volvemos a mostrar los resultados por consola
		 System.out.println(empleado1.dameDatos());
		 System.out.println("");
		 System.out.println(empleado2.dameDatos());
		 System.out.println("");

		 //Cambiar el nombre al empleado2
		 //empleado2.cambiarNombre("Marta"); <- ya el setter quedó comentado
		 
		 //Mostramos el resultado del empleado 2 cambiandole el nombre
		 System.out.println(empleado2.dameDatos());
		 System.out.println("");
		 
		 //*1
		 /*
		  * Si el nombre no quiero que se cambie de ninguna manera, ni
		  * siquiera con un setter
		  * 
		  * Si queremos que el valor de la variable nombre no cambie,
		  * la declaramos en una constante.
		  * 
		  * */

	}

}


class Empleado {
	
	//private String nombre;
	private final String nombre; // con el final definimos una constante, es decir, lo construye cómo una constante.
	private String seccion;
	
	public Empleado(String nombre) {
		
		this.nombre = nombre; //<- el this hace referencia al objeto. Segundo, ayuda a diferencia entre una propiedad y un argumento o parámetro
		this.seccion = "administración";
		
	}
	
	//setters - cambiar la sección a la que pertenece el trabajador. No para agregarle una funcionalidad sino para modificar una propiedad
	//cómo la sección ya está establecida y encapsulada en la clase, con setter puedo darle el permiso al usuario a cambiar el nombre de la sección al convocar o llamar el método setters
	public void cambiarSeccion(String seccion) {
		
		this.seccion = seccion;
		
	}
	
	/* -> Comentamos el setter.
	 *    No se quiere al nombre poder cambiar
	 *    Entonces lo definimos por constante
	 *    eliinamos el setter ya que no tienen sentido
	//Cambiar el nombre
	public void cambiarNombre(String nombre) {
		
		this.nombre = nombre;
		
	}
	*/
	
	//Getter para devolver las propiedades de la clase al objeto
	public String dameDatos() {
		
		return "Nombre: " + nombre +
				"\n" + "Sección: " + seccion;
		
	}
	
	
}

//SALIDA

/*

Nombre: Carlos
Sección: administración

Nombre: Agustina
Sección: administración

Nombre: Carlos
Sección: Limpieza

Nombre: Agustina
Sección: administración

Nombre: Marta <- No tiene ningún sentido que le cambiemos el nombre *1 <- ahora la declararemos cómo una constante
Sección: administración


*/



