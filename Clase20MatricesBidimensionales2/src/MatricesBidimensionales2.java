/*Clase 20 - Matrices bidimensionales 2
 * 
 * 
 * 
 * 
 * */
public class MatricesBidimensionales2 {

	public static void main(String[] args) {
		
		
		
		int [][] matrix = {
				
			    {1, 2, 3, 4, 5},
				{6, 7, 8, 9, 10},
				{11, 12, 13, 14, 15},
				{16, 17, 18, 19, 20},
		};
		
		
		//Bucle for
		/*
		for(int i = 0; i < 4; i++) {
			System.out.println("");
			
			for(int j = 0; j < 5; j++) {
				
				System.out.println("matrix" + "[" + i + "]" + "[" + j + "]" + " : " + matrix[i][j]);
				
			}
		}
		*/
		
		//Bucle ForEach
		for(int[]primeraDimension:matrix) {
			
			System.out.println("");
			
			for(int elemento: primeraDimension) {
				
				System.out.println(elemento);

			}
			
		}
		
	}

}


//SALIDA

/*
 
1
2
3
4
5

6
7
8
9
10

11
12
13
14
15

16
17
18
19
20

*/
