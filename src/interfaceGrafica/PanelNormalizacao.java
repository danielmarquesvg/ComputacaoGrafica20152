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
		painelBuffer.setLocation(30, 50);
		
		painelBuffer.limparTela();
		painelBuffer.desenharRetasPlano();
		
		//a partir daqui esta as alteraçoes da RETA by @Kawe
				
		
		JLabel labelResulNDCX = new JLabel("0");
		labelResulNDCX.setBounds(750, 50, 72, 43);
		add(labelResulNDCX);
		
		JLabel labelResulNDCY = new JLabel("0");
		labelResulNDCY.setBounds(750, 106, 72, 49);
		add(labelResulNDCY);
		
		JLabel labelResulDCX = new JLabel("0");
		labelResulDCX.setBounds(750, 166, 72, 49);
		add(labelResulDCX);
		
		JLabel labelResulDCY = new JLabel("0");
		labelResulDCY.setBounds(750, 226, 72, 49);
		add(labelResulDCY);
		
		textFieldX1 = new JTextField();
		textFieldX1.setBounds(670, 388, 72, 20);
		add(textFieldX1);
		textFieldX1.setColumns(10);
		
		textFieldY1 = new JTextField();
		textFieldY1.setBounds(670, 419, 72, 20);
		add(textFieldY1);
		textFieldY1.setColumns(10);
		
		/*
		textFieldX2 = new JTextField();
		textFieldX2.setColumns(10);
		textFieldX2.setBounds(780, 388, 72, 20);
		add(textFieldX2);
		
		textFieldY2 = new JTextField();
		textFieldY2.setColumns(10);
		textFieldY2.setBounds(780, 419, 72, 20);
		add(textFieldY2);
		*/
		
		JLabel labelX = new JLabel("");
		labelX.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelX.setBounds(68, 650, 34, 28);
		add(labelX);
		
		JLabel labelDoXY = new JLabel("X,Y:");
		labelDoXY.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelDoXY.setBounds(40, 650, 25, 28);
		add(labelDoXY);
		
		JLabel labelY = new JLabel("");
		labelY.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelY.setBounds(100, 650, 34, 28);
		add(labelY);
		
		JLabel labelX1 = new JLabel("X1:");
		labelX1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelX1.setBounds(640, 391, 25, 14);
		add(labelX1);
		
		JLabel labelY1 = new JLabel("Y1:");
		labelY1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelY1.setBounds(640, 422, 25, 14);
		add(labelY1);
		
		
		/*
		 JLabel lblX = new JLabel("X2:");
		lblX.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblX.setBounds(750, 391, 25, 14);
		add(lblX);
		
		JLabel lblY_1 = new JLabel("Y2:");
		lblY_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblY_1.setBounds(750, 422, 25, 14);
		add(lblY_1);
		*/
		
		
		JLabel labelNDCX = new JLabel("NDCX:");
		labelNDCX.setBounds(700, 63, 46, 14);
		add(labelNDCX);
		
		JLabel labelNDCY = new JLabel("NDCY:");
		labelNDCY.setBounds(700, 123, 46, 14);
		add(labelNDCY);
		
		JLabel labelDCX = new JLabel("DCX:");
		labelDCX.setBounds(700, 183, 46, 14);
		add(labelDCX);
		
		JLabel labelDCY = new JLabel("DCY:");
		labelDCY.setBounds(700, 243, 46, 14);
		add(labelDCY);
		
		

		JButton botaoPlotarPixel = new JButton("Plotar");
		botaoPlotarPixel.setBounds(650, 465, 89, 23);
		add(botaoPlotarPixel);
		
		JButton btnLimparTela = new JButton("Limpar");
		btnLimparTela.setBounds(650, 499, 89, 23);
		add(btnLimparTela);
		
		//763
		/*JButton botaoPlotarReta = new JButton("Reta");
		botaoPlotarReta.setBounds(650, 465, 89, 23);
		add(botaoPlotarReta);*/
		
		JRadioButton botaoMouse = new JRadioButton("Mouse",false);
		botaoMouse.setBounds(160, 650, 109, 23);
		add(botaoMouse);
		/**************/
		
		
		
		
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
		
		btnLimparTela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				
				painelBuffer.limparTela();
				painelBuffer.desenharRetasPlano();
				textFieldX1.setText("");
				textFieldY1.setText("");
				//textFieldX2.setText("");
				//textFieldY2.setText("");
				
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
				
				labelX.setText(Integer.toString(x));
				labelY.setText(Integer.toString(y));
				
				DecimalFormat oi = new DecimalFormat("0.000000");
				
				labelResulNDCX.setText(	oi.format(user_to_NDCX(x)));
				labelResulNDCY.setText( oi.format(user_to_NDCY(y)));
				
				labelResulDCX.setText( Integer.toString((NDC_TO_DCX(user_to_NDCX(x)))));
				labelResulDCY.setText( Integer.toString((NDC_TO_DCY(user_to_NDCY(y)))));
						
				//System.out.printf("%.6f%n",user_to_NDCX(x));
				//System.out.printf("%.6f%n",user_to_NDCY(y));
				
				//System.out.println(x+" "+ y);
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
		
		double result = (x-0) / (600-0);
		
		//System.out.printf("%.6f%n",result);	
		return result;	
	}
	
	public double user_to_NDCY (double y){
		
		
		return (y-0) / (600-0);	
	}
	
	public int NDC_TO_DCX(double NDCX){
		
		return 	(int) Math.round(NDCX*599);	
	}
	
	public int NDC_TO_DCY(double NDCY){
		
		return (int) Math.round(NDCY*599);	
	}

}
