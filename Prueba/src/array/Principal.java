package array;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		// ARRAYS DINAMICOS: ArrayList
		ArrayList<String> nombre = new ArrayList<String>();
		nombre.add("hola");
		nombre.add("adioos");

		nombre.add(1, "chao");

		System.out.println(nombre.toString());
	}

}
