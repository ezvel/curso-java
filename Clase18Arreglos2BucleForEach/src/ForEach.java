/*
Clase 18
Arreglos 2 - ForEach

Mas sencillo la construcción del for

for each --> por cada 



*/

import javax.swing.*; //Importamos para ingresar paises por panel
public class ForEach {

	public static void main(String[] args) {
		
		String[] paisesA = new String[8];
		
		
		paisesA[0] = "Argentina";
		paisesA[1] = "España";
		paisesA[2] = "Brasil";
		paisesA[3] = "Italia";
		paisesA[4] = "Alemania";
		paisesA[5] = "Inglaterra";
		paisesA[6] = "Colombia";
		paisesA[7] = "Perú";
		
		
		//String[] paisesA = {"Argentina", "España", "Brasil", "Italia", "Alemania", "Inglaterra", "Colombia", "Perú"};
		
		
		for(int indiceA = 0; indiceA < paisesA.length; indiceA++) {
			
			System.out.println("Pais " + (indiceA + 1) + " : " + paisesA[indiceA]);
			
		}
		
		System.out.println("");
		
		int indiceB = 1;
		
		for(String paisA:paisesA) {
			
			System.out.println("País " + indiceB + ": " + paisA);
			indiceB++;
		}
		
		System.out.println("");
		
		
		//Solicitar países al usuario
		
		String[] paisesC = new String[8];
		
		for (int indiceC = 0; indiceC < 8; indiceC++ ) {
			
			paisesC[indiceC] = JOptionPane.showInputDialog("Introduce país " + (indiceC + 1));
			
		}
		
		//Imprimir los paises por consola
		int indiceC = 1;
		for(String paisC:paisesC) {
			System.out.println("País " + (indiceC) + ": " + paisC);
			indiceC++;
		}
		
	
	}

}

//Salida

/*
 
Pais 1 : Argentina
Pais 2 : España
Pais 3 : Brasil
Pais 4 : Italia
Pais 5 : Alemania
Pais 6 : Inglaterra
Pais 7 : Colombia
Pais 8 : Perú

País 1: Argentina
País 2: España
País 3: Brasil
País 4: Italia
País 5: Alemania
País 6: Inglaterra
País 7: Colombia
País 8: Perú

País 1: Uruguay
País 2: Perú
País 3: Venezuela
País 4: Brasil
País 5: Francia
País 6: Italia
País 7: España
País 8: Argentina


*/

/*
Curso Java Arrays 2. Video 24
https://www.youtube.com/watch?v=NwztwM_xGgU&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=24
*/

