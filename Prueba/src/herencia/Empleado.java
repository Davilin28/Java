package herencia;

public class Empleado extends Persona {

	double sueldo;
	char categoria; // L limpieza, A administracion, D cargo directivo.

	public Empleado(String dni, String nombre, String apellido1, String apellido2, double sueldo, char categoria) {
		super(dni, nombre, apellido1, apellido2);
		this.sueldo = sueldo;
		this.categoria = categoria;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public char getCategoria() {
		return categoria;
	}

	public void setCategoria(char categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Empleado [sueldo=" + sueldo + ", categoria=" + categoria + ", dni=" + dni + ", nombre=" + nombre
				+ ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + "]";
	}

}
