/*Clase 13
 * 
 *Bucles 2
 *Do While
 * 
 *El bucle Do While sigue siendo un bucle indeterminado
 *Pero, a diferencia de While, primero ejecutará una serie de lineas de código
 *y luego mientras se cumpla una condición se repetirán esas lineas.
 *
 *Es decir, aunque la condición sea falsa si o si se ejecutaran esas lineas al menos una vez
 *
 *do {
 *
 *	linea1
 *	linea2
 *	...
 *
 *
 *}while(condicion);
 * 
 * 
 *Problema a resolver
 *
 *Cuál es el peso ideal 
 *
 *Datos
 *fórmulaHombre = altura - 110
 *fórmulaMujer  = altura - 120
 *
 *Pregunar si eres hombre o mujer - JoptionPane
 *Preguntar el peso
 *Devolver peso ideal
 *
 *Ahora bien, ¿Cuál es la razón para utilizar un bucle?
 *Para validar, ya que que ocurriría si el usuario no indica
 *ni femenino ni femenino. En ese caso mientras la condición sea verdadera o mientras
 *el género sea hombre o género sea mujer podremos repetir unas lineas de código
 * 
 * */

//Calcular peso ideal

import javax.swing.*;
import java.util.*;

public class DoWhile {

	public static void main(String[] args) {
		
		//variables
		/*String genero2 = "";
		String genero3 = "";
		int altura = 0;
		final int CoeficienteHombre = 110;
		final int CoeficienteMujer = 120;
		double pesoIdeal = 0;
		boolean trueFalse = true; */
		/*
		 *genero <- variable dónde se introducirá el género tipo string
		 *altura <- inicializada cómo 0 de tipo entero, ya que se le pedirá que la coloque en centímetros
		 *OperandoHombre <- En 110 para restar a la altura del hombre y obtener el peso ideal
		 *OperandoMujer <- En 120 pra restar a la altura de la mujer y obtener el peso ideal
		 *pesoIdeal <- Incializada en 0 dónde se almaacenará el resultdo final <- El peso ideal
		 * 
		 * 
		 * */
		
		//Presentación/*
		/*System.out.println("*************");
		System.out.println("Tu peso ideal");
		System.out.println("*************");
		*/
		//Calcular peso ideal
		//Ejecutar al menos una vez las siguientes lineas
		
		/*
		do {
			//Solicitar género al usuario por interfaz
			genero = JOptionPane.showInputDialog("Indique su género (M/F)");
			/*En la variable género guardo el género desde la intefaz desde el panel de opciones que muestra una ventana de diálogo para introducir datos
			 * */
		/*
		}while(genero.equalsIgnoreCase("M") == false && genero.equalsIgnoreCase("F") == false);
		/*Si el género indicado anteriormente es correcto. Hace el cálcula, sale del bucle y muestra el resultado.
		 *Si el género indicado anteriormente no está dentro de lo indicado, se repetirá nuevamente esas lineas de código hasta que la condición sea falsa
		 *
		 */
	
		
		/*
		String genero3 = JOptionPane.showInputDialog("Indique su género (M/F)");
		
		System.out.println(genero3);
		*/
		
		
		//Problema a consultar
		
		/*
		Scanner input = new Scanner(System.in);
		
		String saludo1 = "hola";
		String saludo2 = input.nextLine();
		
		
		if (saludo1 == saludo2) {
			System.out.println("son iguales");
		}else{
			System.out.println("no son iguales");
		}
		*/
		
		/*
		Inicio saludo1 con "hola"
		Pido un string por consola 
		Se introduce un hola
		Si saludo1 es igual a saludo2 imprimir son iguales
		Me imprime no son iguales ??
		
		//Salido
		>>hola
		>>no son iguales
		*/
		
		Scanner scan = new Scanner(System.in);
		
		String nombre = "carlos";
		String nombre2 = scan.nextLine();
		
		Boolean sonIguales = nombre == nombre2;
		System.out.println(sonIguales);
		
		//Problema a entender
		/*
		 * Java: ¿Por qué no me funciona la comparación de cadenas? Literales, clases y el repositorio de cadenas - campusmvp.es
		 * https://www.campusmvp.es/recursos/post/java-comparacion-de-cadenas-literales-clases-repositorio-de-cadenas.aspx
		 * 
		 * Foros aprenderaprogramar.com
		 * https://aprenderaprogramar.com/foros/index.php?topic=3361.0
		 * 
		 * aprenderaprogramar.com
		 * https://aprenderaprogramar.com/index.php?option=com_content&view=article&id=628:el-metodo-equals-en-java-diferencia-entre-igualdad-e-identidad-comparar-objetos-ejemplos-cu00662b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
		 * 
		 * */
		
		
		
		
		//System.out.println("Tu peso ideal es: " + pesoIdeal);
	}

}

/*
 *Fuentes:
 *
 *Curso Java Bucles 3. Video 20
 *https://www.youtube.com/watch?v=gzJn5MTSL5U&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=20
 * 
 * 
 */