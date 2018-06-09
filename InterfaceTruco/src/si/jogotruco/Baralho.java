package si.jogotruco;

public enum Baralho {
	


	//ID, Valor, Naipe, PesoTruco, PesoEnvido, PesoValor
	// OURO = 1, ESPADA = 2, BASTOS = 3, COPAS = 4
	
	OURO1(1,1,1,0,0,8),
	OURO2(2,2,1,0,0,9),
	OURO3(3,3,1,0,0,10),
	OURO4(4,4,1,0,0,1),
	OURO5(5,5,1,0,0,2),
	OURO6(6,6,1,0,0,3),
	OURO7(7,7,1,0,0,11),
	OURO10(8,10,1,0,0,5),
	OURO11(9,11,1,0,0,6),
	OURO12(10,12,1,0,0,7),
	
	ESPADA1(11,1,2,0,0,14),
	ESPADA2(12,2,2,0,0,9),
	ESPADA3(13,3,2,0,0,10),
	ESPADA4(14,4,2,0,0,1),
	ESPADA5(15,5,2,0,0,2),
	ESPADA6(16,6,2,0,0,3),
	ESPADA7(17,7,2,0,0,12),
	ESPADA10(18,10,2,0,0,5),
	ESPADA11(19,11,2,0,0,6),
	ESPADA12(20,12,2,0,0,7),
	
	BASTOS1(21,1,3,0,0,13),
	BASTOS2(22,2,3,0,0,9),
	BASTOS3(23,3,3,0,0,10),
	BASTOS4(24,4,3,0,0,1),
	BASTOS5(25,5,3,0,0,2),
	BASTOS6(26,6,3,0,0,3),
	BASTOS7(27,7,3,0,0,4),
	BASTOS10(28,10,3,0,0,5),
	BASTOS11(29,11,3,3,0,6),
	BASTOS12(30,12,3,3,0,7),
	
	COPAS1(31,1,4,0,0,8),
	COPAS2(32,2,4,0,0,9),
	COPAS3(33,3,4,0,0,10),
	COPAS4(34,4,4,0,0,1),
	COPAS5(35,5,4,0,0,2),
	COPAS6(36,6,4,0,0,3),
	COPAS7(37,7,4,0,0,4),
	COPAS10(38,10,4,0,0,5),
	COPAS11(39,11,4,4,0,6),
	COPAS12(30,12,4,4,0,7);
	
	
	private int id, valor, naipe, pesoEnvido, pesoTruco, pesoValor;
	
	//Constructor
	private Baralho(int id, int valor, int naipe, int pesoEnvido, int pesoTruco, int pesoValor) {
		this.id = id;
		this.valor = valor;
		this.naipe = naipe;
		this.pesoEnvido = pesoEnvido;
		this.pesoTruco = pesoTruco;
		this.pesoValor = pesoValor;
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
	
	public int getPesoValor() {
		return pesoValor;
	}
	
	
	
}
