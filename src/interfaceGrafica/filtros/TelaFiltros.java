package interfaceGrafica.filtros;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import interfaceGrafica.equalizarImagem.TelaEqualizarImagem;
import interfaceGrafica.histograma.TelaHistograma;
import interfaceGrafica.operadores.TelaOperadores;
import interfaceGrafica.telaPrincipal.PanelInicial;
import interfaceGrafica.telaPrincipal.TelaInicial;
import interfaceGrafica.transformacoes.TelaTransformacoes;


public class TelaFiltros extends JPanel {

	private static final long serialVersionUID = 1L;

	BufferedImage imagemOriginal;

	public TelaFiltros(){
		setSize(1024, 720);
		setLayout(null);
		setVisible(true);

		// Painel lateral
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
		botaoPaginaInicial.setIcon(new ImageIcon(PanelInicial.class
				.getResource("/com/icon/home.png")));
		botaoPaginaInicial.setBounds(0, 31, 194, 39);
		botaoPaginaInicial.setForeground(Color.BLACK);
		botaoPaginaInicial.setBackground(SystemColor.scrollbar);
		botaoPaginaInicial.setFont(new Font("Segoe UI Semilight", Font.PLAIN,
				18));
		panelOpcaoLateral.add(botaoPaginaInicial);


		JButton botaoOperadores = new JButton("Operadores");
		botaoOperadores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeMouse) {
				
				TelaOperadores telaOperadores = new TelaOperadores();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(telaOperadores);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
				
			}
		});
		botaoOperadores.setHorizontalAlignment(SwingConstants.LEFT);
		botaoOperadores.setForeground(Color.BLACK);
		botaoOperadores.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
		botaoOperadores.setBackground(SystemColor.scrollbar);
		botaoOperadores.setBounds(10, 70, 184, 39);
		panelOpcaoLateral.add(botaoOperadores);
		
		JButton botaoMenuFiltros = new JButton("Filtros");
		botaoMenuFiltros.setHorizontalAlignment(SwingConstants.LEFT);
		botaoMenuFiltros.setForeground(Color.BLACK);
		botaoMenuFiltros.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
		botaoMenuFiltros.setBackground(SystemColor.scrollbar);
		botaoMenuFiltros.setBounds(10, 109, 184, 39);
		panelOpcaoLateral.add(botaoMenuFiltros);
		
		JButton botaoMenuHistograma = new JButton("Histogramas");
		botaoMenuHistograma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

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
		botaoMenuHistograma.setBounds(10, 146, 184, 39);
		panelOpcaoLateral.add(botaoMenuHistograma);
		
		
		JButton btnGatoDeArnold = new JButton("Gato de Arnold");
		btnGatoDeArnold.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaTransformacoes gato = new TelaTransformacoes();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(gato);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
			}
		});
		btnGatoDeArnold.setHorizontalAlignment(SwingConstants.LEFT);
		btnGatoDeArnold.setForeground(Color.BLACK);
		btnGatoDeArnold.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
		btnGatoDeArnold.setBackground(SystemColor.scrollbar);
		btnGatoDeArnold.setBounds(10, 182, 184, 39);
		panelOpcaoLateral.add(btnGatoDeArnold);
		
		JButton botaoMenuTransformacao = new JButton("Transforma\u00E7\u00E3o");
		botaoMenuTransformacao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				TelaTransformacoes telaTransformacao = new TelaTransformacoes();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(telaTransformacao);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
			}
		});
		botaoMenuTransformacao.setHorizontalAlignment(SwingConstants.LEFT);
		botaoMenuTransformacao.setForeground(Color.BLACK);
		botaoMenuTransformacao.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
		botaoMenuTransformacao.setBackground(SystemColor.scrollbar);
		botaoMenuTransformacao.setBounds(10, 219, 184, 39);
		panelOpcaoLateral.add(botaoMenuTransformacao);
		
		JButton botaoMenuEqualizacao = new JButton("Equaliza\u00E7\u00E3o");
		botaoMenuEqualizacao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				TelaEqualizarImagem TelaEqualizacao = new TelaEqualizarImagem();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(TelaEqualizacao);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
			}
		});
		botaoMenuEqualizacao.setHorizontalAlignment(SwingConstants.LEFT);
		botaoMenuEqualizacao.setForeground(Color.BLACK);
		botaoMenuEqualizacao.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
		botaoMenuEqualizacao.setBackground(SystemColor.scrollbar);
		botaoMenuEqualizacao.setBounds(10, 256, 184, 39);
		panelOpcaoLateral.add(botaoMenuEqualizacao);

		// INICIO PANEL SUPERIOR

		JPanel panelSuperior = new JPanel();
		panelSuperior.setBackground(new Color(0, 51, 204));
		panelSuperior.setBounds(0, 0, 1024, 102);
		add(panelSuperior);
		panelSuperior.setLayout(null);

		// Corpo do sistema
		JLabel labelFiltros = new JLabel("Filtros");
		labelFiltros.setForeground(Color.WHITE);
		labelFiltros.setFont(new Font("Segoe UI Semilight",
				Font.PLAIN, 24));
		labelFiltros.setBounds(10, 24, 730, 55);
		panelSuperior.add(labelFiltros);
		
		JButton botaoMedia = new JButton("Média");
		botaoMedia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeMouse) {
				
				TelaFiltroMedia telaFiltroMedia = new TelaFiltroMedia();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(telaFiltroMedia);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
				
			}
		});
		botaoMedia.setForeground(Color.WHITE);
		botaoMedia.setBackground(new Color(0, 102, 255));
		botaoMedia.setFont(new Font("Segoe UI Light", Font.BOLD, 18));
		botaoMedia.setBounds(224, 137, 200, 82);
		add(botaoMedia);
		
		JButton botaoSobel = new JButton("Sobel");
		botaoSobel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeMouse) {
				
				TelaFiltroSobel sobel = new TelaFiltroSobel();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(sobel);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
			}
		});
		botaoSobel.setForeground(SystemColor.text);
		botaoSobel.setFont(new Font("Segoe UI Light", Font.BOLD, 18));
		botaoSobel.setBackground(new Color(0, 102, 255));
		botaoSobel.setBounds(224, 377, 200, 82);
		add(botaoSobel);
		
		JButton botaoMediana = new JButton("Mediana");
		botaoMediana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeMouse) {
				
				TelaFiltroMediana telaFiltroMediana = new TelaFiltroMediana();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(telaFiltroMediana);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
				
			}
		});
		botaoMediana.setForeground(SystemColor.text);
		botaoMediana.setFont(new Font("Segoe UI Light", Font.BOLD, 18));
		botaoMediana.setBackground(new Color(0, 102, 255));
		botaoMediana.setBounds(470, 137, 200, 82);
		add(botaoMediana);
		
		JButton botaoPassaAlta = new JButton("Passa alta");
		botaoPassaAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeMouse) {
				
				TelaFiltroPassaAlta passa = new TelaFiltroPassaAlta();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(passa);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
			}
		});
		botaoPassaAlta.setForeground(SystemColor.text);
		botaoPassaAlta.setFont(new Font("Segoe UI Light", Font.BOLD, 18));
		botaoPassaAlta.setBackground(new Color(0, 102, 255));
		botaoPassaAlta.setBounds(728, 137, 200, 82);
		add(botaoPassaAlta);
		
		JButton botaoPrewitt = new JButton("Prewitt");
		botaoPrewitt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeMouse) {
				
				TelaFiltroPrewitt telaFiltroPrewitt = new TelaFiltroPrewitt();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(telaFiltroPrewitt);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
				
			}
		});
		botaoPrewitt.setForeground(SystemColor.text);
		botaoPrewitt.setFont(new Font("Segoe UI Light", Font.BOLD, 18));
		botaoPrewitt.setBackground(new Color(0, 102, 255));
		botaoPrewitt.setBounds(224, 250, 200, 82);
		add(botaoPrewitt);
		
		JButton botaoRoberts = new JButton("Roberts");
		botaoRoberts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaFiltroRoberts	roberts = new TelaFiltroRoberts();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(roberts);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
			}
		});
		botaoRoberts.setForeground(SystemColor.text);
		botaoRoberts.setFont(new Font("Segoe UI Light", Font.BOLD, 18));
		botaoRoberts.setBackground(new Color(0, 102, 255));
		botaoRoberts.setBounds(470, 250, 200, 82);
		add(botaoRoberts);
		
		JButton botaoRobertsCruzado = new JButton("Roberts cruzado");
		botaoRobertsCruzado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeMouse) {
				
				TelaFiltroRobertsCruzado robertsCruzado = new TelaFiltroRobertsCruzado();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(robertsCruzado);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
				
			}
		});
		botaoRobertsCruzado.setForeground(SystemColor.text);
		botaoRobertsCruzado.setFont(new Font("Segoe UI Light", Font.BOLD, 18));
		botaoRobertsCruzado.setBackground(new Color(0, 102, 255));
		botaoRobertsCruzado.setBounds(728, 250, 200, 82);
		add(botaoRobertsCruzado);

	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.drawImage((Image) imagemOriginal, 0, 0, null);
	}
}
