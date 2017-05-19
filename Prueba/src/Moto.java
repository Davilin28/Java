
public class Moto extends Vehiculo {

	// 1.Añadir los atributos de la clase
	int ano;
	boolean proteccion;
	boolean pata;
	int ruedas;
	double deposito;
	char tipo;

	// 2.Metodo/s constructor/es
	public Moto(String matricula, String marca, String modelo, int cilindrada, boolean itv, int ano, boolean proteccion,
			boolean pata, int ruedas, double deposito, char tipo) {
		super(matricula, marca, modelo, cilindrada, itv);
		this.ano = ano;
		this.proteccion = proteccion;
		this.pata = pata;
		this.ruedas = ruedas;
		this.deposito = deposito;
		this.tipo = tipo;
	}

	// 3. Crear Set & Get
	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public boolean isProteccion() {
		return proteccion;
	}

	public void setProteccion(boolean proteccion) {
		this.proteccion = proteccion;
	}

	public boolean isPata() {
		return pata;
	}

	public void setPata(boolean pata) {
		this.pata = pata;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	// 5. Crear ToString
	@Override
	public String toString() {
		return "Moto [ano=" + ano + ", proteccion=" + proteccion + ", pata=" + pata + ", ruedas=" + ruedas
				+ ", deposito=" + deposito + ", tipo=" + tipo + "]";
	}
}