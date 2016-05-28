package interfaceGrafica.filtros;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import algoritmos.Panel_Filtros_Mediana;
import interfaceGrafica.equalizarImagem.TelaEqualizarImagem;
import interfaceGrafica.histograma.TelaHistograma;
import interfaceGrafica.operadores.TelaOperadores;
import interfaceGrafica.telaPrincipal.PanelInicial;
import interfaceGrafica.telaPrincipal.TelaInicial;
import interfaceGrafica.transformacoes.TelaTransformacoes;
import processarImagem.PanelDaImagem;


public class TelaFiltroMediana extends JPanel {

	PanelDaImagem panelDaImagem1 = new PanelDaImagem();
	Panel_Filtros_Mediana panelDaImagem2 = new Panel_Filtros_Mediana();

	public TelaFiltroMediana() {
		setSize(1024, 720);
		setLayout(null);
		setVisible(true);

		// Painel lateral
		JPanel panelOpcaoLateral = new JPanel();
		panelOpcaoLateral.setBackground(SystemColor.scrollbar);
		panelOpcaoLateral.setBounds(0, 0, 194, 720);
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
		botaoPaginaInicial.setBounds(0, 102, 194, 39);
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
		botaoOperadores.setBounds(10, 141, 184, 39);
		panelOpcaoLateral.add(botaoOperadores);

		JButton botaoMenuFiltros = new JButton("Filtros");
		botaoMenuFiltros.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				TelaFiltros telaFiltro = new TelaFiltros();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(telaFiltro);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
			}
		});
		botaoMenuFiltros.setHorizontalAlignment(SwingConstants.LEFT);
		botaoMenuFiltros.setForeground(Color.BLACK);
		botaoMenuFiltros
				.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
		botaoMenuFiltros.setBackground(SystemColor.scrollbar);
		botaoMenuFiltros.setBounds(10, 180, 184, 39);
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
		botaoMenuHistograma.setFont(new Font("Segoe UI Semilight", Font.PLAIN,
				14));
		botaoMenuHistograma.setBackground(SystemColor.scrollbar);
		botaoMenuHistograma.setBounds(10, 217, 184, 39);
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
		btnGatoDeArnold.setBounds(10, 253, 184, 39);
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
		botaoMenuTransformacao.setFont(new Font("Segoe UI Semilight",
				Font.PLAIN, 14));
		botaoMenuTransformacao.setBackground(SystemColor.scrollbar);
		botaoMenuTransformacao.setBounds(10, 290, 184, 39);
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
		botaoMenuEqualizacao.setFont(new Font("Segoe UI Semilight", Font.PLAIN,
				14));
		botaoMenuEqualizacao.setBackground(SystemColor.scrollbar);
		botaoMenuEqualizacao.setBounds(10, 327, 184, 39);
		panelOpcaoLateral.add(botaoMenuEqualizacao);

		botaoPaginaInicial.setHorizontalAlignment(SwingConstants.LEFT);
		botaoPaginaInicial.setIcon(new ImageIcon(PanelInicial.class
				.getResource("/com/icon/home.png")));
		botaoPaginaInicial.setBounds(0, 102, 194, 39);
		botaoPaginaInicial.setForeground(Color.BLACK);
		botaoPaginaInicial.setBackground(SystemColor.scrollbar);
		botaoPaginaInicial.setFont(new Font("Segoe UI Semilight", Font.PLAIN,
				18));
		panelOpcaoLateral.add(botaoPaginaInicial);

		JLabel lblImg = new JLabel("");
		lblImg.setIcon(new ImageIcon(TelaHistograma.class
				.getResource("/com/br/images/logo.jpg")));
		lblImg.setBounds(0, 0, 194, 103);
		panelOpcaoLateral.add(lblImg);

		// INICIO PANEL SUPERIOR

		JPanel panelSuperior = new JPanel();
		panelSuperior.setBackground(SystemColor.windowBorder);
		panelSuperior.setBounds(194, 0, 830, 102);
		add(panelSuperior);
		panelSuperior.setLayout(null);

		// Corpo do sistema
		JLabel labelFiltroMediana = new JLabel("Filtros > Mediana");
		labelFiltroMediana.setForeground(Color.WHITE);
		labelFiltroMediana.setFont(new Font("Segoe UI Semilight", Font.PLAIN,
				24));
		labelFiltroMediana.setBounds(10, 24, 730, 55);
		panelSuperior.add(labelFiltroMediana);

		panelDaImagem1 = new PanelDaImagem();
		panelDaImagem1.setBounds(204, 113, 250, 250);
		add(panelDaImagem1);

		panelDaImagem2.setBounds(491, 410, 250, 250);
		panelDaImagem2.setVisible(true);
		add(panelDaImagem2);

		JButton botaoSelecionarImagem = new JButton("Escolher imagem");
		botaoSelecionarImagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeMouse) {

				try {

					// Instanciacao de fileChooser e alteracao do diretorio para
					// buscar a imagem
					final JFileChooser fileChooser = new JFileChooser();
					fileChooser.setCurrentDirectory(new File("src/imagens"));

					// Verificacao do fileChooser
					if (fileChooser.showOpenDialog(botaoSelecionarImagem) == JFileChooser.APPROVE_OPTION) {

						// Cria um file onde eh armazenada a imagem
						File file = fileChooser.getSelectedFile();

						panelDaImagem1.colocaImagemNoPainel(file.getPath());
						repaint();
					}

				} catch (Exception erro) {

					JOptionPane.showMessageDialog(null,
							"Não foi possivel carregar a imagem.");

				}

			}
		});
		botaoSelecionarImagem
				.setFont(new Font("Segoe UI Light", Font.BOLD, 14));
		botaoSelecionarImagem.setBackground(new Color(0, 102, 255));
		botaoSelecionarImagem.setBounds(204, 364, 250, 35);
		add(botaoSelecionarImagem);

		JButton botaoMediana = new JButton("Processar Mediana");
		botaoMediana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeMouse) {

				panelDaImagem2.colocaImagemNoPainel(panelDaImagem1.altura,
						panelDaImagem1.largura, panelDaImagem1.matrizImagem);

			}
		});
		botaoMediana.setForeground(Color.WHITE);
		botaoMediana.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
		botaoMediana.setBackground(new Color(0, 102, 255));
		botaoMediana.setBounds(204, 410, 250, 250);
		add(botaoMediana);

	}
}
