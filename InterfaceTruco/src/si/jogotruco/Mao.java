package si.jogotruco;

public class Mao {

	public Mao() {
		// TODO Auto-generated constructor stub
	}
	
	private Carta carta[] = new Carta[3];
	private Acoes fun = new Acoes();
	
	//Função usada para testes...
	public void setMao(Carta c1, Carta c2, Carta c3) {
		
		this.carta[0] = c1;
		this.carta[1] = c2;
		this.carta[2] = c3;		
		
	}
	
	//Pesca mão aleatória
	public void pescarMao() {
		
		int controle = 1;
		
		this.carta[0] = fun.pescarCartaAleatoria();
		this.carta[1] = fun.pescarCartaAleatoria();
		this.carta[2] = fun.pescarCartaAleatoria();
		
		while(controle == 1) { // Impede cartas iguais na mesma mão
			
		if(carta[0].getId() == carta[1].getId() || carta[0].getId() == carta[2].getId()) {
			carta[0] = fun.pescarCartaAleatoria();
		}
		if(carta[1].getId() == carta[2].getId()) {
			carta[1] = fun.pescarCartaAleatoria();
		}else {
			controle = 0;
		}
		
		}
		
	}
	
	//getCarta específica 
	public Carta getCarta(int i) {
		
		return carta[i];
	}

}
