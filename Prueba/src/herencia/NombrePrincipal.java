package herencia;

public class NombrePrincipal {

	public static void main(String[] args) {

		Alumno a1 = new Alumno("09070489W", "David", "Rom�n", "Rey", "1DAM", 1993, 'H');
		Alumno a2 = new Alumno("09044229W", "Javier", "Rosa", "Ruiz", "2DAM", 1996, 'M');

		Profesor p1 = new Profesor("03029347Y", "Carlos", "Pareja", "Lopez", 755.22, 10, true);
		Profesor p2 = new Profesor("05222347Y", "Carlos", "Pil", "Lorezana", 886.22, 7, true);

		Empleado e1 = new Empleado("076049827E", "jose", "ngema", "Joas", 1000.23, 'D');

		System.out.println(e1);

		p1.setEsFijo(false);

		System.out.println(p1);
	}

}
