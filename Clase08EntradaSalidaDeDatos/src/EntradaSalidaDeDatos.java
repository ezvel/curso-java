/*
Clase 8
Entrada y salida de datos con Scanner y formatos de resultados

El proceso computacional y de informática básico es:

Entrada de datos  	  --  periféricos de entrada
Proceso           	  --  intervienen la RAM y el CPU -- periféridos entrada - salida
Salida de información --  periféricos de salida


Entrada --> Proceso --> Salida

Cuándo salen datos, salen información que está en nuestro sistema hacia
el exterior para el o los usuarios
System.out -->

Ahora veremos cómo introducir datos en nuestro programa

IGU -> Interfaz gráfica de usuario  --> GUI  -> DESDE LA INTEFAZ SE PUEDEN INTRODUCIR DATOS 
                                             -> Introducir datos y ver la salida de 
                                                información
                                             -> Necesitamos -> swing
                                                            -> awt

Por ahora introduciremos datos por consola


java --  java.util -- clase Scanner -- Consola
                            métodos -- nextLine()    
                                    -- nextInt()     
                                    -- nextDouble()

Clase JOptionPane   --> método estático showInputDialog()  -> estático siginifica que tenemos que utilizar el nombre del método delante de la clase.
Construye una ventana gráfica


Métodos estáticos
Math.round()
JoptionPane.showInputDialog()


Métodos no estáticos
En los métodos implica que utilises un objeto que se instancie de la clase
Crear un objeto para utlizarla
Para instanciar una clase
Llamamos a la clase Scanner
Especificamos el nombre del objeto que heredará las propiedades y métodos de la clase a instanciar: Scanner
Y dentro de él creare
Constructor <- Es un método especial. Incluye el nombre de la clase a utilizar: Scanner

Esto no
Scanner.nextInt()  -> NO

Esto si
Scanner miObjeto = new Scanner(File source)

Por lo tanto
Scanner input = new Scanner(System.in)  <= => System.out  

Tengo que guardar lo que introduzca el usuario en una variable
del mismo tipo que el método de Scanner


"""
	Scanner(File source)
	Constructs a new Scanner that produces values scanned from the specified file.

"""

Formatear los resultados


*/

//import java.util.Scanner;
import javax.swing.*;

public class EntradaSalidaDeDatos {

	public static void main(String args[]) {
		
		//Scanner
		/*
		Scanner entrada = new Scanner(System.in); //<- el scanner luego del operador de asignación es el constructor
		
		System.out.println("Introduzca su nombre: ");
		String nombre = entrada.nextLine();
		System.out.println("Introduzca su edad: ");
		int edad = entrada.nextInt();
		
		System.out.println("Su nombre es " + nombre + " y su edad es de " + edad + " años.");
		*/
		
		//JoptionPane
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		String edad = JOptionPane.showInputDialog("Introduce la edad");
		/*->*/int edadEntero = Integer.parseInt(edad); //Integer.parseInt(String)
		edadEntero++; //Operador de incremento -> edad+=1 -> edad = edad + 1
		/*->*/double edadDouble = Double.parseDouble(edad);//Double.parseDouble(String)
		edadDouble++;
		
		//System.out.println("Su nombre es " + nombre + " y el año que viene tendrás " + (edad + 1) + " años.");
		System.out.println("Su nombre es " + nombre + " y el año que viene tendrás " + (edadEntero) + " años.");
		System.out.println("Su nombre es " + nombre + " y el año que viene tendrás " + (edadDouble) + " años.");
		
	}

}

/*JOptionPane.showInputDialog devuelve un String
 *Por lo tanto la variable que almacenará la edad tiene que ser un String
 *El problema surge que al sumar edad + 1 para decirle cuántos años tendrá el año que viene, necesite sumarlo
 *El problema es que no opera los números
 *Sino que concatena el string
 *
 *Salida
 *	Su nombre es Ezequiel y el año que viene tendrás 271 años.
 *
 *Ante esto lo mejor será acceder a un método de la clase Integer
 *Este método es parseInt
 *Al ser un método estático no necesita instanciarse una clase
 *Sino usarla libremente
 *Al no ser del paquete lang
 *Se requiere importar la misma
 *Luego utilizamos Integer.parseInt(El string que queremos convertir)
 *
 *Salida:
 *	Su nombre es Ezequiel y el año que viene tendrás 28 años.
 *
 *Podemos hacer lo mismo con Double
 *
 *Double.parseDouble();
 *
 *Salida
 * 	Su nombre es Ezequiel y el año que viene tendrás 28.0 años.
 * 
 * 
 * 
 * */

