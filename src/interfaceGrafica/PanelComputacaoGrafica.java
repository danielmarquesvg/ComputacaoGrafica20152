package interfaceGrafica;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class PanelComputacaoGrafica extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelComputacaoGrafica() {
		
		setBackground(Color.WHITE);
		
		setSize(1024, 720);
		setLayout(null);
		
		JPanel panelCabecalho = new JPanel();
		panelCabecalho.setBackground(new Color(102, 102, 102));
		panelCabecalho.setBounds(0, 0, 1024, 42);
		add(panelCabecalho);
		panelCabecalho.setLayout(null);
		
		JLabel labelTituloDoCabecalho = new JLabel("Projeto de Computação Gráfica");
		labelTituloDoCabecalho.setForeground(Color.WHITE);
		labelTituloDoCabecalho.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		labelTituloDoCabecalho.setBounds(10, 11, 273, 27);
		panelCabecalho.add(labelTituloDoCabecalho);
		
		
		
		JButton botaoNormalizacao = new JButton("Normalização");
		botaoNormalizacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeCliqueDeMouse) {
				
				PanelNormalizacao panelNormalizacao = new PanelNormalizacao();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(panelNormalizacao);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
				
			}
		});
		botaoNormalizacao.setBackground(new Color(0, 102, 102));
		botaoNormalizacao.setForeground(Color.WHITE);
		botaoNormalizacao.setBounds(277, 76, 227, 112);
		botaoNormalizacao.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		add(botaoNormalizacao);
		
		JButton botaoTabelaDeCores = new JButton("Tabela de Cores");
		botaoTabelaDeCores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeCliqueDeMouse) {
				
				PanelTabelaDeCores panelTabelaDeCores = new PanelTabelaDeCores();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(panelTabelaDeCores);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
				
				
			}
		});
		botaoTabelaDeCores.setForeground(Color.WHITE);
		botaoTabelaDeCores.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		botaoTabelaDeCores.setBackground(new Color(0, 102, 51));
		botaoTabelaDeCores.setBounds(40, 76, 227, 112);
		add(botaoTabelaDeCores);
		
		JButton botaoReta = new JButton("Reta");
		botaoReta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeCliqueDeMouse) {
				
				PanelReta panelReta = new PanelReta();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(panelReta);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
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
		

	}

}
