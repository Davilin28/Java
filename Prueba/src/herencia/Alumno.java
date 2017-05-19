package herencia;

public class Alumno extends Persona {

	String curso;
	int anoNac;
	char sexo; // H hombre, M mujer

	public Alumno(String dni, String nombre, String apellido1, String apellido2, String curso, int anoNac, char sexo) {
		super(dni, nombre, apellido1, apellido2);
		this.curso = curso;
		this.anoNac = anoNac;
		this.sexo = sexo;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getAnoNac() {
		return anoNac;
	}

	public void setAnoNac(int anoNac) {
		this.anoNac = anoNac;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Alumno [curso=" + curso + ", anoNac=" + anoNac + ", sexo=" + sexo + ", dni=" + dni + ", nombre="
				+ nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + "]";
	}

}
