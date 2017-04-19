
public class Moto {
	
	// 1.A�adir los atributos de la clase
		String matricula;
		String marca;
		String modelo;
		int cilindrada;
		boolean itv;
		int ano;
		boolean proteccion;
		boolean pata;
		int ruedas;
		double deposito;
		char tipo;
		
		// 2.Metodo/s constructor/es
		public Moto(String matricula, String marca, String modelo, int cilindrada, boolean itv, int ano,
				boolean proteccion, boolean pata, int ruedas, double deposito, char tipo) {
			this.matricula = matricula;
			this.marca = marca;
			this.modelo = modelo;
			this.cilindrada = cilindrada;
			this.itv = itv;
			this.ano = ano;
			this.proteccion = proteccion;
			this.pata = pata;
			this.ruedas = ruedas;
			this.deposito = deposito;
			this.tipo = tipo;
		}
		
		// 3.Crear metodos GET y SET
		public String getMatricula() {
			return matricula;
		}

		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public int getCilindrada() {
			return cilindrada;
		}

		public void setCilindrada(int cilindrada) {
			this.cilindrada = cilindrada;
		}

		public boolean isItv() {
			return itv;
		}

		public void setItv(boolean itv) {
			this.itv = itv;
		}

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
		
		//4. Crear metodo toString

		@Override
		public String toString() {
			return "Moto [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", cilindrada="
					+ cilindrada + ", itv=" + itv + ", ano=" + ano + ", proteccion=" + proteccion + ", pata=" + pata
					+ ", ruedas=" + ruedas + ", deposito=" + deposito + ", tipo=" + tipo + "]";
		}
		
}