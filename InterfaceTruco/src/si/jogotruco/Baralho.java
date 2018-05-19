package si.jogotruco;

public enum Baralho {
	


	//ID, Valor, Naipe, PesoTruco, PesoEnvido
	// OURO = 1, ESPADA = 2, BASTOS = 3, COPAS = 4
	
	OURO1(1,1,1,0,0),
	OURO2(2,2,1,0,0),
	OURO3(3,3,1,0,0),
	OURO4(4,4,1,0,0),
	OURO5(5,5,1,0,0),
	OURO6(6,6,1,0,0),
	OURO7(7,7,1,0,0),
	OURO10(8,10,1,0,0),
	OURO11(9,11,1,0,0),
	OURO12(10,12,1,0,0),
	
	ESPADA1(11,1,2,0,0),
	ESPADA2(12,2,2,0,0),
	ESPADA3(13,3,2,0,0),
	ESPADA4(14,4,2,0,0),
	ESPADA5(15,5,2,0,0),
	ESPADA6(16,6,2,0,0),
	ESPADA7(17,7,2,0,0),
	ESPADA10(18,10,2,0,0),
	ESPADA11(19,11,2,0,0),
	ESPADA12(20,12,2,0,0),
	
	BASTOS1(21,1,3,0,0),
	BASTOS2(22,2,3,0,0),
	BASTOS3(23,3,3,0,0),
	BASTOS4(24,4,3,0,0),
	BASTOS5(25,5,3,0,0),
	BASTOS6(26,6,3,0,0),
	BASTOS7(27,7,3,0,0),
	BASTOS10(28,10,3,0,0),
	BASTOS11(29,11,3,3,0),
	BASTOS12(30,12,3,3,0),
	
	COPAS1(31,1,4,0,0),
	COPAS2(32,2,4,0,0),
	COPAS3(33,3,4,0,0),
	COPAS4(34,4,4,0,0),
	COPAS5(35,5,4,0,0),
	COPAS6(36,6,4,0,0),
	COPAS7(37,7,4,0,0),
	COPAS10(38,10,4,0,0),
	COPAS11(39,11,4,4,0),
	COPAS12(30,12,4,4,0);
	
	
	private int id, valor, naipe, pesoEnvido, pesoTruco;
	
	//Constructor
	private Baralho(int id, int valor, int naipe, int pesoEnvido, int pesoTruco) {
		this.id = id;
		this.valor = valor;
		this.naipe = naipe;
		this.pesoEnvido = pesoEnvido;
		this.pesoTruco = pesoTruco;
	}
	
	//Getters
	
	public int getId() {
		return id;
	}
	
	public int getValor() {
		return valor;
	}

	public int getNaipe() {
		return naipe;
	}
	public int getPesoEnvido() {
		return pesoEnvido;
	}
	
	public int getPesoTruco() {
		return pesoTruco;
	}
	
	
}
