package si.jogotruco;

import java.io.IOException;
import java.util.Random;

public class JogoMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int jogo = 1;
		
		Mao mH = new Mao();
		Mao mR = new Mao();
		Acoes fun = new Acoes();
		
		System.out.println("------ TRUCO ------");
		System.out.println("");		
		
	//	while(jogo == 1) {		
		
		mH.pescarMao();
		mR.pescarMao();
		
		System.out.println("Sua mão é:");
		fun.imprimeMao(mH);
		System.out.println("Mão robo: ");
		fun.imprimeMao(mR);
		
		fun.pedirEnvido(mH, mR);
		
		fun.rodada(mH, mR);
		//System.out.println(mH.pontosEnvido(mH));
		
		
		
		//System.out.println("Pontos Envido = " + mH.pontosEnvido(mH));
		
		//System.out.println("Maior carta = " + mH.getMaiorCarta(mH).getValor() + " de " + mH.getMaiorCarta(mH).naipeCarta(mH.getMaiorCarta(mH)));
		//System.out.println("Media carta = " + mH.getMediaCarta(mH).getValor() + " de " + mH.getMediaCarta(mH).naipeCarta(mH.getMediaCarta(mH)));
		//System.out.println("Menor carta = " + mH.getMenorCarta(mH).getValor() + " de " + mH.getMenorCarta(mH).naipeCarta(mH.getMenorCarta(mH)));
		
		
	}

}
