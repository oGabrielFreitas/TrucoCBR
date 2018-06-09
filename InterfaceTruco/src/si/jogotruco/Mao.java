package si.jogotruco;

public class Mao {

	public Mao() {
		// TODO Auto-generated constructor stub
	}
	
	private Carta carta[] = new Carta[3];
	private Acoes fun = new Acoes();
	private int pontosEnvido;
	private int emao; // É mão? (Para critério de desempate no envido)
	private int pontosHumano = 0, pontosRobo = 0;
	
	
	
	//-----------------------------------------------------------------
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
	
	// Calcula pontos do Envido
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
		else if(m.getCarta(0).getNaipe() == m.getCarta(2).getNaipe()) {
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
		else if(m.getCarta(1).getNaipe() == m.getCarta(2).getNaipe()) {
			iguais = 1;
			if(m.getCarta(1).getValor() < 10 && controleB == 0) {
				pontosEnvido += m.getCarta(1).getValor();
				controleB = 1;
			}
			if(m.getCarta(2).getValor() < 10 && controleC == 0) {
				pontosEnvido += m.getCarta(2).getValor();
				controleC = 1;
			}
		}else { //Se não houver 2 cartas do mesmo naipe, retornará o valor da maior carta.
			
			if(m.getCarta(0).getValor() == m.getCarta(1).getValor()) {
				pontosEnvido = m.getCarta(0).getValor();
			}else if(m.getCarta(0).getValor() > m.getCarta(1).getValor()) {
				pontosEnvido = m.getCarta(0).getValor();
			}else {
				pontosEnvido = m.getCarta(1).getValor();
			}
			if(pontosEnvido == m.getCarta(2).getValor()) {
				// pontosEnvido = pontosEnvido;
			}else if(pontosEnvido > m.getCarta(2).getValor()) {
				// pontosEnvido = pontosEnvido;
			}else {
				pontosEnvido = m.getCarta(2).getValor();
			}	
			
		}
		
		if(iguais == 1) {
			pontosEnvido += 20;
		}
		
		
		
		return pontosEnvido;
	}
	
	public Carta getMaiorCarta(Mao m) {
		
		Carta c = new Carta();
		
		if(m.getCarta(0).getPesoValor() == m.getCarta(1).getPesoValor()) {
			c = m.getCarta(0);
		}else if(m.getCarta(0).getPesoValor() > m.getCarta(1).getPesoValor()) {
			c = m.getCarta(0);
		}else {
			c = m.getCarta(1);
		}
		if(c.getPesoValor() == m.getCarta(2).getPesoValor()) {
			c = c;
		}else if(c.getPesoValor() > m.getCarta(2).getPesoValor()) {
			c = c;
		}else {
			c = m.getCarta(2);
		}		
		
		return c;
	}
	
	public Carta getMediaCarta(Mao m) {
		
		Carta c = new Carta();
		c = m.getMaiorCarta(m);
		
		if(m.getCarta(0).getId() == c.getId()) {
			if(m.getCarta(1).getPesoValor() > m.getCarta(2).getPesoValor())
				c = m.getCarta(1);
			else {
				c = m.getCarta(2);
			}			
		}
		else if(m.getCarta(1).getId() == c.getId()) {
			if(m.getCarta(0).getPesoValor() > m.getCarta(2).getPesoValor())
				c = m.getCarta(0);
			else {
				c = m.getCarta(2);
			}			
		}
		else if(m.getCarta(2).getId() == c.getId()) {
			if(m.getCarta(0).getPesoValor() > m.getCarta(1).getPesoValor())
				c = m.getCarta(0);
			else {
				c = m.getCarta(1);
			}			
		}	
		
		return c;
	}
	
	public Carta getMenorCarta(Mao m) {
		
		Carta c = new Carta();
		
		if(m.getCarta(0).getPesoValor() == m.getCarta(1).getPesoValor()) {
			c = m.getCarta(0);
		}else if(m.getCarta(0).getPesoValor() < m.getCarta(1).getPesoValor()) {
			c = m.getCarta(0);
		}else {
			c = m.getCarta(1);
		}
		if(c.getPesoValor() == m.getCarta(2).getPesoValor()) {
			c = c;
		}else if(c.getPesoValor() < m.getCarta(2).getPesoValor()) {
			c = c;
		}else {
			c = m.getCarta(2);
		}		
		
		return c;
		
		
	}
	
	//getCarta específica 
	public Carta getCarta(int i) {
		
		return carta[i];
	}

}
