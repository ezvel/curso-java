import javax.swing.JOptionPane;

/*Clase 16
 * 
 *Factorial
 * 
 * 
 * 
 * 
 * 
 * */

import javax.swing.JOptionPane;

public class Factorial {

	public static void main(String[] args) {
		
		long resultado = 1L;
		int factorial = 0;
	
		factorial = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));

		for(int i = factorial; i > 0; i--) {
			
			resultado = resultado*i;
			
		}
		
		
		System.out.println("El factorial de " + factorial + " es " + resultado); 
		
	}

}


/*
 *Fuentes:
 *
 *Curso Java Bucles 5. Video 22 
 *https://www.youtube.com/watch?v=V1Wgi_FsehM&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=22
 * 
 * 
 * */