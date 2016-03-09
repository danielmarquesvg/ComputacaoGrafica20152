package interfaceGrafica;

import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PainelCircunferencia extends JPanel {
	
	PainelDoBuffer painelBuffer = new PainelDoBuffer();
	private JTextField textFieldX1;
	private JTextField textFieldY1;
	private JTextField textFieldX2;
	private JTextField textFieldY2;
	/**
	 * Create the panel.
	 */
	public PainelCircunferencia() {
		
		setBackground(Color.WHITE);
		
		setSize(1024, 720);
		setLayout(null);
		
		add(painelBuffer);
		painelBuffer.setLocation(361, 73);
		
		painelBuffer.limparTela();
		painelBuffer.desenharRetasPlano();
			
		JButton botaoPlotarCircun = new JButton("Plotar Circun.");
		
		botaoPlotarCircun.setBounds(32, 569, 145, 44);
		botaoPlotarCircun.setForeground(Color.WHITE);
		botaoPlotarCircun.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		botaoPlotarCircun.setBackground(new Color(0, 102, 102));
		add(botaoPlotarCircun);
		
		JLabel labelPixelInicial = new JLabel("Pixel Inicial");
		labelPixelInicial.setForeground(new Color(0, 102, 153));
		labelPixelInicial.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		labelPixelInicial.setBounds(32, 286, 171, 28);
		add(labelPixelInicial);
		
		textFieldX1 = new JTextField();
		textFieldX1.setForeground(new Color(0, 102, 153));
		textFieldX1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		textFieldX1.setColumns(10);
		textFieldX1.setBounds(64, 323, 122, 24);
		add(textFieldX1);
		
		JLabel labelX1 = new JLabel("X1:");
		labelX1.setForeground(new Color(0, 102, 153));
		labelX1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		labelX1.setBounds(32, 323, 25, 20);
		add(labelX1);
		
		JLabel labelY1 = new JLabel("Y1:");
		labelY1.setForeground(new Color(0, 102, 153));
		labelY1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		labelY1.setBounds(32, 354, 25, 24);
		add(labelY1);
		
		textFieldY1 = new JTextField();
		textFieldY1.setForeground(new Color(0, 102, 153));
		textFieldY1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		textFieldY1.setColumns(10);
		textFieldY1.setBounds(64, 354, 122, 24);
		add(textFieldY1);
		
		JLabel labelPixelFinal = new JLabel("Pixel Final");
		labelPixelFinal.setForeground(new Color(0, 102, 153));
		labelPixelFinal.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		labelPixelFinal.setBounds(32, 408, 171, 28);
		add(labelPixelFinal);
		
		JLabel labelX2 = new JLabel("X2:");
		labelX2.setForeground(new Color(0, 102, 153));
		labelX2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		labelX2.setBounds(32, 452, 25, 19);
		add(labelX2);
		
		textFieldX2 = new JTextField();
		textFieldX2.setForeground(new Color(0, 102, 153));
		textFieldX2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		textFieldX2.setColumns(10);
		textFieldX2.setBounds(64, 447, 122, 24);
		add(textFieldX2);
		
		JLabel labelY2 = new JLabel("Y2:");
		labelY2.setForeground(new Color(0, 102, 153));
		labelY2.setFont(new Font("Segoe UI Semilight", Font.BOLD, 18));
		labelY2.setBounds(32, 476, 34, 24);
		add(labelY2);
		
		textFieldY2 = new JTextField();
		textFieldY2.setForeground(new Color(0, 102, 153));
		textFieldY2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		textFieldY2.setColumns(10);
		textFieldY2.setBounds(64, 476, 122, 24);
		add(textFieldY2);
		
		
		botaoPlotarCircun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Ação");
				painelBuffer.plotarCircunferencia(Integer.parseInt(textFieldX1.getText()), Integer.parseInt(textFieldY1.getText()), 
						Integer.parseInt(textFieldX2.getText()), Integer.parseInt(textFieldY2.getText()));
				
				
			}
		});

	}
}
