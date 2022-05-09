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
		String genero = "";
		int altura = 0;
		final int CoeficienteHombre = 110;
		final int CoeficienteMujer = 120;
		int pesoIdeal = 0;
		/*
		 * 
		 *genero <- variable dónde se introducirá el género tipo string
		 *altura <- inicializada cómo 0 de tipo entero, ya que se le pedirá que la coloque en centímetros
		 *OperandoHombre <- En 110 para restar a la altura del hombre y obtener el peso ideal
		 *OperandoMujer <- En 120 pra restar a la altura de la mujer y obtener el peso ideal
		 *pesoIdeal <- Incializada en 0 dónde se almaacenará el resultdo final <- El peso ideal
		 * 
		 * 
		 * */
		
		//Presentación/*
		System.out.println("*************");
		System.out.println("Tu peso ideal");
		System.out.println("*************");
		
		//Calcular peso ideal
		//Ejecutar al menos una vez las siguientes lineas
		
		
		do {
			//Solicitar género al usuario por interfaz
			genero = JOptionPane.showInputDialog("Indique su género (M/F)");
			/*En la variable género guardo el género desde la intefaz desde el panel de opciones que muestra una ventana de diálogo para introducir datos
			 * */
		
		}while(genero.equalsIgnoreCase("M") == false && genero.equalsIgnoreCase("F") == false);
		/*Si el género indicado anteriormente es correcto. Hace el cálcula, sale del bucle y muestra el resultado.
		 *Si el género indicado anteriormente no está dentro de lo indicado, se repetirá nuevamente esas lineas de código hasta que la condición sea falsa
		 *Al utilizar el ignore case no distingue entre mayúsculas y minúsculas. Por lo tanto es lo mismo colocar H o h, o bien,colocar F o f
		 */
	
		altura = Integer.parseInt(JOptionPane.showInputDialog("Indique su altura en centímetros: "));
		//Solicito la altura
		
		if (genero.equalsIgnoreCase("M") == true) {
			pesoIdeal = altura - CoeficienteHombre;
			
		}else if(genero.equalsIgnoreCase("F")) {
			pesoIdeal = altura - CoeficienteMujer;
		}
		

	
		System.out.println("Tu peso ideal es: " + pesoIdeal + " Kg.");
	}

}

/*Surgía un problema ante estas lineas de código
 * 
 * 
 * 		Scanner scan = new Scanner(System.in);
		
		String nombre = "carlos";
		String nombre2 = scan.nextLine();
		
		Boolean sonIguales = nombre == nombre2;
		System.out.println(sonIguales);
 * 
 * Al comparar con el operador de igualdad nombre y nombre2 que
 * tenían el mismo valor pero daban falso.
 * 
 * Hay dos maneras de crear variables con String. String al ser
 * un tipo de dato no primitivo utiliza clases
 * Los objetos, entonces, al no ser estáticos, necesitan ser instanciados
 * Las variables primitivas se acceden al valor
 * Las variables no primitivas se acceden a la referencia o locación de memoria
 * Si intentas comparar dos primitivos, comparas los valores
 * Si intentas comparar dos no primitivos cómo String, comparas la referencia a la locación de memoria
 * 
 * Por esa razón no son iguales nombre y nombre2, ya que sus referencias no son las mismas
 * 
 * Al crear una variable string con "new String" estas creando una nueva cadena y aunque tengan el mismo valor, sus locaciones serán distintas
 * Al crear una variable string con String nombre = "" estas colocando la variable en una locación en el repositorio de cadenas o string constant pool,
 * Al crear otra variable de igual manera, se accede al repositorio de cadenas y se busca la ubicación no el valor
 * Al encontrar la referencia con el mismo valor y ,ya que las cadenas son inmutables, no crea otra ubicación, sino que devuelve la referencia a la ubicación en memoria
 * 
 * Por eso:
 * String a = "carlos";
 * String b = "carlos";
 * 
 * a == b // <- retorna true no por el valor sino porque las dos están en la misma ubicación en memoria, ya que no se puede crear otra ubicación debido a la inmutabilidad de las cadenas
 * 
 * Ahora bien:
 * 
 * String c = new String("juan");
 * String d = new String("juan");
 * 
 * c == d  // <- retorna false porque ya no se encuentrar en el repositorio de cadenas, sino que se creo para las dos un nuevo objeto de la clase String apuntando a dos direcciones de memoria diferente
 * 
 * 
 * Teniendo esto en cuenta. Por qué lo siguiente?
 * 
 *  
 * 		Scanner scan = new Scanner(System.in);
		
		String nombre = "carlos";
		String nombre2 = scan.nextLine();
		
		Boolean sonIguales = nombre == nombre2;
		System.out.println(sonIguales);
		
		Las dos fueron creadas cómo literales de cadenas
		Por lo tanto no se creó un nuevo objeto cadena
		Entoces las dos deberían apuntar a la misma dirección en memoria
		y la igualdad debería dar true, pero da false
		
		
	Todavía no puedo encontrar la respuesta. Tengo la suposición que tanto el objeto Scanner en su método nextLine() y
	el objeto estático JoptionPane, devuelven un new String y no un literal de cadena. Por esa razón devuelven una nuevo objeto cadena
	y aunque tengan el mismo valor no tienen la misma ubicación en memoria.
	
	Al comparar con equals, estamos comparando caracter por caracter ,es decir, valores y no ubicaciones en memoria
	Por eso se recomienda no comparar los strings con (==), sino con equals.
	
		
		
 * */

/*
  Fuentes:
  
  Curso Java Bucles 3. Video 20
  https://www.youtube.com/watch?v=gzJn5MTSL5U&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=20
   		  
  Java: ¿Por qué no me funciona la comparación de cadenas? Literales, clases y el repositorio de cadenas - campusmvp.es
  https://www.campusmvp.es/recursos/post/java-comparacion-de-cadenas-literales-clases-repositorio-de-cadenas.aspx
		 
  Foros aprenderaprogramar.com
  https://aprenderaprogramar.com/foros/index.php?topic=3361.0
		  
  aprenderaprogramar.com
  https://aprenderaprogramar.com/index.php?option=com_content&view=article&id=628:el-metodo-equals-en-java-diferencia-entre-igualdad-e-identidad-comparar-objetos-ejemplos-cu00662b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188		  
		  
  String Literal vs String Object | Difference between String literal and String object (Java) - EasyConcepts
  https://www.youtube.com/watch?v=rneINcFcPO8


  Tricky Interview Question | Difference between String Literal and String Object in Java - TechStack9 
  https://www.youtube.com/watch?v=ykqbCdz6Mk0


  .equals() vs. == in Java - The Real Difference - Coding with John
  https://www.youtube.com/watch?v=AoUVdLWLFQw

  String Pool in Java | How many String object with String s = new String("ABC"). - Pradeep Gorai
  https://www.youtube.com/watch?v=UKG1xgh_tbQ
  
 */