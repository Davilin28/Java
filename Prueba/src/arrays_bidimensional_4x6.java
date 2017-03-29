
public class arrays_bidimensional_4x6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [][] x = {
					{'a','b','c','d','e'},
					{'f','g','h','i','j'},
					{'k','l','m','n','o'},
					{'p','q','r','s','t'}}; 
		
			// Declaramos longitudfilas para las filas
			// Declaramos longitudcol para las columnas
			
			int longitudfilas = x.length;
			int longitudcol = x[0].length;
			
			for(int fila=0; fila<longitudfilas; fila++){
				
				for(char col=0; col<longitudcol; col++){
					
					System.out.print(x[fila][col]+"\t");
				}
					System.out.println();
				}
		}
}