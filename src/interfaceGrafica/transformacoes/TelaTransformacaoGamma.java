package interfaceGrafica.transformacoes;

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

import algoritmos.Panel_Transformacao_Gamma;
import interfaceGrafica.equalizarImagem.TelaEqualizarImagem;
import interfaceGrafica.filtros.TelaFiltros;
import interfaceGrafica.gatoDeArnold.TelaGatoDeArnold;
import interfaceGrafica.histograma.TelaHistograma;
import interfaceGrafica.operadores.TelaOperadores;
import interfaceGrafica.telaPrincipal.PanelInicial;
import interfaceGrafica.telaPrincipal.TelaInicial;
import processarImagem.PanelDaImagem;

import javax.swing.JTextField;


public class TelaTransformacaoGamma extends JPanel {

	PanelDaImagem panelDaImagem1 = new PanelDaImagem();
	Panel_Transformacao_Gamma panelDaImagem2 = new Panel_Transformacao_Gamma();
	private JTextField textField_valorGamma;
	
	public TelaTransformacaoGamma(){
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
		botaoPaginaInicial.setIcon(new ImageIcon(PanelInicial.class.getResource("/com/icon/home.png")));
		botaoPaginaInicial.setBounds(0, 102, 194, 39);
		botaoPaginaInicial.setForeground(Color.BLACK);
		botaoPaginaInicial.setBackground(SystemColor.scrollbar);
		botaoPaginaInicial.setFont(new Font("Segoe UI Semilight", Font.PLAIN,18));
		panelOpcaoLateral.add(botaoPaginaInicial);

		JLabel lblImg = new JLabel("");
		lblImg.setIcon(new ImageIcon(TelaHistograma.class.getResource("/com/br/images/logo.jpg")));
		lblImg.setBounds(0, 0, 194, 103);
		panelOpcaoLateral.add(lblImg);


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
		botaoMenuFiltros.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
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
		botaoMenuHistograma.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
		botaoMenuHistograma.setBackground(SystemColor.scrollbar);
		botaoMenuHistograma.setBounds(10, 217, 184, 39);
		panelOpcaoLateral.add(botaoMenuHistograma);
		
		
		JButton btnGatoDeArnold = new JButton("Gato de Arnold");
		btnGatoDeArnold.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaGatoDeArnold gato = new TelaGatoDeArnold();
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
		botaoMenuTransformacao.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
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
		botaoMenuEqualizacao.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
		botaoMenuEqualizacao.setBackground(SystemColor.scrollbar);
		botaoMenuEqualizacao.setBounds(10, 327, 184, 39);
		panelOpcaoLateral.add(botaoMenuEqualizacao);

		// INICIO PANEL SUPERIOR

		JPanel panelSuperior = new JPanel();
		panelSuperior.setBackground(SystemColor.windowBorder);
		panelSuperior.setBounds(194, 0, 830, 102);
		add(panelSuperior);
		panelSuperior.setLayout(null);

		// Corpo do sistema
		JLabel labelTransformacaoGamma = new JLabel("Transformação > Gamma");
		labelTransformacaoGamma.setForeground(Color.WHITE);
		labelTransformacaoGamma.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 24));
		labelTransformacaoGamma.setBounds(10, 24, 730, 55);
		panelSuperior.add(labelTransformacaoGamma);
		
		panelDaImagem1 = new PanelDaImagem();
		panelDaImagem1.setBounds(204, 113, 250, 250);
		add(panelDaImagem1);
		
		panelDaImagem2.setBounds(491, 410, 250, 250);
		panelDaImagem2.setVisible(true);
		add(panelDaImagem2);
		
		JButton botaoSelecionarImagem = new JButton("Escolher imagem");
		botaoSelecionarImagem.setForeground(Color.WHITE);
		botaoSelecionarImagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeMouse) {
				
				try{  
					
					//Instanciacao de fileChooser e alteracao do diretorio para buscar a imagem
					final JFileChooser fileChooser = new JFileChooser();
					fileChooser.setCurrentDirectory(new File ("src/"));
					
					//Verificacao do fileChooser
					if (fileChooser.showOpenDialog(botaoSelecionarImagem) == JFileChooser.APPROVE_OPTION) {
						
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
		botaoSelecionarImagem.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
		botaoSelecionarImagem.setBackground(new Color(0, 102, 255));
		botaoSelecionarImagem.setBounds(204, 364, 250, 35);
		add(botaoSelecionarImagem);
		
		textField_valorGamma = new JTextField();
		textField_valorGamma.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
		textField_valorGamma.setBounds(491, 208, 250, 46);
		add(textField_valorGamma);
		textField_valorGamma.setColumns(10);
		
		JButton botaoGamma = new JButton("Processar Gamma");
		botaoGamma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeMouse) {
				
				textField_valorGamma.setText(textField_valorGamma.getText().replace(",", "."));
				float valorGamma = Float.parseFloat(textField_valorGamma.getText());
				
				if(valorGamma > 1){
					valorGamma = 1;
				}
				
				if(valorGamma < 0){
					valorGamma = 0;
				}
				
				float valorC = 1;
				
				panelDaImagem2.colocaImagemNoPainel(panelDaImagem1.altura, panelDaImagem1.largura, panelDaImagem1.matrizImagem, 
						valorGamma, valorC);
				
			}
		});
		botaoGamma.setForeground(Color.WHITE);
		botaoGamma.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
		botaoGamma.setBackground(new Color(0, 102, 255));
		botaoGamma.setBounds(204, 410, 250, 250);
		add(botaoGamma);
		
		JLabel labelGamma = new JLabel("Gamma \u03B3  ( 0 \u2264 \u03B3 \u2264 1 )");
		labelGamma.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
		labelGamma.setBounds(491, 174, 194, 35);
		add(labelGamma);
		
		JLabel labelC = new JLabel("C = 1");
		labelC.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
		labelC.setBounds(491, 113, 194, 35);
		add(labelC);

	}
}
