package interfaceGrafica;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class PanelNormalizacao extends JPanel {

	PainelDoBuffer painelBuffer = new PainelDoBuffer();
	private JTextField textFieldX1;
	private JTextField textFieldY1;
	//private JTextField textFieldX2;
	//private JTextField textFieldY2;
	
	/**
	 * Create the panel.
	 */
	public PanelNormalizacao() {
		
		setBackground(Color.WHITE);
		
		setSize(1024, 720);
		setLayout(null);
		
		JPanel panelCabecalho = new JPanel();
		panelCabecalho.setBackground(new Color(0, 102, 102));
		panelCabecalho.setBounds(0, 0, 1024, 42);
		add(panelCabecalho);
		panelCabecalho.setLayout(null);
		
		JLabel labelTituloDoCabecalho = new JLabel("Normalização");
		labelTituloDoCabecalho.setForeground(Color.WHITE);
		labelTituloDoCabecalho.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		labelTituloDoCabecalho.setBounds(10, 11, 273, 27);
		panelCabecalho.add(labelTituloDoCabecalho);
		
		ImageIcon imageIcon = new ImageIcon(PanelComputacaoGrafica.class.getResource("/imagens/iconHomePage.png"));
		int scale = 2; // 2 times smaller
		int width = imageIcon.getIconWidth();
		int newWidth = width / scale;
		
		
		/*************/
		add(painelBuffer);
		painelBuffer.setLocation(361, 73);
		
		painelBuffer.limparTela();
		painelBuffer.desenharRetasPlano();
		
		//a partir daqui esta as alteraçoes da RETA by @Kawe
				
		
		JLabel labelResulNDCX = new JLabel("0");
		labelResulNDCX.setForeground(new Color(0, 102, 102));
		labelResulNDCX.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		labelResulNDCX.setBounds(80, 236, 81, 28);
		add(labelResulNDCX);
		
		JLabel labelResulNDCY = new JLabel("0");
		labelResulNDCY.setForeground(new Color(0, 102, 102));
		labelResulNDCY.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		labelResulNDCY.setBounds(80, 265, 81, 28);
		add(labelResulNDCY);
		
		JLabel labelResulDCX = new JLabel("0");
		labelResulDCX.setForeground(new Color(0, 102, 102));
		labelResulDCX.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		labelResulDCX.setBounds(67, 357, 72, 28);
		add(labelResulDCX);
		
		JLabel labelResulDCY = new JLabel("0");
		labelResulDCY.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		labelResulDCY.setForeground(new Color(0, 102, 102));
		labelResulDCY.setBounds(67, 381, 72, 28);
		add(labelResulDCY);
		
		textFieldX1 = new JTextField();
		textFieldX1.setForeground(new Color(0, 102, 102));
		textFieldX1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		textFieldX1.setBounds(32, 481, 107, 28);
		add(textFieldX1);
		textFieldX1.setColumns(10);
		
		textFieldY1 = new JTextField();
		textFieldY1.setForeground(new Color(0, 102, 102));
		textFieldY1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		textFieldY1.setBounds(32, 520, 107, 28);
		add(textFieldY1);
		textFieldY1.setColumns(10);
		
		JLabel labelValorX = new JLabel("");
		labelValorX.setForeground(new Color(0, 102, 102));
		labelValorX.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		labelValorX.setBounds(37, 117, 61, 28);
		add(labelValorX);
		
		JLabel labelX = new JLabel("X:");
		labelX.setForeground(new Color(0, 102, 102));
		labelX.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		labelX.setBounds(10, 117, 25, 28);
		add(labelX);
		
		JLabel labelValorY = new JLabel("");
		labelValorY.setForeground(new Color(0, 102, 102));
		labelValorY.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		labelValorY.setBounds(37, 144, 61, 28);
		add(labelValorY);
		
		JLabel labelPlotarX = new JLabel("X:");
		labelPlotarX.setForeground(new Color(0, 102, 102));
		labelPlotarX.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		labelPlotarX.setBounds(14, 481, 25, 28);
		add(labelPlotarX);
		
		JLabel labelPlotarY = new JLabel("Y:");
		labelPlotarY.setForeground(new Color(0, 102, 102));
		labelPlotarY.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		labelPlotarY.setBounds(10, 520, 19, 28);
		add(labelPlotarY);

		JLabel labelNDCX = new JLabel("NDCX:");
		labelNDCX.setForeground(new Color(0, 102, 102));
		labelNDCX.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		labelNDCX.setBounds(10, 240, 61, 21);
		add(labelNDCX);
		
		JLabel labelNDCY = new JLabel("NDCY:");
		labelNDCY.setForeground(new Color(0, 102, 102));
		labelNDCY.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		labelNDCY.setBounds(10, 265, 52, 28);
		add(labelNDCY);
		
		JLabel labelDCX = new JLabel("DCX:");
		labelDCX.setForeground(new Color(0, 102, 102));
		labelDCX.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		labelDCX.setBounds(10, 361, 46, 21);
		add(labelDCX);
		
		JLabel labelDCY = new JLabel("DCY:");
		labelDCY.setForeground(new Color(0, 102, 102));
		labelDCY.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		labelDCY.setBounds(11, 381, 46, 28);
		add(labelDCY);

		JButton botaoPlotarPixel = new JButton("Plotar Pixel");
		botaoPlotarPixel.setBounds(32, 569, 145, 44);
		botaoPlotarPixel.setForeground(Color.WHITE);
		botaoPlotarPixel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		botaoPlotarPixel.setBackground(new Color(0, 102, 102));
		add(botaoPlotarPixel);
		
		JButton btnLimparTela = new JButton("Limpar a tela");
		btnLimparTela.setForeground(Color.WHITE);
		btnLimparTela.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		btnLimparTela.setBackground(new Color(0, 102, 102));
		btnLimparTela.setBounds(32, 624, 145, 44);
		add(btnLimparTela);
		
		JRadioButton botaoMouse = new JRadioButton("Mouse",false);
		botaoMouse.setBounds(-462, 650, 109, 23);
		add(botaoMouse);


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
		
		JPanel panelCoordenadasDoMundo = new JPanel();
		panelCoordenadasDoMundo.setBackground(new Color(0, 102, 102));
		panelCoordenadasDoMundo.setBounds(0, 73, 308, 42);
		add(panelCoordenadasDoMundo);
		panelCoordenadasDoMundo.setLayout(null);
		
		JLabel labelCoordenadasDoMundo = new JLabel("Coordenadas do Mundo");
		labelCoordenadasDoMundo.setForeground(Color.WHITE);
		labelCoordenadasDoMundo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		labelCoordenadasDoMundo.setBounds(10, 11, 273, 27);
		panelCoordenadasDoMundo.add(labelCoordenadasDoMundo);
		
		JLabel labelY = new JLabel("Y:");
		labelY.setForeground(new Color(0, 102, 102));
		labelY.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		labelY.setBounds(10, 144, 25, 28);
		add(labelY);
		
		JPanel panelNormalizacaoDoDispositivo = new JPanel();
		panelNormalizacaoDoDispositivo.setLayout(null);
		panelNormalizacaoDoDispositivo.setBackground(new Color(0, 102, 102));
		panelNormalizacaoDoDispositivo.setBounds(0, 194, 308, 42);
		add(panelNormalizacaoDoDispositivo);
		
		JLabel labelNormalizacaoDoDispositivo = new JLabel("Normalização do Dispositivo");
		labelNormalizacaoDoDispositivo.setForeground(Color.WHITE);
		labelNormalizacaoDoDispositivo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		labelNormalizacaoDoDispositivo.setBounds(10, 11, 273, 27);
		panelNormalizacaoDoDispositivo.add(labelNormalizacaoDoDispositivo);
		
		JPanel panelCoordenadasDoDispositivo = new JPanel();
		panelCoordenadasDoDispositivo.setLayout(null);
		panelCoordenadasDoDispositivo.setBackground(new Color(0, 102, 102));
		panelCoordenadasDoDispositivo.setBounds(0, 314, 308, 42);
		add(panelCoordenadasDoDispositivo);
		
		JLabel labelCoordenadaDoDispositivo = new JLabel("Coordenada do Dipositivo");
		labelCoordenadaDoDispositivo.setForeground(Color.WHITE);
		labelCoordenadaDoDispositivo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		labelCoordenadaDoDispositivo.setBounds(10, 11, 273, 27);
		panelCoordenadasDoDispositivo.add(labelCoordenadaDoDispositivo);
		
		JPanel panelPlotarPixel = new JPanel();
		panelPlotarPixel.setLayout(null);
		panelPlotarPixel.setBackground(new Color(0, 102, 102));
		panelPlotarPixel.setBounds(0, 434, 308, 42);
		add(panelPlotarPixel);
		
		JLabel labelPlotarPixel = new JLabel("Plotar Pixel");
		labelPlotarPixel.setForeground(Color.WHITE);
		labelPlotarPixel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		labelPlotarPixel.setBounds(10, 11, 273, 27);
		panelPlotarPixel.add(labelPlotarPixel);
		
		btnLimparTela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				
				painelBuffer.limparTela();
				painelBuffer.desenharRetasPlano();
				textFieldX1.setText("");
				textFieldY1.setText("");
				
				labelResulNDCX.setText("");
				labelResulNDCY.setText("");
				labelResulDCX.setText("");
				labelResulDCY.setText("");
					
			}
		});
		
		painelBuffer.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent arg0) {
				
				int x = arg0.getX()-300;
				int y = 300-arg0.getY();
				
				labelValorX.setText(Integer.toString(x));
				labelValorY.setText(Integer.toString(y));
				
				DecimalFormat oi = new DecimalFormat("0.000000");
				
				labelResulNDCX.setText(	oi.format(user_to_NDCX(x)));
				labelResulNDCY.setText( oi.format(user_to_NDCY(y)));

				labelResulDCX.setText( Integer.toString((NDC_TO_DCX(user_to_NDCX(x)))));
				labelResulDCY.setText( Integer.toString((NDC_TO_DCY(user_to_NDCX(y)))));
			}
			
		});
		
		botaoPlotarPixel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try{
				
					painelBuffer.setXX(Integer.parseInt(textFieldX1.getText()));
					painelBuffer.setYY(Integer.parseInt(textFieldY1.getText()));
					painelBuffer.plotarPixel();
				
					
				}catch(Exception e){
					
					JOptionPane.showMessageDialog(null, "Digite um número válido: X: 0 a 600 e Y: 0 a 600");
				}
						
			}
		});
		
		//Metodo que plota um pixel quando clica no buffer
		
				botaoMouse.addItemListener(new ItemListener() {
					public void itemStateChanged(ItemEvent arg0) {
						
						//De plotar pixel
							painelBuffer.addMouseListener(new MouseAdapter() {
								@Override
								public void mouseClicked(MouseEvent arg0) {
							
									if(botaoMouse.isSelected()==true){
										
										int x = arg0.getX();
										int y = arg0.getY();
							
										painelBuffer.setXX(x);
										painelBuffer.setYY(y);
										painelBuffer.plotarPixel();
	
									}	
								}
							});	
					}
				});
	}
	
	public double user_to_NDCX (double x){
		
		double result = (x-(-300)) / (300-(-300));
		
		return result;	
	}
	
	public double user_to_NDCY (double y){
		
		
		return (y-(-300)) / (300-(-300));	
	}
	
	public int NDC_TO_DCX(double NDCX){
		
		return 	(int) Math.round(NDCX*599);	
	}
	
	public int NDC_TO_DCY(double NDCY){
		
		return (int) Math.round(NDCY*599);	
	}
}
