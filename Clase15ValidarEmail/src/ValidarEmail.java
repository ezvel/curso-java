import javax.swing.JOptionPane;

public class ValidarEmail {

	public static void main(String[] args) {
		
		
		//Variables
		//boolean arroba = false;
		int arroba = 0;
		boolean punto = false;
		String email = "";
		
		//Solicitar email al usuario
		email = JOptionPane.showInputDialog("Introduce tu correo electrónico");
		
		
	    //Validar correo electrónico
		for(int i = 0; i < email.length(); i++) {
			
			if (email.charAt(i) == '@') {				
				arroba++;
			}
			
			if (email.charAt(i) == '.') {
				punto = true;					
			}
			
			
		}
		
		/*
		Para o desde el entero iniciado en 0 hasta la longitud
		del mail incrementame en 1
			Si el caracter del mail en la posicion del entero i es igual al caracter '@'
			reasigname la variable booleana en true
			
		Ahora en caso de que me encuentre el arroba lo validará en true y al finalizar la condición
		al terminar de reccorrer la cadena de caracteres saldrá del bucle
		*/
		
		if (arroba == 1 && punto == true) {
			
			System.out.println("El mail es válido");
			
		}else{
			
			System.out.println("El mail no es válido");
			
		}
		
		/*
		 * Si el valor booleano de arroba es true me dirá que el mail es válido
		 * Si no encontró el arroba el valor de la variable booleana quedará por defecto en false y me dirá que el mail es incorrecto o no válido
		 * 
		 * */
		
		

	}

}
