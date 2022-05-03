/*Clase 5
 * Cálculos matemáticos y la clase Math
 * 
 * Clase: Todo programa en Java tiene que estar compuesto
 * por lo menos de 1 clase
 * 
 * Clases en Java
 * 
 * Propias
 * Creadas por el programador
 * 	
 * 	public class HolaMundo {}
 * 
 * Predefinidas
 * Predifinidas por Java
 * Se nos suministra para poder utilizarlas
 * Son lineas de código empaquetadas en una clase listas
 * para se convocadas, llamadas o ejecutadas. Podemos pasarles
 * parámetros para modificar su comportamientos a igual que una función
 * De hecho los métodos en las clases son funciones
 * 
 * 		String
 * 		Math
 * 		Array
 * 		Thread
 * 
 * Las clases predefinidas viene con
 * 	propiedades: rasgos
 * 	métodos: lo que la clase puede hacer
 * 
 * Las clases vienen dentro de las API Java para
 * ser consultadas, ya que es dificil acordarse de todas
 * las clases que existen. La API Java es una
 * biblioteca con todas las clases allí
 * 
 * Podemos acudir a ella a través del siguiente enlace
 * https://docs.oracle.com/javase/7/docs/api/
 * https://docs.oracle.com/en/java/javase/11/docs/api/
 * 
 * 
 * 3 ventanas o paneles
 * 
 * 
 * Clase Math
 * Math.sqrt(n) - raiz cuadrada de un número
 * Math.pow(base, exponente) - potencia de un número <- double
 * Math.round(decimal) - Redondear un número
 * Math.PI - costante de clase con el número PI
 * 
 * Constantes propias
 * Constantes predefinidas o de clase
 * 
 * 
 * 
 * Fuentes:
 * Curso Java. Estructuras principales 6. Clase Math. Video 9
 * https://www.youtube.com/watch?v=Xl7PeHFoR60&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=9
 * Curso Java. Estructuras principales 7. Clase Math 2. Video 10
 * https://www.youtube.com/watch?v=tt-4YxLYMjQ&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=10
 * 
 * 
 * 
 * 
 * */


public class Matematica {

	public static void main(String[] args) {
		
		//raiz cuadrada
		double baseSqrt = 9;
		double raizSqrt = Math.sqrt(baseSqrt);
		//Mostrar información
		System.out.println("La raíz cuadrada de " + baseSqrt + " es " + raizSqrt);
		//Necesita de un double y devolverá un double
		
		//Método round
		float numRound = 5.87f;
		int resultadoRound = Math.round(numRound);
		
		double num2Round = 5.87483888503848583;
		long resultado2Round = Math.round(num2Round);
		//round <- puede recibir un float y devolver un entero
		//round <- puede recibir un double y devolver un long
		
		System.out.println("El resultado de redondear " + numRound + " es " + resultadoRound);
		System.out.println("El resultado de redondear " + num2Round + " es " + resultado2Round);
		
		/*Quizas no puedes modificar el tipo de dato
		 * Te da un error al hacer el round
		 * Necesitamos hacer una refundición
		 * 
		 * int raiz = (int)Math.round(num1);
		 * Convertimos tipos de datos
		 * Colocamos el tipo de dato primero entre paréntesis
		 * para convertirlo
		 * Evitamos pérdida de información
		 * Si convertimos un número grande a uno pequeño
		 * perdemos información
		 * En este caso no perdemos información porque
		 * devolverá la parte entera <- round
		 * 
		 * Cuidado al converir un long a un int
		 * 
		 * 
		 * 
		 * */
		
		//double num2b = 5.87483888503848583;
		//int resultado2b = Math.round(num2); <- error. Si recibo un double debe devolver un long ,no un entero. Asi que hacemos la conversión de long a entero para que se acepte en mi variable entera que recibirá el resultado de la expresión
		double num2bRound = 5.87483888503848583;
		int resultado2bRound = (int)Math.round(num2bRound);
		System.out.println("El resultado de redondear " + num2bRound + " es " + resultado2bRound);
		
		/*
		 * Si le paso un double
		 * Me devolverá un long
		 * Mi variable es del tipo de dato int la que recibirá el resultado
		 * Por cuestiones del proyecto no se puede tener el resultado en long
		 * Por lo tanto elresultado queda en int
		 * Pero no puede recibir un long en un int
		 * Por lo ranto hacemos una refundición, es decir, una transformación del tipo de dato <- De long a int.
		 * Por lo cuál, podemos perder información, ya que achicamos el número
		 * En este caso eso no es importante, ya que utilizamos la clase round, lo cuál quita la parte decimal y deja el entero
		 * Si el entero es mayor cómo un long, allí si perderíamos información
		 * 
		 * */
		
		//pow
		double basePow = 2;
		double exponentePow = 3;
		
		int resultadoPow = (int)Math.pow(basePow, exponentePow); //<- devuelve un double, lo refundimos a entero para que se acepte en la variable resultado que por motivos del hipotético proyecto tiene que ser entero
		System.out.println("La raíz de base " + basePow + " a la " + exponentePow + " es " + resultadoPow);
		
		//Recibe datos doubles y devuelve double
	}

}
