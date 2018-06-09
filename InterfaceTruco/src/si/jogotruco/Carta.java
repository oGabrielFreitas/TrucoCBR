package si.jogotruco;

public class Carta {

	public Carta() {
		// TODO Auto-generated constructor stub
	}
	
	private int id, valor, naipe, pesoTruco, pesoEnvido, pesoValor;
	

	public String naipeCarta(Carta c) {
		
		String s = new String();
		
		if (c.getNaipe() == 1) {
			s = "Ouro";
		}
		if (c.getNaipe() == 2) {
			s = "Espada";
		}
		if (c.getNaipe() == 3) {
			s = "Bastos";
		}
		if (c.getNaipe() == 4) {
			s = "Copas";
		}
		
		return s;
	}
	
	//Getters Setters	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getNaipe() {
		return naipe;
	}

	public void setNaipe(int naipe) {
		this.naipe = naipe;
	}

	public int getPesoTruco() {
		return pesoTruco;
	}

	public void setPesoTruco(int pesoTruco) {
		this.pesoTruco = pesoTruco;
	}

	public int getPesoEnvido() {
		return pesoEnvido;
	}

	public void setPesoEnvido(int pesoEnvido) {
		this.pesoEnvido = pesoEnvido;
	}
	
	public int getPesoValor() {
		return pesoValor;
	}

	public void setPesoValor(int pesoValor) {
		this.pesoValor = pesoValor;
	}

	
	
}
