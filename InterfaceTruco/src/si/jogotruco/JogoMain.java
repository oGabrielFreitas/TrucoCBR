package si.jogotruco;

import java.util.Random;

public class JogoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int jogo = 1;
		
		Mao mH = new Mao();
		Acoes fun = new Acoes();
		
		System.out.println("------ TRUCO ------");
		System.out.println("");		
		
	//	while(jogo == 1) {		
		
		mH.pescarMao();
		
		System.out.println("Sua mão é:");
		fun.imprimeMao(mH);
		System.out.println("Pontos Envido = " + mH.pontosEnvido(mH));
		
		
		
		
	}

}
