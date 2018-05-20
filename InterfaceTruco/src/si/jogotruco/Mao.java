package si.jogotruco;

public class Mao {

	public Mao() {
		// TODO Auto-generated constructor stub
	}
	
	private Carta carta[] = new Carta[3];
	private Acoes fun = new Acoes();
	private int pontosEnvido;
	
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
	
	public int pontosEnvido(Mao m) {
		
		pontosEnvido = 0;
		int controleA = 0;
		int controleB = 0;
		int controleC = 0;
		int iguais = 0;
		
		if(m.getCarta(0).getNaipe() == m.getCarta(1).getNaipe()) {
			iguais = 1;
			if(m.getCarta(0).getValor() < 10 && controleA == 0) {
				pontosEnvido += m.getCarta(0).getValor();
				controleA = 1;
			}
			if(m.getCarta(1).getValor() < 10 && controleB == 0) {
				pontosEnvido += m.getCarta(1).getValor();
				controleB = 1;
			}
		}
		if(m.getCarta(0).getNaipe() == m.getCarta(2).getNaipe()) {
			iguais = 1;
			if(m.getCarta(0).getValor() < 10 && controleA == 0) {
				pontosEnvido += m.getCarta(0).getValor();
				controleA = 1;
			}
			if(m.getCarta(2).getValor() < 10 && controleC == 0) {
				pontosEnvido += m.getCarta(2).getValor();
				controleC = 1;
			}
		}
		if(m.getCarta(1).getNaipe() == m.getCarta(2).getNaipe()) {
			iguais = 1;
			if(m.getCarta(1).getValor() < 10 && controleB == 0) {
				pontosEnvido += m.getCarta(1).getValor();
				controleB = 1;
			}
			if(m.getCarta(2).getValor() < 10 && controleC == 0) {
				pontosEnvido += m.getCarta(2).getValor();
				controleC = 1;
			}
		}else {
			
			//Retorna valor da maior carta
			
		}
		
		if(iguais == 1) {
			pontosEnvido += 20;
		}
		
		
		
		return pontosEnvido;
	}
	
	//getCarta específica 
	public Carta getCarta(int i) {
		
		return carta[i];
	}

}
