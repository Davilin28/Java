public class Prueba {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Enteros
		int a = 3;
		// Double
		double b = 5.5;
		// Caracteres
		char c = '0';
		// Palabras, cadenas...
		String d = "Hola";
		
		//con esto imprime lo que queramos sacar por pantalla.
		System.out.print(a+"\n");
		System.out.print(b);
		System.out.print("\n");
		System.out.println(d);
		
		// Ejemplo de if
		int h = 6;
		
		if (h<6){
			System.out.println("Hola");
		}
		else{
			System.out.println("Adios");
		}
		
		// Ejemplo de for
		for (int i=1; i<=10;i++){
			System.out.println(i);
		}
		
		//Ejemplo de array de enteros
		int [] numeros = {2,4,3,5,6,8,9,5,3,2};
		
		for (int i=0; i<numeros.length;i++){
		System.out.println(numeros[i]);
		}
		
		//Crear un array de string (4 palabras)
		String [] palabras = {"Jose", "Pepe", "Lopez", "Luis"};
		
		for (int i=0; i<palabras.length;i++){
			System.out.print(palabras[i]+"\t");
			}
	}
}
