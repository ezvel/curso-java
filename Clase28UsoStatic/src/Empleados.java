//Clase 28. Uso static

/*
Aplicable
	variables
	constantes
	métodos
	
Convirtiendose en
	variables de clase
	constantes de clase
	métodos de clase
	

Métodos static y sobrecarga de constructores



*/
public class Empleados {

	public static void main(String[] args) {
		
		 /*
		 Empleado empleado1 = new Empleado("Carlos", 1);
		 Empleado empleado2 = new Empleado("Agustina", 2);
		 */
		 Empleado empleado1 = new Empleado("Carlos");
		 Empleado empleado2 = new Empleado("Agustina");
		 
		 
		 System.out.println(empleado1.dameDatos());
		 System.out.println("");
		 
		 System.out.println(empleado2.dameDatos());
		 System.out.println("");
		 
		 
		 empleado1.cambiarSeccion("Limpieza");
		 
		 
		 System.out.println(empleado1.dameDatos());
		 System.out.println("");
		 System.out.println(empleado2.dameDatos());
		 System.out.println("");

		
		 System.out.println(empleado2.dameDatos());
		 System.out.println("");
		 
		 


	}

}

/*
Darle un número identificativo a cada empleado

Que pasaría si son muchisimos trabajadores
y nos equivocamos en los números de ID al añadirlos manualmente

Entonces.
Le podemos decir a Java que el mismo lo asigne automaticamente

---------------------------------------------------------------
STATIC
---------------------------------------------------------------

private final String nombre;
private String seccion;
private int ID;

Empleado empleado1 = new Empleado("Carlos", 1);
Empleado empleado2 = new Empleado("Agustina", 2);
 
-------------------------------------------------------
Cada objeto tiene una copia de cada variable declarada:
------------------------------------------------------

Empleado empleado1 = new Empleado("Carlos", 1);  private final String nombre
                                                 private String seccion
                                                 private int ID

Empleado empleado1 = new Empleado("Agustina", 2);private final String nombre
                                                 private String seccion
                                                 private int ID
    
Cómo cada uno recibe su copia estas copias son diferentes
ya que almacenamos distintos valores en las varables

Para que Java sigua los ID y las asigne correcta y automaticamente y
correlativamente. Necesitaremos que cada empleado no tuviera
su copia de Id sino una copia única de la variable ID para que se compartiera

Una copia única <- Static <- compartan todos los objetos las variable ID


Que sea static significa que pertenece a la clase, pero no
pertenece a ningún objeto, por lo tanto esa constante static
será compartida por todos los objetos


                                                 
                                                 



*/

class Empleado {
	
	private final String nombre;  //COPIA
	private String seccion;       //COPIA
	//private int ID;               //COPIA 
	//public static int ID; //
	private int ID;
	private static int IDSiguiente = 1;  //Declaramos el id siguiente en 1
	
	//public Empleado(String nombre, int ID)
	public Empleado(String nombre){
		
		this.nombre = nombre; 
		this.seccion = "administración";
		//this.ID = ID;	
		ID = IDSiguiente;
		IDSiguiente++; //Cada vez que creamos un objeto llamamos al constructor e incrementará por cada objeto 1 id 1, 2, 3, 4, ....
	}
	
	public void cambiarSeccion(String seccion) {
		
		this.seccion = seccion;
		
	}
		
	
	public String dameDatos() {
		
		return "Nombre: " + nombre +
				"\n" + "Sección: " + seccion +
				"\n" + "ID: " + ID;
		
	}
	
	
}

/*
 * 
 *public static final PI
 *Math.PI
 *
 *public static ID = 1
 *Emplado.ID
 * 
 * */


//SALIDA

/*

Nombre: Carlos
Sección: administración
ID: 1

Nombre: Agustina
Sección: administración
ID: 2

Nombre: Carlos
Sección: Limpieza
ID: 1

Nombre: Agustina
Sección: administración
ID: 2

Nombre: Agustina
Sección: administración
ID: 2

*/

/*
Curso Java. Uso static. Video 37
https://www.youtube.com/watch?v=QIV7FfXa-zY&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=37
Curso Java. Métodos static. Video 38
https://www.youtube.com/watch?v=V0wIZ-OglsY&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=38

*/



