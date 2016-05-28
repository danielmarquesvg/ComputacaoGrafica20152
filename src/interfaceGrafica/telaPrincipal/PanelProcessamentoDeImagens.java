package interfaceGrafica.telaPrincipal;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import interfaceGrafica.circunferencia.PainelCircunferencia;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class PanelProcessamentoDeImagens extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelProcessamentoDeImagens() {
		
		setBackground(Color.WHITE);
		
		setSize(1024, 720);
		setLayout(null);
		
		JPanel panelCabecalho = new JPanel();
		panelCabecalho.setBackground(new Color(0, 153, 153));
		panelCabecalho.setBounds(0, 0, 1024, 42);
		add(panelCabecalho);
		panelCabecalho.setLayout(null);
		
		JLabel labelTituloDoCabecalho = new JLabel("Projeto de Processamento de Imagens");
		labelTituloDoCabecalho.setForeground(Color.WHITE);
		labelTituloDoCabecalho.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		labelTituloDoCabecalho.setBounds(10, 11, 350, 27);
		panelCabecalho.add(labelTituloDoCabecalho);
		
		
		
		JButton botaoNormalizacao = new JButton("Normalização");
		botaoNormalizacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeCliqueDeMouse) {
				
			}
		});
		botaoNormalizacao.setBackground(new Color(0, 102, 102));
		botaoNormalizacao.setForeground(Color.WHITE);
		botaoNormalizacao.setBounds(365, 235, 227, 112);
		botaoNormalizacao.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		add(botaoNormalizacao);
		
		JButton botaoOperadoresLogicosAritmeticos = new JButton("Operadores Lógicos e Aritméticos");
		botaoOperadoresLogicosAritmeticos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeCliqueDeMouse) {
				
			}
		});
		botaoOperadoresLogicosAritmeticos.setForeground(Color.WHITE);
		botaoOperadoresLogicosAritmeticos.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		botaoOperadoresLogicosAritmeticos.setBackground(new Color(0, 102, 51));
		botaoOperadoresLogicosAritmeticos.setBounds(39, 76, 315, 112);
		add(botaoOperadoresLogicosAritmeticos);
		
		JButton botaoReta = new JButton("Reta");
		botaoReta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeCliqueDeMouse) {
				
			}
		});
		botaoReta.setForeground(Color.WHITE);
		botaoReta.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		botaoReta.setBackground(new Color(0, 102, 153));
		botaoReta.setBounds(514, 76, 227, 112);
		add(botaoReta);
		
		ImageIcon imageIcon = new ImageIcon(PanelComputacaoGrafica.class.getResource("/imagens/iconHomePage.png"));
		int scale = 2; // 2 times smaller
		int width = imageIcon.getIconWidth();
		int newWidth = width / scale;
		
		JButton botaoPaginaInicial = new JButton("");
		botaoPaginaInicial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeCliqueDeMouse) {
				
				PanelInicial panelInicial = new PanelInicial();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(panelInicial);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
				
			}
		});
		botaoPaginaInicial.setBounds(960, 11, 35, 27);
		panelCabecalho.add(botaoPaginaInicial);
		botaoPaginaInicial.setIcon(new ImageIcon(imageIcon.getImage().getScaledInstance(newWidth, -1,java.awt.Image.SCALE_SMOOTH)));
		botaoPaginaInicial.setOpaque(false);
		botaoPaginaInicial.setContentAreaFilled(false);
		botaoPaginaInicial.setBorderPainted(true);
		
		JButton botaoCircunferencia = new JButton("Circunferencia");
		botaoCircunferencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PainelCircunferencia painelCircun = new PainelCircunferencia();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(painelCircun);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
				
			}
		});
		botaoCircunferencia.setForeground(Color.WHITE);
		botaoCircunferencia.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		botaoCircunferencia.setBackground(new Color(0, 102, 204));
		botaoCircunferencia.setBounds(751, 76, 227, 112);
		add(botaoCircunferencia);
		

	}
}
