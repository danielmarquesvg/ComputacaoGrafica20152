package interfaceGrafica.operadores;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import interfaceGrafica.equalizarImagem.TelaEqualizarImagem;
import interfaceGrafica.filtros.TelaFiltros;
import interfaceGrafica.gatoDeArnold.TelaGatoDeArnold;
import interfaceGrafica.histograma.TelaHistograma;
import interfaceGrafica.telaPrincipal.PanelInicial;
import interfaceGrafica.telaPrincipal.TelaInicial;
import interfaceGrafica.transformacoes.TelaTransformacoes;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaOperadorLogico extends JPanel {

	/**
	 * Create the panel.
	 */
	public TelaOperadorLogico() {

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
		botaoPaginaInicial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeMouse) {
				
				PanelInicial panelInicial = new PanelInicial();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(panelInicial);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
				
			}
		});
		botaoPaginaInicial.setHorizontalAlignment(SwingConstants.LEFT);
		botaoPaginaInicial.setIcon(new ImageIcon(PanelInicial.class.getResource("/com/icon/home.png")));
		botaoPaginaInicial.setBounds(0, 11, 194, 39);
		botaoPaginaInicial.setForeground(Color.BLACK);
		botaoPaginaInicial.setBackground(SystemColor.scrollbar);
		botaoPaginaInicial.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
		panelOpcaoLateral.add(botaoPaginaInicial);
		
		JButton botaoMenuFiltros = new JButton("Filtros");
		botaoMenuFiltros.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				TelaFiltros telaFiltros = new TelaFiltros();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(telaFiltros);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
			}
		});
		botaoMenuFiltros.setHorizontalAlignment(SwingConstants.LEFT);
		botaoMenuFiltros.setForeground(Color.BLACK);
		botaoMenuFiltros.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
		botaoMenuFiltros.setBackground(SystemColor.scrollbar);
		botaoMenuFiltros.setBounds(10, 165, 184, 39);
		panelOpcaoLateral.add(botaoMenuFiltros);
		
		JButton botaoMenuOperadores = new JButton("Operadores");
		botaoMenuOperadores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeMouse) {
				
				TelaOperadores telaOperadores = new TelaOperadores();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(telaOperadores);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
				
			}
		});
		botaoMenuOperadores.setHorizontalAlignment(SwingConstants.LEFT);
		botaoMenuOperadores.setForeground(Color.BLACK);
		botaoMenuOperadores.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
		botaoMenuOperadores.setBackground(SystemColor.scrollbar);
		botaoMenuOperadores.setBounds(10, 51, 184, 39);
		panelOpcaoLateral.add(botaoMenuOperadores);
		
		JButton botaoMenuHistograma = new JButton("Histogramas");
		botaoMenuHistograma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeMouse) {

				TelaHistograma telaHistograma = new TelaHistograma();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(telaHistograma);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
				
			}
		});
		botaoMenuHistograma.setHorizontalAlignment(SwingConstants.LEFT);
		botaoMenuHistograma.setForeground(Color.BLACK);
		botaoMenuHistograma.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
		botaoMenuHistograma.setBackground(SystemColor.scrollbar);
		botaoMenuHistograma.setBounds(10, 277, 184, 39);
		panelOpcaoLateral.add(botaoMenuHistograma);
		
		JButton botaoOperadoresAritmeticos = new JButton("Aritméticos");
		botaoOperadoresAritmeticos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeMouse) {
				
				TelaOperadoresAritmeticos telaOperadoresAritmeticos = new TelaOperadoresAritmeticos();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(telaOperadoresAritmeticos);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
				
			}
		});
		botaoOperadoresAritmeticos.setHorizontalAlignment(SwingConstants.LEFT);
		botaoOperadoresAritmeticos.setForeground(Color.BLACK);
		botaoOperadoresAritmeticos.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
		botaoOperadoresAritmeticos.setBackground(SystemColor.scrollbar);
		botaoOperadoresAritmeticos.setBounds(20, 87, 174, 39);
		panelOpcaoLateral.add(botaoOperadoresAritmeticos);
		
		JButton botaoOperadoresLogicos = new JButton("Lógicos");
		botaoOperadoresLogicos.setHorizontalAlignment(SwingConstants.LEFT);
		botaoOperadoresLogicos.setForeground(Color.BLACK);
		botaoOperadoresLogicos.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
		botaoOperadoresLogicos.setBackground(Color.GRAY);
		botaoOperadoresLogicos.setBounds(20, 126, 174, 39);
		panelOpcaoLateral.add(botaoOperadoresLogicos);
		
		

		JButton botaoMenuGato = new JButton("Gato de Arnold");
		botaoMenuGato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaGatoDeArnold gato = new TelaGatoDeArnold();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(gato);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
				
			}
		});
		botaoMenuGato.setHorizontalAlignment(SwingConstants.LEFT);
		botaoMenuGato.setForeground(Color.BLACK);
		botaoMenuGato.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
		botaoMenuGato.setBackground(SystemColor.scrollbar);
		botaoMenuGato.setBounds(10, 239, 184, 39);
		panelOpcaoLateral.add(botaoMenuGato);
		
		JButton botaoMenuTransformacoes = new JButton("Transforma\u00E7\u00F5es");
		botaoMenuTransformacoes.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				TelaTransformacoes telaTransformacoes = new TelaTransformacoes();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(telaTransformacoes);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
				
			}
		});
		
		JButton botaoMenuEquilizarImagem = new JButton("Equalizar imagem");
		botaoMenuEquilizarImagem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				TelaEqualizarImagem telaEqualizar = new TelaEqualizarImagem();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(telaEqualizar);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
			}
		});
		botaoMenuEquilizarImagem.setHorizontalAlignment(SwingConstants.LEFT);
		botaoMenuEquilizarImagem.setForeground(Color.BLACK);
		botaoMenuEquilizarImagem.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
		botaoMenuEquilizarImagem.setBackground(SystemColor.scrollbar);
		botaoMenuEquilizarImagem.setBounds(10, 314, 184, 39);
		panelOpcaoLateral.add(botaoMenuEquilizarImagem);
		botaoMenuTransformacoes.setHorizontalAlignment(SwingConstants.LEFT);
		botaoMenuTransformacoes.setForeground(Color.BLACK);
		botaoMenuTransformacoes.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
		botaoMenuTransformacoes.setBackground(SystemColor.scrollbar);
		botaoMenuTransformacoes.setBounds(10, 202, 184, 39);
		panelOpcaoLateral.add(botaoMenuTransformacoes);
		
		// FIM PANEL LATERAL
		
		// INICIO PANEL OPCAO INTERNA
		
		JPanel panelOpcaoInterno = new JPanel();
		panelOpcaoInterno.setBackground(Color.WHITE);
		panelOpcaoInterno.setBounds(194, 102, 830, 618);
		add(panelOpcaoInterno);
		panelOpcaoInterno.setLayout(null);
		
		JButton botaoAND = new JButton("AND");
		botaoAND.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeMouse) {
				
				TelaOperadorLogicoAND telaOperadoreLogicoAND = new TelaOperadorLogicoAND();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(telaOperadoreLogicoAND);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
				
			}
		});
		botaoAND.setForeground(Color.WHITE);
		botaoAND.setBackground(new Color(0, 102, 255));
		botaoAND.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
		botaoAND.setBounds(10, 11, 393, 213);
		panelOpcaoInterno.add(botaoAND);
		
		JButton botaoOR = new JButton("OR");
		botaoOR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeMouse) {
				
				TelaOperadorLogicoOR telaOperadoreLogicoOR = new TelaOperadorLogicoOR();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(telaOperadoreLogicoOR);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
				
			}
		});
		botaoOR.setForeground(Color.WHITE);
		botaoOR.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
		botaoOR.setBackground(new Color(0, 102, 255));
		botaoOR.setBounds(413, 11, 393, 213);
		panelOpcaoInterno.add(botaoOR);
		
		JButton botaoXOR = new JButton("XOR");
		botaoXOR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeMouse) {
				
				TelaOperadorLogicoXOR telaOperadoreLogicoXOR = new TelaOperadorLogicoXOR();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(telaOperadoreLogicoXOR);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
			}
		});
		botaoXOR.setForeground(Color.WHITE);
		botaoXOR.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
		botaoXOR.setBackground(new Color(0, 102, 255));
		botaoXOR.setBounds(10, 235, 393, 213);
		panelOpcaoInterno.add(botaoXOR);
		
		// FIM PANEL OPCAO INTERNA
		
		//INICIO PANEL SUPERIOR
		
		JPanel panelSuperior = new JPanel();
		panelSuperior.setBackground(new Color(0, 51, 204));
		panelSuperior.setBounds(0, 0, 1024, 102);
		add(panelSuperior);
		panelSuperior.setLayout(null);
		
		JLabel labelOperacoesLogicasAritmeticas = new JLabel("Operadores Lógicos");
		labelOperacoesLogicasAritmeticas.setForeground(Color.WHITE);
		labelOperacoesLogicasAritmeticas.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 24));
		labelOperacoesLogicasAritmeticas.setBounds(10, 24, 730, 55);
		panelSuperior.add(labelOperacoesLogicasAritmeticas);
			
	}
}
