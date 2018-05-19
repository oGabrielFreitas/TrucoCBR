package si.jogotruco;

import java.util.Random;

public class Acoes {

	public Acoes() {
		// TODO Auto-generated constructor stub
	}
	
	//Pesca carta aleatória
	public Carta pescarCartaAleatoria() {
		
		Carta c = new Carta();		
		Baralho baralho[] = Baralho.values();	
		
		Random gerador = new Random();		
		int nR = gerador.nextInt(baralho.length);
		
		c.setId(baralho[nR].getId());
		c.setValor(baralho[nR].getValor());
		c.setNaipe(baralho[nR].getNaipe());
		c.setPesoEnvido(baralho[nR].getPesoEnvido());
		c.setPesoTruco(baralho[nR].getPesoTruco());
		
		return c;		
	}
	
	//Escolhe carta a ser pescada (testes)
	public Carta escolherCarta(int i) {
		
		Carta c = new Carta();		
		Baralho baralho[] = Baralho.values();	
		
		c.setValor(baralho[i].getValor());
		c.setNaipe(baralho[i].getNaipe());
		c.setPesoEnvido(baralho[i].getPesoEnvido());
		c.setPesoTruco(baralho[i].getPesoTruco());
		
		return c;			
	}
	
	//Imprime mão
	public void imprimeMao(Mao m) {
		
		System.out.println(m.getCarta(0).getValor() + " de " + m.getCarta(0).naipeCarta(m.getCarta(0)));
		System.out.println(m.getCarta(1).getValor() + " de " + m.getCarta(1).naipeCarta(m.getCarta(1)));
		System.out.println(m.getCarta(2).getValor() + " de " + m.getCarta(2).naipeCarta(m.getCarta(2)));
		
	}
	


}
