//1. Creamos la clase
public class Vehiculo {
	// 2. Creamos los atributos
	protected String matricula;
	protected String marca;
	protected String modelo;
	protected int cilindrada;
	protected boolean itv;

	// 3. Creamos el constructor
	public Vehiculo(String matricula, String marca, String modelo, int cilindrada, boolean itv) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.itv = itv;
	}

	// 4. Crear get and set
	protected String getMatricula() {
		return matricula;
	}

	protected void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	protected String getMarca() {
		return marca;
	}

	protected void setMarca(String marca) {
		this.marca = marca;
	}

	protected String getModelo() {
		return modelo;
	}

	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}

	protected int getCilindrada() {
		return cilindrada;
	}

	protected void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	protected boolean isItv() {
		return itv;
	}

	protected void setItv(boolean itv) {
		this.itv = itv;
	}
	// 5.ToStrings

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", cilindrada="
				+ cilindrada + ", itv=" + itv + "]";
	}

}
