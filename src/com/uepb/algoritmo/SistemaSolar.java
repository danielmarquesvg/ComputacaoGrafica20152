package com.uepb.algoritmo;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import com.uepb.algoritmo.operacoes2D.ElipseEquacao;
import com.uepb.view.TelaPrincipal;
import com.uepb.view.basica.Circunferencia;

public class SistemaSolar {//Classe reposável pelo sistema solar

	ElipseEquacao orbita = new ElipseEquacao();
	Circunferencia terra = new Circunferencia();
	Circunferencia sol = new Circunferencia();

	public List<Ponto> sistema = new ArrayList<Ponto>();

	public SistemaSolar() {
		limparSistemaSolar();

		orbita.midpointElipse(200, 100);//Cria uma elipse
		
		TelaPrincipal.povoarRetas(orbita.getListaPontos(), Color.GREEN);
		
		terra.setX(200);//cria a terra numa posição inicial
		terra.setY(0);
		terra.setRaio(10);
		terra.circunferenciaPontoMedio();

		TelaPrincipal.povoarRetas(terra.getListaPontos(), Color.BLUE);
		TelaPrincipal.panelNormalizacao.repaint();

		desenharOrbitaESol();
		
		for (int i = 200; i >= -200; i--) {//pega a lista de pontos da órbita da metade de cima
			for (int j = 0; j <= 100; j++) {
				if (orbita.contem(new Ponto(i, j, 0), orbita.getListaPontos())) {
					sistema.add(new Ponto(i, j, 0));	
				}				
			}
		}
		
		for (int i = -200; i <= 200; i++) {
			for (int j = 0; j >= -100; j--) {
				if (orbita.contem(new Ponto(i, j, 0), orbita.getListaPontos())) {//pega a lista de pontos da órbita da metade de baixo
					sistema.add(new Ponto(i, j, 0));	
				}		
			}
		}

		TelaPrincipal.panelNormalizacao.repaint();
		
		animacao();

	}

	/**
	 * 
	 */
	private void desenharOrbitaESol() {
		
		orbita.midpointElipse(200, 100);//Coloca a orbita
		TelaPrincipal.povoarRetas(orbita.getListaPontos(), Color.GREEN);
		
		sol = new Circunferencia();//Desenha o Sol no centro do sistema
		sol.setX(0);
		sol.setY(0);
		sol.setRaio(30);
		sol.circunferenciaPontoMedio();

		TelaPrincipal.povoarRetas(sol.getListaPontos(), Color.ORANGE);
		TelaPrincipal.panelNormalizacao.repaint();

	}

	/**
	 * 
	 */
	private void limparSistemaSolar() {
		// Limpar a tela
		TelaPrincipal.planoCartesiano.limparImagem();
		TelaPrincipal.getLista().clear();
	}

	private void animacao() {//Faz a animação, pra cada ponto da orbita o centro da terra será "setado", assim ele andara nele
		Thread minhaThread = new Thread() {
			public void run() {
				// codigo para executar
				for (Ponto ponto : sistema) {
					limparSistemaSolar();
					desenharOrbitaESol();
					
					terra.setX(ponto.getX());
					terra.setY(ponto.getY());
					terra.setRaio(10);
					terra.circunferenciaPontoMedio();

					TelaPrincipal.povoarRetas(terra.getListaPontos(), Color.BLUE);
					
					TelaPrincipal.panelNormalizacao.repaint();
					//TelaPrincipal.panelNormalizacao.updateUI();
					TelaPrincipal.panelNormalizacao.validate();
					
					
	
					try {
						sleep(50);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};

		// maneira de chamar a thread
		minhaThread.start();

	}
}
