package si.jogotruco;

import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;

public class Acoes {

	public Acoes() {
		// TODO Auto-generated constructor stub
	}
	
	//Leitura de Teclado
	InputStream is = System.in;
	InputStreamReader isr = new InputStreamReader(is);
	BufferedReader br = new BufferedReader(isr);
	
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
		c.setPesoValor(baralho[nR].getPesoValor());
		
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
		c.setPesoValor(baralho[i].getPesoValor());
		
		return c;			
	}
	
	//Imprime mão
	public void imprimeMao(Mao m) {
		
		System.out.println("(A) " + m.getCarta(0).getValor() + " de " + m.getCarta(0).naipeCarta(m.getCarta(0)));
		System.out.println("(B) " + m.getCarta(1).getValor() + " de " + m.getCarta(1).naipeCarta(m.getCarta(1)));
		System.out.println("(C) " + m.getCarta(2).getValor() + " de " + m.getCarta(2).naipeCarta(m.getCarta(2)));
		
	}
	
	public void pedirEnvido(Mao mH, Mao mR) throws IOException { //Implementar se robo irá aceitar
		
		int sai = 0;
		int envH, envR;		
		String resp; // Variaveis de Leitura	
		
		int respostaRobo = 0;
		
		//respostaRobo = função().envidoresp... 0 = não, 1 = sim CBR
		

		// Tratamento de erro de inserção de dados

		while (sai == 0) {

			System.out.println("Deseja pedir envido? (S/N)");
			resp = br.readLine();
			
			if (resp.equalsIgnoreCase("S")) {
				
				if (respostaRobo == 1) {
					
				
				envH = mH.pontosEnvido(mH);
				envR = mR.pontosEnvido(mR);
				
				System.out.println("Pontos envido Humano: " + envH);
				System.out.println("Pontos envido Robo: " + envR);
				
				if (envH > envR) {
					System.out.println("Envido humano ganhou!");
				}else {
					System.out.println("Envido robo ganhou!");
				}
				sai = 1;
				}
				else {
					System.out.println("O Robo não aceitou o envido");
					sai = 1;
					
				}
				
			}else if (resp.equalsIgnoreCase("N")) {
				sai = 1;				
			}else {
				System.out.println("A resposta informada não é valida.");
			}

		}		
	}
	
	public void rodada(Mao mH, Mao mR) throws IOException { // Incompleta
		
		
		
		int sai = 0;		
		int envH, envR;		
		String resp; // Variaveis de Leitura	
		Carta cH = new Carta(); // Carta humano
		Carta cR = new Carta(); // Carta robo
		
		//Variáveis de controle de rodada
		int vitoriaHumano1R = 0, vitoriaHumano2R = 0, vitoriaHumano3R = 0;
		int vitoriaRobo1R = 0, vitoriaRobo2R = 0, vitoriaRobo3R = 0;
		int empate1R = 0;
		

		// Tratamento de erro de inserção de dados

		while (sai == 0) {

			System.out.println("Qual carta você deseja jogar? (A|B|C)");
			resp = br.readLine();
			
			if (resp.equalsIgnoreCase("A")) {
				
				cH = mH.getCarta(0);
				cR = mR.getCarta(0); // Apenas para teste APAGAR
				
				// >> cR = RespostaRobo(Carta Humano); CBR
				
				if (cH.getPesoValor() > cR.getPesoValor()) {
					
					System.out.println("O Humano ganhou a jogada!");
					vitoriaHumano1R = 1;
					
					// InformarAoRobo(Derrota Jogada) CBR
					
				}
				if (cH.getPesoValor() < cR.getPesoValor()) {
					
					System.out.println("O Robo ganhou a jogada!");
					vitoriaRobo1R = 1;
					
					// InformarAoRobo(Vitoria Jogada) CBR
					
				}if (cH.getPesoValor() == cR.getPesoValor()) {
					
					System.out.println("A jogada empatou, portanto a rodada será decidida na próxima jogada.");
					empate1R = 1;
					
					// InformarAoRobo(Empate Jogada) CBR					
					
				}
				
			}else if (resp.equalsIgnoreCase("N")) {
				sai = 1;				
			}else {
				System.out.println("A resposta informada não é valida.");
			}

		}	
		
		
		
		
		
		
		
		
	}
	


}
