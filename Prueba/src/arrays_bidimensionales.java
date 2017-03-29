
public class arrays_bidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Array numérico entero BI-dimensional
		int [][] numeros = {
							{0,1,2,3},
							{4,5,6,7},
							{8,9,0,1},
							{2,3,4,5},
							{6,7,8,9}};
		
		// Declaramos longitudfilas para las filas
		// Declaramos longitudcol para las columnas
		
		int longitudfilas = numeros.length;
		int longitudcol = numeros[0].length;
		
		for(int fila=0; fila<longitudfilas; fila++){
			
			for(int col=0; col<longitudcol; col++){
				
				System.out.print(numeros[fila][col]+"\t");
			}
			System.out.println();
		}
	}

}
