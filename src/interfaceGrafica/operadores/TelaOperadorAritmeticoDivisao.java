package interfaceGrafica.operadores;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import algoritmosDeProcessamentoDeImagens.Panel_OperadorAritmetico_Divisao;
import interfaceGrafica.filtros.TelaFiltros;
import interfaceGrafica.histograma.TelaHistograma;
import interfaceGrafica.telaPrincipal.PanelInicial;
import interfaceGrafica.telaPrincipal.TelaInicial;
import processarImagem.PanelDaImagem;

import javax.swing.JTextPane;

public class TelaOperadorAritmeticoDivisao extends JPanel {

	//BufferedImage imagem;
	PanelDaImagem panelDaImagem1 = new PanelDaImagem();
	PanelDaImagem panelDaImagem2 = new PanelDaImagem();
	Panel_OperadorAritmetico_Divisao panelDaImagem3 = new Panel_OperadorAritmetico_Divisao();
	
	/**
	 * Create the panel.
	 */
	public TelaOperadorAritmeticoDivisao() {
		
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
				botaoOperadoresAritmeticos.setBounds(20, 87, 174, 39);
				panelOpcaoLateral.add(botaoOperadoresAritmeticos);
				
				JButton botaoMenuAdicao = new JButton("Adição");
				botaoMenuAdicao.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						TelaOperadorAritmeticoAdicao adicao = new TelaOperadorAritmeticoAdicao();
						TelaInicial.contentPane.removeAll();
						TelaInicial.contentPane.add(adicao);
						TelaInicial.contentPane.validate();
						TelaInicial.contentPane.repaint();
					}
				});
				botaoMenuAdicao.setHorizontalAlignment(SwingConstants.LEFT);
				botaoMenuAdicao.setForeground(Color.BLACK);
				botaoMenuAdicao.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
				botaoMenuAdicao.setBackground(SystemColor.scrollbar);
				botaoMenuAdicao.setBounds(30, 126, 164, 39);
				panelOpcaoLateral.add(botaoMenuAdicao);
				
				JButton botaoMenuSubtracao = new JButton("Subtração");
				botaoMenuSubtracao.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent eventoDeMouse) {
						
						TelaOperadorAritmeticoSubtracao telaOperadorAritmeticoSubtracao = new TelaOperadorAritmeticoSubtracao();
						TelaInicial.contentPane.removeAll();
						TelaInicial.contentPane.add(telaOperadorAritmeticoSubtracao);
						TelaInicial.contentPane.validate();
						TelaInicial.contentPane.repaint();
						
					}
				});
				botaoMenuSubtracao.setHorizontalAlignment(SwingConstants.LEFT);
				botaoMenuSubtracao.setForeground(Color.BLACK);
				botaoMenuSubtracao.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
				botaoMenuSubtracao.setBackground(SystemColor.scrollbar);
				botaoMenuSubtracao.setBounds(30, 165, 164, 39);
				panelOpcaoLateral.add(botaoMenuSubtracao);
				
				JButton botaoMenuMultiplicacao = new JButton("Multiplicação");
				botaoMenuMultiplicacao.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent eventoDeMouse) {
						
						TelaOperadorAritmeticoMultiplicacao telaOperadorAritmeticoMultiplicacao = new TelaOperadorAritmeticoMultiplicacao();
						TelaInicial.contentPane.removeAll();
						TelaInicial.contentPane.add(telaOperadorAritmeticoMultiplicacao);
						TelaInicial.contentPane.validate();
						TelaInicial.contentPane.repaint();
						
					}
				});
				botaoMenuMultiplicacao.setHorizontalAlignment(SwingConstants.LEFT);
				botaoMenuMultiplicacao.setForeground(Color.BLACK);
				botaoMenuMultiplicacao.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
				botaoMenuMultiplicacao.setBackground(SystemColor.scrollbar);
				botaoMenuMultiplicacao.setBounds(30, 203, 164, 39);
				panelOpcaoLateral.add(botaoMenuMultiplicacao);
				
				JButton botaoMenuDivisao = new JButton("Divisão");
				botaoMenuDivisao.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent eventoDeMouse) {
						
						TelaOperadorAritmeticoDivisao telaOperadorAritmeticoDivisao = new TelaOperadorAritmeticoDivisao();
						TelaInicial.contentPane.removeAll();
						TelaInicial.contentPane.add(telaOperadorAritmeticoDivisao);
						TelaInicial.contentPane.validate();
						TelaInicial.contentPane.repaint();
						
					}
				});
				botaoMenuDivisao.setHorizontalAlignment(SwingConstants.LEFT);
				botaoMenuDivisao.setForeground(Color.BLACK);
				botaoMenuDivisao.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
				botaoMenuDivisao.setBackground(Color.GRAY);
				botaoMenuDivisao.setBounds(30, 242, 164, 39);
				panelOpcaoLateral.add(botaoMenuDivisao);
				
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
				botaoMenuFiltros.setBounds(10, 320, 184, 39);
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
				botaoOperadores.setBounds(10, 49, 184, 39);
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
				botaoMenuHistograma.setBounds(10, 359, 184, 39);
				panelOpcaoLateral.add(botaoMenuHistograma);
				
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
				botaoOperadoresLogicos.setBounds(20, 281, 174, 39);
				panelOpcaoLateral.add(botaoOperadoresLogicos);
				
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
		textPaneSelecionarImagem.setText("Selecione as duas imagens a serem processadas com a função aritmética de divisão");
		textPaneSelecionarImagem.setBounds(22, 11, 220, 90);
		panelOpcaoInterno.add(textPaneSelecionarImagem);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("Imagem processada com o algoritmo de divisão");
		textPane.setForeground(Color.WHITE);
		textPane.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
		textPane.setEditable(false);
		textPane.setBackground(new Color(153, 153, 153));
		textPane.setBounds(22, 311, 220, 90);
		panelOpcaoInterno.add(textPane);
		
		JButton botaoAdicao = new JButton("Processar Divisão");
		botaoAdicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeMouse) {
				
				panelDaImagem3.colocaImagemNoPainel(panelDaImagem1.altura, panelDaImagem1.largura, panelDaImagem1.matrizImagem, panelDaImagem2.altura, panelDaImagem2.largura, panelDaImagem2.matrizImagem);
				
			}
		});
		botaoAdicao.setForeground(Color.WHITE);
		botaoAdicao.setBackground(new Color(0, 102, 255));
		botaoAdicao.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
		botaoAdicao.setBounds(266, 311, 250, 250);
		panelOpcaoInterno.add(botaoAdicao);
		
		
		// FIM PANEL OPCAO INTERNA
		
		//INICIO PANEL SUPERIOR
		
		JPanel panelSuperior = new JPanel();
		panelSuperior.setBackground(new Color(0, 51, 204));
		panelSuperior.setBounds(0, 0, 1024, 102);
		add(panelSuperior);
		panelSuperior.setLayout(null);
		
		JLabel labelOperacoesLogicasAritmeticas = new JLabel("Operadores Lógicos e Aritméticos   >>   Divisão");
		labelOperacoesLogicasAritmeticas.setForeground(Color.WHITE);
		labelOperacoesLogicasAritmeticas.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 24));
		labelOperacoesLogicasAritmeticas.setBounds(10, 24, 730, 55);
		panelSuperior.add(labelOperacoesLogicasAritmeticas);

	}
}
