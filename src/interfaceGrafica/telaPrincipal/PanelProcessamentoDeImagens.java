package interfaceGrafica.telaPrincipal;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import interfaceGrafica.equalizarImagem.TelaEqualizarImagem;
import interfaceGrafica.filtros.TelaFiltros;
import interfaceGrafica.gatoDeArnold.TelaGatoDeArnold;
import interfaceGrafica.histograma.TelaHistograma;
import interfaceGrafica.operadores.TelaOperadores;
import interfaceGrafica.transformacoes.TelaTransformacoes;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class PanelProcessamentoDeImagens extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelProcessamentoDeImagens() {
		
		setSize(1024, 720);
		setLayout(null);
		setVisible(true);
		
		// INICIO PANEL OPCAO LATERAL
		
		JPanel panelOpcaoLateral = new JPanel();
		panelOpcaoLateral.setBackground(SystemColor.scrollbar);
		panelOpcaoLateral.setBounds(0, 102, 194, 618);
		add(panelOpcaoLateral);
		panelOpcaoLateral.setLayout(null);
		
		JButton botaoPaginaInicial = new JButton("Página Inicial");
		botaoPaginaInicial.setHorizontalAlignment(SwingConstants.LEFT);
		botaoPaginaInicial.setIcon(new ImageIcon(PanelInicial.class.getResource("/com/icon/home.png")));
		botaoPaginaInicial.setBounds(0, 11, 194, 39);
		botaoPaginaInicial.setForeground(Color.BLACK);
		botaoPaginaInicial.setBackground(Color.GRAY);
		botaoPaginaInicial.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
		panelOpcaoLateral.add(botaoPaginaInicial);
		
		botaoPaginaInicial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeMouse) {
				
				PanelInicial panelInicial = new PanelInicial();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(panelInicial);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
				
			}
		});
		
		// FIM PANEL LATERAL
		
		// INICIO PANEL OPCAO INTERNA
		
		JPanel panelOpcaoInterno = new JPanel();
		panelOpcaoInterno.setBackground(Color.WHITE);
		panelOpcaoInterno.setBounds(194, 102, 830, 618);
		add(panelOpcaoInterno);
		panelOpcaoInterno.setLayout(null);
		
		JButton botaoOperacoesLogicas = new JButton("Operadores Lógicos e Aritméticos");
		botaoOperacoesLogicas.setToolTipText("");
		botaoOperacoesLogicas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeMouse) {
				
				TelaOperadores telaOperadores = new TelaOperadores();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(telaOperadores);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
				
			}
		});
		botaoOperacoesLogicas.setForeground(Color.WHITE);
		botaoOperacoesLogicas.setBackground(new Color(0, 102, 255));
		botaoOperacoesLogicas.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
		botaoOperacoesLogicas.setBounds(15, 11, 385, 180);
		panelOpcaoInterno.add(botaoOperacoesLogicas);
		
		JButton botaoFiltros = new JButton("Filtros");
		botaoFiltros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaFiltros telaFiltros = new TelaFiltros();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(telaFiltros);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
				
			}
		});
		botaoFiltros.setForeground(Color.WHITE);
		botaoFiltros.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
		botaoFiltros.setBackground(new Color(0, 102, 255));
		botaoFiltros.setBounds(415, 11, 385, 180);
		panelOpcaoInterno.add(botaoFiltros);
		
		JButton botaoHistogramas = new JButton("Histogramas");
		botaoHistogramas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaHistograma telaHistograma = new TelaHistograma();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(telaHistograma);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
				
			}
		});
		botaoHistogramas.setForeground(Color.WHITE);
		botaoHistogramas.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
		botaoHistogramas.setBackground(new Color(0, 102, 255));
		botaoHistogramas.setBounds(15, 202, 385, 180);
		panelOpcaoInterno.add(botaoHistogramas);
		
		JButton botaoGatoDeArnold = new JButton("Gato de Arnold");
		botaoGatoDeArnold.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeMouse) {
				
				TelaGatoDeArnold telaGatoDeArnold = new TelaGatoDeArnold();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(telaGatoDeArnold);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
			}
		});
		botaoGatoDeArnold.setForeground(Color.WHITE);
		botaoGatoDeArnold.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
		botaoGatoDeArnold.setBackground(new Color(0, 102, 255));
		botaoGatoDeArnold.setBounds(415, 202, 385, 180);
		panelOpcaoInterno.add(botaoGatoDeArnold);
		
		JButton botaoTransformacoes = new JButton("Transformações");
		botaoTransformacoes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeMouse) {
				
				TelaTransformacoes telaTransformacoes = new TelaTransformacoes();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(telaTransformacoes);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();

			}
		});
		botaoTransformacoes.setForeground(Color.WHITE);
		botaoTransformacoes.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
		botaoTransformacoes.setBackground(new Color(0, 102, 255));
		botaoTransformacoes.setBounds(15, 393, 385, 180);
		panelOpcaoInterno.add(botaoTransformacoes);
		
		JButton botaoEqualizarImagem = new JButton("Equalizar Imagem");
		botaoEqualizarImagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeMouse) {
				
				TelaEqualizarImagem telaEqualizarImagem = new TelaEqualizarImagem();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(telaEqualizarImagem);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
				
			}
		});
		botaoEqualizarImagem.setForeground(Color.WHITE);
		botaoEqualizarImagem.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
		botaoEqualizarImagem.setBackground(new Color(0, 102, 255));
		botaoEqualizarImagem.setBounds(415, 393, 385, 180);
		panelOpcaoInterno.add(botaoEqualizarImagem);
		
		// FIM PANEL OPCAO INTERNA
		
		//INICIO PANEL SUPERIOR
		
		JPanel panelSuperior = new JPanel();
		panelSuperior.setBackground(new Color(0, 51, 204));
		panelSuperior.setBounds(0, 0, 1024, 102);
		add(panelSuperior);
		panelSuperior.setLayout(null);
		
		JLabel labelMenuPrincipal = new JLabel("Projeto de Processamento de Imagens");
		labelMenuPrincipal.setForeground(Color.WHITE);
		labelMenuPrincipal.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 24));
		labelMenuPrincipal.setBounds(10, 24, 730, 55);
		panelSuperior.add(labelMenuPrincipal);
		
		// FIM PANEL SUPERIOR

		

	}
}
