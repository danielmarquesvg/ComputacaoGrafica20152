package interfaceGrafica;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelNormalizacao extends JPanel {

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
		
	}

}
