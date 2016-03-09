package interfaceGrafica;

import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.JLabel;
import javax.swing.JTextField;

import algoritmos.Circunferencia;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PainelCircunferencia extends JPanel {
	
	PainelDoBuffer painelBuffer = new PainelDoBuffer();
	private JTextField textFieldRaioDaCircunferencia;
	/**
	 * Create the panel.
	 */
	public PainelCircunferencia() {
		
		setBackground(Color.WHITE);
		
		setSize(1024, 720);
		setLayout(null);
		
		JPanel panelCabecalho = new JPanel();
		panelCabecalho.setBackground(new Color(0, 102, 204));
		panelCabecalho.setBounds(0, 0, 1024, 42);
		add(panelCabecalho);
		panelCabecalho.setLayout(null);
		
		JLabel labelTituloDoCabecalho = new JLabel("Circunferência");
		labelTituloDoCabecalho.setForeground(Color.WHITE);
		labelTituloDoCabecalho.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		labelTituloDoCabecalho.setBounds(10, 11, 273, 27);
		panelCabecalho.add(labelTituloDoCabecalho);
		
		add(painelBuffer);
		painelBuffer.setLocation(361, 73);
		
		painelBuffer.limparTela();
		painelBuffer.desenharRetasPlano();
			
		JPanel panelProfundidadeDaCor = new JPanel();
		panelProfundidadeDaCor.setBounds(0, 73, 271, 35);
		panelProfundidadeDaCor.setBackground(new Color(0, 102, 204));
		add(panelProfundidadeDaCor);
		panelProfundidadeDaCor.setLayout(null);
		
		JLabel labelRaioDaCircunferencia = new JLabel("Raio da Circunferência");
		labelRaioDaCircunferencia.setForeground(Color.WHITE);
		labelRaioDaCircunferencia.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		labelRaioDaCircunferencia.setBounds(10, 0, 251, 35);
		panelProfundidadeDaCor.add(labelRaioDaCircunferencia);
		
		textFieldRaioDaCircunferencia = new JTextField();
		textFieldRaioDaCircunferencia.setText("50");
		textFieldRaioDaCircunferencia.setFont(new Font("Segoe UI Semibold", Font.BOLD, 96));
		textFieldRaioDaCircunferencia.setForeground(new Color(0, 102, 204));
		textFieldRaioDaCircunferencia.setBounds(0, 108, 271, 139);
		add(textFieldRaioDaCircunferencia);
		textFieldRaioDaCircunferencia.setColumns(10);
		
		JButton botaoPlotarCircunferencia = new JButton("Plotar Circunferência");
		botaoPlotarCircunferencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Circunferencia circunferencia = new Circunferencia();
				circunferencia.algoritmoDoPontoMedioParaCircunferencia(painelBuffer.buffer, Integer.parseInt(textFieldRaioDaCircunferencia.getText()), Color.BLUE.getRGB());
				validate();
				repaint();
	
			}
		});
		botaoPlotarCircunferencia.setBounds(40, 275, 231, 44);
		botaoPlotarCircunferencia.setForeground(Color.WHITE);
		botaoPlotarCircunferencia.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		botaoPlotarCircunferencia.setBackground(new Color(0, 102, 204));
		add(botaoPlotarCircunferencia);
		
		JButton botaoLimparTela = new JButton("Limpar Tela");
		botaoLimparTela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeCliqueDeMouse) {
				painelBuffer.limparTela();
			}
		});
		botaoLimparTela.setForeground(Color.WHITE);
		botaoLimparTela.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		botaoLimparTela.setBackground(new Color(0, 102, 204));
		botaoLimparTela.setBounds(40, 340, 231, 44);
		add(botaoLimparTela);

	}
}
