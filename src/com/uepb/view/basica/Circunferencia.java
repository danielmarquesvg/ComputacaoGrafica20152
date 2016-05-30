package com.uepb.view.basica;

import java.util.ArrayList; 
import java.util.List;

import com.uepb.algoritmo.Ponto;
import com.uepb.algoritmo.operacoes2D.Operacoes;


/**
 * Algoritmo da {@link Circunferencia} do ponto medio.
 * 
 *
 */
public class Circunferencia {//Classe com os algoritmos de cria��o de circunferencia

	int d_old = 0;
	int x, y, raio, x_dif, y_dif;
	List<Ponto> listaPontos;
	Operacoes operacoes = new Operacoes();
	
	public Circunferencia() {
		// TODO Auto-generated constructor stub
	}
	
	public Circunferencia(int x, int y, int raio) {
		this.x = x;
		this.y = y;		
		this.raio = raio;
	}

	public ArrayList<Ponto> circunferenciaPontoMedio() {//M�todo do ponto m�dio
		listaPontos = new ArrayList<Ponto>();
		boolean trans = false;
		if(x!=0 || y!=0) {
			trans = true;
			x_dif = x;
			y_dif = y;
			x=0;
			y=0;
		}
		if (x== 0 && y == 0) {
			y = raio;
			d_old = 1 - raio;
			listaPontos.add(new Ponto(0, 0, 0));
			listaPontos.add(new Ponto(x, y, 0)); 
			listaPontos.add(new Ponto(y, x, 0));   
			listaPontos.add(new Ponto(-y, x, 0));  
			listaPontos.add(new Ponto(-y, x, 0));  
		}
		while (y > x) {
			if (d_old <= 0.0) {				
				d_old += 2 * x + 3;
				x++;				
			} else {				
				d_old += (2*x) - (2*y) + 5;
				y--;
				x++;
			}
			printPixel(x, y);
		}
		
		if (trans) {
			listaPontos = operacoes.translacaoMulti(listaPontos, x_dif, y_dif);
		}
		
		return (ArrayList<Ponto>) listaPontos;
	}

	public List<Ponto> circ_explicita(int x, int y, int raio) {//M�todo explicita
		listaPontos = new ArrayList<Ponto>();
		listaPontos.clear();
		
		for (int i = -raio; i < raio; i++) {
			listaPontos.add(new Ponto(i, (int) Math.sqrt(raio*raio - i*i), 0));
			listaPontos.add(new Ponto(i, -1*(int) Math.sqrt(raio*raio - i*i), 0));
		}

		return listaPontos;
	}
	
	public List<Ponto> circ_trigonometrica(int x, int y, int raio){//M�todo trigonom�trico
		listaPontos = new ArrayList<Ponto>();
		listaPontos.clear();
		
		for (int i = -raio; i <= raio; i++) {
			listaPontos.add(new Ponto((int) (raio*(double) Math.cos(Math.toRadians(i))), (int) (raio* (double) Math.sin(Math.toRadians(i))), 0));
			printPixel((int) (raio*(double) Math.cos(Math.toRadians(i))), (int) (raio* (double) Math.sin(Math.toRadians(i))));
		}

		return listaPontos;
	}
	
	
	private void printPixel(int x, int y) {
		
		listaPontos.add(new Ponto(x, y, 0)); 
		listaPontos.add(new Ponto(x, -y, 0)); 
		listaPontos.add(new Ponto(-x, y, 0));
		listaPontos.add(new Ponto(-x, -y, 0)); 
		
		listaPontos.add(new Ponto(y, x, 0));
		listaPontos.add(new Ponto(y, -x, 0));
		listaPontos.add(new Ponto(-y, x, 0)); 
		listaPontos.add(new Ponto(-y, -x, 0)); 		
	}

	/**
	 * @return the listaPontos
	 */
	public List<Ponto> getListaPontos() {
		
		return listaPontos;
	}

	/**
	 * @param listaPontos the listaPontos to set
	 */
	public void setListaPontos(List<Ponto> listaPontos) {
		this.listaPontos = listaPontos;
	}

	/**
	 * @return the d_old
	 */
	public double getD_old() {
		d_old = 5 / 4 - raio;		
		return d_old;
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x
	 *            the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y
	 *            the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * @return the raio
	 */
	public int getRaio() {
		return raio;
	}

	/**
	 * @param raio
	 *            the raio to set
	 */
	public void setRaio(int raio) {
		this.raio = raio;
	}
}
