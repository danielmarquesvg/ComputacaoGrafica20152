package com.uepb.view;

import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.JLabel;

import com.uepb.algoritmo.FuncoesDeNormalizacao;

import java.awt.Font;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;

@SuppressWarnings("serial")
public class PanelNormalizacao extends JPanel {//O painel de toda a normalização

	PanelPlanoCartesiano panelPlanoCartesiano = new PanelPlanoCartesiano();
	FuncoesDeNormalizacao funcoesDeNormalizacao = new FuncoesDeNormalizacao();
	
	static JLabel labelDCX;
	static JLabel labelDCY;
	static JLabel labelNDCX;
	static JLabel labelNDCY;
	static JLabel lblY;
	static JLabel lblX;
	
	/**
	 * Create the panel.
	 */
	
	public PanelNormalizacao() {
		setBackground(new Color(255, 255, 255));
		
		setBounds(0, 0, 1008, 660);
		setLayout(null);
		panelPlanoCartesiano.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		
		panelPlanoCartesiano.addMouseMotionListener(new MouseMotionAdapter() {//Evento que mostra os dados normalizados no movimento do mouse
			@Override
			public void mouseMoved(MouseEvent eventoDeMouse) {
				
				int dcx = eventoDeMouse.getX() - 300;
				int dcy = (eventoDeMouse.getY() - 300) * -1;
				
				double ndcx = funcoesDeNormalizacao.calcularNDCX(panelPlanoCartesiano.LARGURA, dcx);
				double ndcy = funcoesDeNormalizacao.calcularNDCX(panelPlanoCartesiano.ALTURA, dcy);
				
				labelNDCX.setText("ndcx : "+String.format("%.4f", ndcx));
				labelNDCY.setText("ndcy : "+String.format("%.4f", ndcy));
				
				labelDCX.setText("dcx (x): "+Integer.toString(funcoesDeNormalizacao.calcularDCX(600, ndcx)));
				labelDCY.setText("dcy (y): "+Integer.toString(funcoesDeNormalizacao.calcularDCY(600, ndcy)));
								
				lblX.setText("x: "+Integer.valueOf(dcx));
				lblY.setText("y: "+Integer.valueOf(dcy));
				
				repaint();
			}
		});
		panelPlanoCartesiano.setBounds(400, 30, 600, 600);
		
		add(panelPlanoCartesiano);
		
		JPanel panelBackgroundCoordenadasDoDispositivo = new JPanel();
		panelBackgroundCoordenadasDoDispositivo.setBackground(new Color(0, 153, 255));
		panelBackgroundCoordenadasDoDispositivo.setBounds(0, 30, 358, 41);
		add(panelBackgroundCoordenadasDoDispositivo);
		panelBackgroundCoordenadasDoDispositivo.setLayout(null);
		
		JLabel labelCoordenadasDoDispositivo = new JLabel("Coordenadas do Dispositivo");
		labelCoordenadasDoDispositivo.setForeground(Color.WHITE);
		labelCoordenadasDoDispositivo.setFont(new Font("Century Gothic", Font.BOLD, 18));
		labelCoordenadasDoDispositivo.setBounds(10, 0, 307, 41);
		panelBackgroundCoordenadasDoDispositivo.add(labelCoordenadasDoDispositivo);
		
		labelDCX = new JLabel("dcx (x): ");
		labelDCX.setForeground(Color.BLACK);
		labelDCX.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		labelDCX.setBounds(10, 82, 348, 41);
		add(labelDCX);
		
		labelDCY = new JLabel("dcy (y): ");
		labelDCY.setForeground(Color.BLACK);
		labelDCY.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		labelDCY.setBounds(10, 113, 348, 41);
		add(labelDCY);
		
		JPanel panelBackgroundCoordenadasDoDispositivoNormalizada = new JPanel();
		panelBackgroundCoordenadasDoDispositivoNormalizada.setLayout(null);
		panelBackgroundCoordenadasDoDispositivoNormalizada.setBackground(new Color(0, 153, 255));
		panelBackgroundCoordenadasDoDispositivoNormalizada.setBounds(0, 186, 358, 41);
		add(panelBackgroundCoordenadasDoDispositivoNormalizada);
		
		JLabel labelNormalizacaoDoDispositivo = new JLabel("Normaliza\u00E7\u00E3o do dispositivo");
		labelNormalizacaoDoDispositivo.setForeground(Color.WHITE);
		labelNormalizacaoDoDispositivo.setFont(new Font("Century Gothic", Font.BOLD, 18));
		labelNormalizacaoDoDispositivo.setBounds(10, 0, 307, 41);
		panelBackgroundCoordenadasDoDispositivoNormalizada.add(labelNormalizacaoDoDispositivo);
		
		labelNDCX = new JLabel("ndcx: ");
		labelNDCX.setForeground(Color.BLACK);
		labelNDCX.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		labelNDCX.setBounds(10, 238, 348, 41);
		add(labelNDCX);
		
		labelNDCY = new JLabel("ndcy: ");
		labelNDCY.setForeground(Color.BLACK);
		labelNDCY.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		labelNDCY.setBounds(10, 270, 348, 41);
		add(labelNDCY);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 153, 255));
		panel.setBounds(0, 343, 358, 41);
		add(panel);
		
		JLabel lblCoordenadasDoDispositivo = new JLabel("Coordenadas do dispositivo");
		lblCoordenadasDoDispositivo.setForeground(Color.WHITE);
		lblCoordenadasDoDispositivo.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblCoordenadasDoDispositivo.setBounds(10, 0, 307, 41);
		panel.add(lblCoordenadasDoDispositivo);
		
		lblX = new JLabel("x: ");
		lblX.setForeground(Color.BLACK);
		lblX.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblX.setBounds(10, 395, 348, 41);
		add(lblX);
		
		lblY = new JLabel("y: ");
		lblY.setForeground(Color.BLACK);
		lblY.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblY.setBounds(10, 427, 348, 41);
		add(lblY);
		
	
	}

}