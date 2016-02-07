package interfaceGrafica;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelInicial extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelInicial() {
		setBackground(Color.WHITE);
		
		setSize(1024, 720);
		setLayout(null);
		
		JPanel panelCabecalho = new JPanel();
		panelCabecalho.setBackground(new Color(0, 153, 204));
		panelCabecalho.setBounds(0, 0, 1024, 42);
		add(panelCabecalho);
		panelCabecalho.setLayout(null);
		
		JLabel labelTituloDoCabecalho = new JLabel("Projeto Pix");
		labelTituloDoCabecalho.setForeground(Color.WHITE);
		labelTituloDoCabecalho.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		labelTituloDoCabecalho.setBounds(10, 11, 273, 27);
		panelCabecalho.add(labelTituloDoCabecalho);
		
		JButton botaoComputacaoGrafica = new JButton("Computação Gráfica");
		botaoComputacaoGrafica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeCliqueDeMouse) {
				
				PanelComputacaoGrafica panelComputacaoGrafica = new PanelComputacaoGrafica();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(panelComputacaoGrafica);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
				
			}
		});
		botaoComputacaoGrafica.setForeground(Color.WHITE);
		botaoComputacaoGrafica.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		botaoComputacaoGrafica.setBackground(new Color(102, 102, 102));
		botaoComputacaoGrafica.setBounds(305, 154, 254, 148);
		add(botaoComputacaoGrafica);
		
		JTextPane textPaneComputacaoGrafica = new JTextPane();
		textPaneComputacaoGrafica.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
		textPaneComputacaoGrafica.setEditable(false);
		textPaneComputacaoGrafica.setForeground(Color.WHITE);
		textPaneComputacaoGrafica.setBackground(new Color(153, 153, 153));
		textPaneComputacaoGrafica.setText("Projetos e Exercícios referente a Computação Gráfica, fazendo parte da primeira unidade do período.");
		textPaneComputacaoGrafica.setBounds(569, 154, 340, 146);
		add(textPaneComputacaoGrafica);
		
		JButton botaoProcessamentoDeImagens = new JButton("Processamento de Imagens");
		botaoProcessamentoDeImagens.setForeground(Color.WHITE);
		botaoProcessamentoDeImagens.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		botaoProcessamentoDeImagens.setBackground(new Color(0, 102, 102));
		botaoProcessamentoDeImagens.setBounds(633, 309, 276, 148);
		add(botaoProcessamentoDeImagens);
		
		JTextPane textPaneProcessamentoDeImagens = new JTextPane();
		textPaneProcessamentoDeImagens.setText("Projetos e Exercícios referente a Processamento de Imagens, fazendo parte da segunda unidade do período.");
		textPaneProcessamentoDeImagens.setForeground(Color.WHITE);
		textPaneProcessamentoDeImagens.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
		textPaneProcessamentoDeImagens.setEditable(false);
		textPaneProcessamentoDeImagens.setBackground(new Color(0, 153, 153));
		textPaneProcessamentoDeImagens.setBounds(305, 311, 318, 146);
		add(textPaneProcessamentoDeImagens);
		
		

	}
}
