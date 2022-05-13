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
		 
		 
		 System.out.println(Empleado.dameIDSiguiente());
		 


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

Métodos static y sobrecarga de constructores

Si una variable o constante que se declare cómo static
signfica que pertenecerá a las clases y no a los objetos,
es decir, que no se crearán copias a los objetos y que la manera
que lo obtengan sea por medio de un getter. De la misma
manera los métodos estáticos son métodos que pertenecerán
a las clases y no a los objetos

Que sea static significa que pertenece a la clase, pero no
pertenece a ningún objeto, por lo tanto esa constante static
será compartida por todos los objetos

No puedo decir objeto.variableEstatica
No puedo decir objeto.metodoEstatico

Porque las variables, constantes y métodos estáticos no están
en los objetos, sino en las clases 

clase.metodoEstatico
clase.varableEstatica

Cabe aclarar <- le dimos el permiso



POR ESTA RAZÓN CUÁNDO CONVOCAVAMOS AL MÉTODO MATH Y A 
CUALQUIER MÉTODO QUE ERA STATIC NO CREABAMOS UN OBJETO, ES 
DECIR, NO INSTANCIABAMOS UN OBJETO CÓMO A UN MÉTODO QUE NO ERA
STATIC CÓMO SCANNER. EN CAMBIO, UTILIZABAMOS EL NOMBRE DE LA 
CLASE (NO DEL OBJETO PORQUE SON MÉTODOS QUE ESTÁN EN LA CLASE Y
NO EN EL OBJETO) Y CON EL PUNTO (.) ACCEDER AL MÉTODO


Scanner input = new Scanner(System.in) <- no estático, se crea a partir de la clase una copia hacia los objetos en el momento que se instancia
Math.sqrt(x) <- es estático, por lo tanto vive en la clase y no en el objeto. ¿Con qué sentido se instanciaría la clase en un objeto?. Entonces, llamamos al método desde la clase

RESUMEN:

TODO PROGRAMA COMIENZA A EJECUTARSE CON UN MÉTODO MAIN
PUEDE TENEN MUCHAS CLASES DIVIDIDAS O NO EN DIFERENTES ARCHIVOS
TIENE QUE TENER UNA CLASE PRINCIPAL PUBLICA
ESA CLASE CONTIENE EL MAIN
EL MAIN NO DEVUELVE DATOS, NO TIENE RETURN. POR LO TANTO TIENE VOID O VACÍO
ACCESO PUBLIC. PUEDO ACCEDER DESDE FUERA DE LA CLASE
STATIC PORQUE EL MÉTODO MAIN ES ESTÁTICO. CUÁNDO COMENZAMOS UN PROGRAMA EN JAVA NINGUNA CLASE DEPENDE DEL MAIN. NO ACTÚA SOBRE NINÚN OBJETO
ES EL MAIN QUE CREA LOS PROGRAMAS, ES DECIR, NO HAY NINGÚN OBJETO CONSTRUIDO ANTES DEL MAIN

ANTES DEL MAIN NO HAY NINGÚN OBJETO CONSTRUIDO QUE DEPENDA O SEA LLAMADO POR UNA CLASE EXTERNA
ES EL MAIN QUIEN CONSTRUYE OBJETOS Y LLAMA A MÉTODOS
CÓMO NO HAY OBJETOS CONSTRUIDO PUEDE SER UTILIZADO SIN LA NECESIDAD DE OBJETOS
POR ESO EL PROGRAMA ARRANCA EN EL MAIN

EL MÉTODO MAIN RECIBE PARÁMETROS
UN ARREGLO LLAMADO ARGS DE TIPO STRING

public class .... {
	
	public static void main(String args[]) {}

}

LOS MÉTODOS ESTÁTICOS NO ACTÚAN SOBRE CAMPOS DE EJEMPLAR O DE CLASE
ES DECIR LOS MÉTODOS ESTÁTICOS NO PODRÍA ACCEDER A LAS VARIABLES DE LA CLASE
A NO SER DE QUE LAS VARIABLES SEAN TAMBIÉN ESTÁTICA




                                                 
                                                 



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
	
	public static String dameIDSiguiente() {
		
		return "El ID siguiente es: " + IDSiguiente;
		
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

El ID siguiente es: 3


*/

/*
Curso Java. Uso static. Video 37
https://www.youtube.com/watch?v=QIV7FfXa-zY&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=37
Curso Java. Métodos static. Video 38
https://www.youtube.com/watch?v=V0wIZ-OglsY&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=38


*/



