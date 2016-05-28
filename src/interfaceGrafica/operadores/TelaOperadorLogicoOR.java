package interfaceGrafica.operadores;

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
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import algoritmos.Panel_OperadorLogico_OR;
import interfaceGrafica.equalizarImagem.TelaEqualizarImagem;
import interfaceGrafica.filtros.TelaFiltros;
import interfaceGrafica.gatoDeArnold.TelaGatoDeArnold;
import interfaceGrafica.histograma.TelaHistograma;
import interfaceGrafica.telaPrincipal.PanelInicial;
import interfaceGrafica.telaPrincipal.TelaInicial;
import interfaceGrafica.transformacoes.TelaTransformacoes;
import processarImagem.PanelDaImagem;

public class TelaOperadorLogicoOR extends JPanel {

	//BufferedImage imagem;
	PanelDaImagem panelDaImagem1 = new PanelDaImagem();
	PanelDaImagem panelDaImagem2 = new PanelDaImagem();
	Panel_OperadorLogico_OR panelDaImagem3 = new Panel_OperadorLogico_OR();
	
	/**
	 * Create the panel.
	 */
	public TelaOperadorLogicoOR() {
		
		setSize(1024, 720);
		setLayout(null);
		setVisible(true);
		
		// INICIO PANEL OPCAO LATERAL
		
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
		botaoPaginaInicial.setIcon(new ImageIcon(PanelInicial.class.getResource("/com/icon/home.png")));
		botaoPaginaInicial.setBounds(0, 102, 194, 39);
		botaoPaginaInicial.setForeground(Color.BLACK);
		botaoPaginaInicial.setBackground(SystemColor.scrollbar);
		botaoPaginaInicial.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
		panelOpcaoLateral.add(botaoPaginaInicial);
		
		JButton botaoOperadoresAritmeticos = new JButton("Aritméticos");
		botaoOperadoresAritmeticos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeMouse) {
				
				TelaOperadoresAritmeticos telaOperadoresLogicosAritmeticos = new TelaOperadoresAritmeticos();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(telaOperadoresLogicosAritmeticos);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
				
			}
		});
		botaoOperadoresAritmeticos.setHorizontalAlignment(SwingConstants.LEFT);
		botaoOperadoresAritmeticos.setForeground(Color.BLACK);
		botaoOperadoresAritmeticos.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
		botaoOperadoresAritmeticos.setBackground(SystemColor.scrollbar);
		botaoOperadoresAritmeticos.setBounds(20, 178, 174, 39);
		panelOpcaoLateral.add(botaoOperadoresAritmeticos);
		
		JButton botaoMenuAND = new JButton("AND");
		botaoMenuAND.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeMouse) {
				
				TelaOperadorLogicoAND telaOperadorLogicoAND = new TelaOperadorLogicoAND();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(telaOperadorLogicoAND);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
				
			}
		});
		botaoMenuAND.setHorizontalAlignment(SwingConstants.LEFT);
		botaoMenuAND.setForeground(Color.BLACK);
		botaoMenuAND.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
		botaoMenuAND.setBackground(SystemColor.scrollbar);
		botaoMenuAND.setBounds(30, 255, 164, 39);
		panelOpcaoLateral.add(botaoMenuAND);
		
		JButton botaoMenuOR = new JButton("OR");
		botaoMenuOR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeMouse) {
				
			}
		});
		botaoMenuOR.setHorizontalAlignment(SwingConstants.LEFT);
		botaoMenuOR.setForeground(Color.BLACK);
		botaoMenuOR.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
		botaoMenuOR.setBackground(Color.GRAY);
		botaoMenuOR.setBounds(30, 294, 164, 39);
		panelOpcaoLateral.add(botaoMenuOR);
		
		JButton botaoMenuXOR = new JButton("XOR");
		botaoMenuXOR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeMouse) {
				
				TelaOperadorLogicoXOR telaOperadoreLogicoXOR = new TelaOperadorLogicoXOR();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(telaOperadoreLogicoXOR);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
				
			}
		});
		botaoMenuXOR.setHorizontalAlignment(SwingConstants.LEFT);
		botaoMenuXOR.setForeground(Color.BLACK);
		botaoMenuXOR.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
		botaoMenuXOR.setBackground(SystemColor.scrollbar);
		botaoMenuXOR.setBounds(30, 333, 164, 39);
		panelOpcaoLateral.add(botaoMenuXOR);
		
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
		botaoMenuFiltros.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
		botaoMenuFiltros.setBackground(SystemColor.scrollbar);
		botaoMenuFiltros.setBounds(10, 372, 184, 39);
		panelOpcaoLateral.add(botaoMenuFiltros);
		
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
		botaoOperadores.setBounds(10, 140, 184, 39);
		panelOpcaoLateral.add(botaoOperadores);
		
		JButton botaoMenuHistograma = new JButton("Histograma");
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
		botaoMenuHistograma.setBounds(10, 410, 184, 39);
		panelOpcaoLateral.add(botaoMenuHistograma);
		
		JLabel lblImg = new JLabel("");
		lblImg.setIcon(new ImageIcon(TelaOperadorAritmeticoAdicao.class.getResource("/com/br/images/logo.jpg")));
		lblImg.setBounds(0, 0, 194, 104);
		panelOpcaoLateral.add(lblImg);
		
		JButton botaoOperadoresLogicos = new JButton("Lógicos");
		botaoOperadoresLogicos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeMouse) {
				
				TelaOperadorLogico telaOperadorLogico = new TelaOperadorLogico();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(telaOperadorLogico);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
				
			}
		});
		botaoOperadoresLogicos.setHorizontalAlignment(SwingConstants.LEFT);
		botaoOperadoresLogicos.setForeground(Color.BLACK);
		botaoOperadoresLogicos.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
		botaoOperadoresLogicos.setBackground(SystemColor.scrollbar);
		botaoOperadoresLogicos.setBounds(20, 217, 174, 39);
		panelOpcaoLateral.add(botaoOperadoresLogicos);
		
		JButton botaoMenuGatoDeArnold = new JButton("Gato de Arnold");
		botaoMenuGatoDeArnold.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaGatoDeArnold telaGato = new TelaGatoDeArnold();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(telaGato);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
			}
		});
		botaoMenuGatoDeArnold.setHorizontalAlignment(SwingConstants.LEFT);
		botaoMenuGatoDeArnold.setForeground(Color.BLACK);
		botaoMenuGatoDeArnold.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
		botaoMenuGatoDeArnold.setBackground(SystemColor.scrollbar);
		botaoMenuGatoDeArnold.setBounds(10, 448, 184, 39);
		panelOpcaoLateral.add(botaoMenuGatoDeArnold);
		
		JButton botaoMenuTransformacao = new JButton("Transforma\u00E7\u00E3o");
		botaoMenuTransformacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaTransformacoes telatransf = new TelaTransformacoes();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(telatransf);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
			}
		});
		botaoMenuTransformacao.setHorizontalAlignment(SwingConstants.LEFT);
		botaoMenuTransformacao.setForeground(Color.BLACK);
		botaoMenuTransformacao.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
		botaoMenuTransformacao.setBackground(SystemColor.scrollbar);
		botaoMenuTransformacao.setBounds(10, 486, 184, 39);
		panelOpcaoLateral.add(botaoMenuTransformacao);
		
		JButton botaoMenuEqualizacao = new JButton("Equaliza\u00E7\u00E3o");
		botaoMenuEqualizacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaEqualizarImagem telaGato = new TelaEqualizarImagem();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(telaGato);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
			}
		});
		botaoMenuEqualizacao.setHorizontalAlignment(SwingConstants.LEFT);
		botaoMenuEqualizacao.setForeground(Color.BLACK);
		botaoMenuEqualizacao.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
		botaoMenuEqualizacao.setBackground(SystemColor.scrollbar);
		botaoMenuEqualizacao.setBounds(10, 524, 184, 39);
		panelOpcaoLateral.add(botaoMenuEqualizacao);
		// FIM PANEL LATERAL
		
		// INICIO PANEL OPCAO INTERNA
		
		JPanel panelOpcaoInterno = new JPanel();
		panelOpcaoInterno.setBackground(Color.WHITE);
		panelOpcaoInterno.setBounds(194, 102, 830, 618);
		panelOpcaoInterno.setLayout(null);
		add(panelOpcaoInterno);
		
		panelDaImagem1.setBounds(266, 11, 250, 250);
		panelDaImagem1.setVisible(true);
		panelOpcaoInterno.add(panelDaImagem1);
		
		panelDaImagem2.setBounds(551, 11, 250, 250);
		panelDaImagem2.setVisible(true);
		panelOpcaoInterno.add(panelDaImagem2);
		
		panelDaImagem3.setBounds(551, 311, 250, 250);
		panelDaImagem3.setVisible(true);
		panelOpcaoInterno.add(panelDaImagem3);
		
		JButton botaoSelecionarImagem1 = new JButton("Selecionar Imagem");
		botaoSelecionarImagem1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeMouse) {
				
				try{  
					
					//Instanciacao de fileChooser e alteracao do diretorio para buscar a imagem
					final JFileChooser fileChooser = new JFileChooser();
					fileChooser.setCurrentDirectory(new File ("src/imagens"));
					
					//Verificacao do fileChooser
					if (fileChooser.showOpenDialog(botaoSelecionarImagem1) == JFileChooser.APPROVE_OPTION) {
						
						//Cria um file onde eh armazenada a imagem
						File file = fileChooser.getSelectedFile();
						
						panelDaImagem1.colocaImagemNoPainel(file.getPath());			
						repaint();
					}
					
				}catch(Exception erro){  
				        
					JOptionPane.showMessageDialog(null, "Não foi possivel carregar a imagem.");  
				        
				}    
				
			}
		});
		botaoSelecionarImagem1.setForeground(Color.WHITE);
		botaoSelecionarImagem1.setBackground(new Color(0, 102, 255));
		botaoSelecionarImagem1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
		botaoSelecionarImagem1.setBounds(266, 261, 250, 29);
		panelOpcaoInterno.add(botaoSelecionarImagem1);
		
		JButton botaoSelecionarImagem2 = new JButton("Selecionar Imagem");
		botaoSelecionarImagem2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{  
					
					//Instanciacao de fileChooser e alteracao do diretorio para buscar a imagem
					final JFileChooser fileChooser = new JFileChooser();
					fileChooser.setCurrentDirectory(new File ("src/imagens"));
					
					//Verificacao do fileChooser
					if (fileChooser.showOpenDialog(botaoSelecionarImagem2) == JFileChooser.APPROVE_OPTION) {
						
						//Cria um file onde eh armazenada a imagem
						File file = fileChooser.getSelectedFile();
						
						panelDaImagem2.colocaImagemNoPainel(file.getPath());
						repaint();	
					}
					
				}catch(Exception erro){  
					JOptionPane.showMessageDialog(null, "Não foi possivel carregar a imagem.");         
				}    
			}
		});
		botaoSelecionarImagem2.setForeground(Color.WHITE);
		botaoSelecionarImagem2.setBackground(new Color(0, 102, 255));
		botaoSelecionarImagem2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
		botaoSelecionarImagem2.setBounds(551, 261, 250, 29);
		panelOpcaoInterno.add(botaoSelecionarImagem2);
		
		JTextPane textPaneSelecionarImagem = new JTextPane();
		textPaneSelecionarImagem.setEditable(false);
		textPaneSelecionarImagem.setForeground(Color.WHITE);
		textPaneSelecionarImagem.setBackground(new Color(153, 153, 153));
		textPaneSelecionarImagem.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
		textPaneSelecionarImagem.setText("Selecione as duas imagens a serem processadas com a função lógica OR");
		textPaneSelecionarImagem.setBounds(22, 11, 220, 90);
		panelOpcaoInterno.add(textPaneSelecionarImagem);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("Imagem processada com o algoritmo OR");
		textPane.setForeground(Color.WHITE);
		textPane.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
		textPane.setEditable(false);
		textPane.setBackground(new Color(153, 153, 153));
		textPane.setBounds(22, 311, 220, 90);
		panelOpcaoInterno.add(textPane);
		
		JButton botaoOR = new JButton("Processar OR");
		botaoOR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeMouse) {
				
				panelDaImagem3.colocaImagemNoPainel(panelDaImagem1.altura, panelDaImagem1.largura, panelDaImagem1.matrizImagem, panelDaImagem2.altura, panelDaImagem2.largura, panelDaImagem2.matrizImagem);
				
			}
		});
		botaoOR.setForeground(Color.WHITE);
		botaoOR.setBackground(new Color(0, 102, 255));
		botaoOR.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
		botaoOR.setBounds(266, 311, 250, 250);
		panelOpcaoInterno.add(botaoOR);
		
		
		// FIM PANEL OPCAO INTERNA
		
		//INICIO PANEL SUPERIOR
		
		JPanel panelSuperior = new JPanel();
		panelSuperior.setBackground(SystemColor.windowBorder);
		panelSuperior.setBounds(194, 0, 830, 102);
		add(panelSuperior);
		panelSuperior.setLayout(null);
		
		JLabel labelOperacoesLogicasOR = new JLabel("Operadores Lógicos   >>   OR");
		labelOperacoesLogicasOR.setForeground(Color.WHITE);
		labelOperacoesLogicasOR.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 24));
		labelOperacoesLogicasOR.setBounds(10, 24, 730, 55);
		panelSuperior.add(labelOperacoesLogicasOR);

	}
}
