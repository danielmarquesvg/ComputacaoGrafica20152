package interfaceGrafica;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.ScrollPaneConstants;
import javax.swing.BoxLayout;
import javax.swing.JTextField;

import funcoes.Funcoes;


public class PanelTabelaDeCores extends JPanel {
	
	private JTextField textFieldBitsDeProfundidade;


	/**
	 * Create the panel.
	 */
	public PanelTabelaDeCores() {
		
		setBackground(Color.WHITE);
		
		setSize(1024, 720);
		setLayout(null);
		
		
		JPanel panelCabecalho = new JPanel();
		panelCabecalho.setBounds(0, 0, 1024, 42);
		panelCabecalho.setBackground(new Color(0, 102, 51));
		add(panelCabecalho);
		panelCabecalho.setLayout(null);
		
		JLabel labelTituloDoCabecalho = new JLabel("Tabela de Cores");
		labelTituloDoCabecalho.setForeground(Color.WHITE);
		labelTituloDoCabecalho.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		labelTituloDoCabecalho.setBounds(10, 11, 273, 27);
		panelCabecalho.add(labelTituloDoCabecalho);
		
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
		
		JPanel panelCor = new JPanel();
		panelCor.setBackground(new Color(0, 153, 102));
		panelCor.setBounds(319, 100, 171, 35);
		panelCor.setBorder(new LineBorder(new Color(0, 0, 0)));
		add(panelCor);
		panelCor.setLayout(null);
		
		JLabel labelCor = new JLabel("Cor");
		labelCor.setForeground(Color.WHITE);
		labelCor.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		labelCor.setBounds(75, 5, 34, 24);
		panelCor.add(labelCor);
		
		JPanel panelValorRGB = new JPanel();
		panelValorRGB.setBackground(new Color(0, 153, 102));
		panelValorRGB.setBounds(492, 100, 266, 35);
		panelValorRGB.setLayout(null);
		panelValorRGB.setBorder(new LineBorder(new Color(0, 0, 0)));
		add(panelValorRGB);
		
		JLabel labelValorRGB = new JLabel("Valor em RGB");
		labelValorRGB.setForeground(Color.WHITE);
		labelValorRGB.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		labelValorRGB.setBounds(85, 5, 100, 24);
		panelValorRGB.add(labelValorRGB);
		
		JPanel panelValorHexadecimal = new JPanel();
		panelValorHexadecimal.setBackground(new Color(0, 153, 102));
		panelValorHexadecimal.setBounds(760, 100, 204, 35);
		panelValorHexadecimal.setLayout(null);
		panelValorHexadecimal.setBorder(new LineBorder(new Color(0, 0, 0)));
		add(panelValorHexadecimal);
		
		JLabel labelValorHexadecimal = new JLabel("Valor em Hexadecimal");
		labelValorHexadecimal.setForeground(Color.WHITE);
		labelValorHexadecimal.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		labelValorHexadecimal.setBounds(40, 5, 154, 24);
		panelValorHexadecimal.add(labelValorHexadecimal);
		
		JPanel panelProfundidadeDaCor = new JPanel();
		panelProfundidadeDaCor.setBounds(0, 100, 271, 35);
		panelProfundidadeDaCor.setBackground(new Color(0, 153, 102));
		add(panelProfundidadeDaCor);
		panelProfundidadeDaCor.setLayout(null);
		
		JLabel labelBitsDeProfundidade = new JLabel("Bits de Profundidade da Imagem");
		labelBitsDeProfundidade.setForeground(Color.WHITE);
		labelBitsDeProfundidade.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		labelBitsDeProfundidade.setBounds(10, 0, 251, 35);
		panelProfundidadeDaCor.add(labelBitsDeProfundidade);
		
		textFieldBitsDeProfundidade = new JTextField();
		textFieldBitsDeProfundidade.setText("4");
		textFieldBitsDeProfundidade.setFont(new Font("Segoe UI Semibold", Font.BOLD, 96));
		textFieldBitsDeProfundidade.setForeground(new Color(0, 153, 0));
		textFieldBitsDeProfundidade.setBounds(0, 135, 271, 139);
		add(textFieldBitsDeProfundidade);
		textFieldBitsDeProfundidade.setColumns(10);
		
		
		JPanel panelDoScrollPane = new JPanel();
		panelDoScrollPane.setSize(200, 300);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBounds(319, 137, 663, 434);
		scrollPane.setViewportView(panelDoScrollPane);
		panelDoScrollPane.setLayout(new BoxLayout(panelDoScrollPane, BoxLayout.PAGE_AXIS));
		add(scrollPane);
		
		
		JButton buttonCriarTabelaDeCores = new JButton("Criar Tabela de Cores");
		buttonCriarTabelaDeCores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeCliqueDeMouse) {

				int [] arrayRGB = Funcoes.criarArrayDeCoresRGB(Integer.parseInt(textFieldBitsDeProfundidade.getText()));
				String [] arrayAuxiliar = Funcoes.criarArrayAuxiliarDeCoresRGB(arrayRGB);
				
				panelDoScrollPane.removeAll();
				panelDoScrollPane.revalidate();
				panelDoScrollPane.repaint();
				
				for(int red = 0; red < arrayRGB.length; red++){
					for(int green = 0; green < arrayRGB.length; green++){
						for(int blue = 0; blue < arrayRGB.length; blue++){
							
							JPanel panelComponente = new JPanel();
							panelComponente.setBounds(146, 135, 663, 35);
							panelDoScrollPane.add(panelComponente);
							panelComponente.setLayout(new BoxLayout(panelComponente, BoxLayout.LINE_AXIS));
							//panel.setLayout(null);
							
							JPanel panelCorList = new JPanel();
							//panel_1.setLayout(null);
							panelCorList.setBorder(new LineBorder(new Color(arrayRGB[red], arrayRGB[green], arrayRGB[blue])));
							panelCorList.setBackground(new Color(arrayRGB[red], arrayRGB[green], arrayRGB[blue]));
							panelCorList.setBounds(0, 0, 219, 35);
							panelComponente.add(panelCorList);
							
							JLabel labelCorList = new JLabel("Cor");
							labelCorList.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
							labelCorList.setBounds(90, 5, 34, 24);
							
							if((arrayRGB[red] + arrayRGB[green] + arrayRGB[blue] / 3) > (255 / 2)){
								labelCorList.setForeground(new Color(0,0,0));
							} else {
								labelCorList.setForeground(new Color(255,255,255));
							}
							panelCorList.add(labelCorList);
							
							JPanel panelValorRGBList = new JPanel();
							//panel_2.setLayout(null);
							panelValorRGBList.setBorder(new LineBorder(new Color(arrayRGB[red], arrayRGB[green], arrayRGB[blue])));
							panelValorRGBList.setBackground(new Color(arrayRGB[red], arrayRGB[green], arrayRGB[blue]));
							panelValorRGBList.setBounds(222, 0, 219, 35);
							panelComponente.add(panelValorRGBList);
							
							JLabel labelValorRGBList = new JLabel(arrayAuxiliar[red]+"  -  "+arrayAuxiliar[green]+"  -  "+arrayAuxiliar[blue]);
							labelValorRGBList.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
							labelValorRGBList.setBounds(70, 5, 100, 24);
							if((arrayRGB[red] + arrayRGB[green] + arrayRGB[blue] / 3) > (255 / 2)){
								labelValorRGBList.setForeground(new Color(0,0,0));
							} else {
								labelValorRGBList.setForeground(new Color(255,255,255));
							}
							panelValorRGBList.add(labelValorRGBList);
							
							JPanel panelValorHexadecimalList = new JPanel();
							//panel_3.setLayout(null);
							panelValorHexadecimalList.setBorder(new LineBorder(new Color(arrayRGB[red], arrayRGB[green], arrayRGB[blue])));
							panelValorHexadecimalList.setBackground(new Color(arrayRGB[red], arrayRGB[green], arrayRGB[blue]));
							panelValorHexadecimalList.setBounds(444, 0, 219, 35);
							panelComponente.add(panelValorHexadecimalList);
							
							JLabel labelValorHexadecimalList = new JLabel(Funcoes.rgbParaHexadecimal(arrayRGB[red], arrayRGB[green], arrayRGB[blue]));
							labelValorHexadecimalList.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
							labelValorHexadecimalList.setBounds(40, 5, 154, 24);
							
							if((arrayRGB[red] + arrayRGB[green] + arrayRGB[blue] / 3) > (255 / 2)){
								labelValorHexadecimalList.setForeground(new Color(0,0,0));
							} else {
								labelValorHexadecimalList.setForeground(new Color(255,255,255));
							}
							panelValorHexadecimalList.add(labelValorHexadecimalList);
							
						}
						
					}
				}
				
				panelDoScrollPane.revalidate();
				
				scrollPane.getViewport().revalidate();
				scrollPane.getViewport().repaint();
				scrollPane.repaint();
				
			
			}
		});
		buttonCriarTabelaDeCores.setForeground(Color.WHITE);
		buttonCriarTabelaDeCores.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		buttonCriarTabelaDeCores.setBackground(new Color(0, 102, 51));
		buttonCriarTabelaDeCores.setBounds(55, 285, 220, 42);
		add(buttonCriarTabelaDeCores);
	

		
	}
}
