package interfaceGrafica;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelReta extends JPanel {
	boolean primeiroClick = true;
	int x1 = 0;
	int y1 = 0;

	int x2 = 0;
	int y2 = 0;

	PainelDoBuffer painelBuffer = new PainelDoBuffer();
	private JTextField textFieldX1;
	private JTextField textFieldY1;
	private JTextField textFieldX2;
	private JTextField textFieldY2;

	public PanelReta() {

		setBackground(Color.WHITE);

		setSize(1024, 720);
		setLayout(null);

		JPanel panelCabecalho = new JPanel();
		panelCabecalho.setBackground(new Color(0, 102, 153));
		panelCabecalho.setBounds(0, 0, 1024, 42);
		add(panelCabecalho);
		panelCabecalho.setLayout(null);

		JLabel labelTituloDoCabecalho = new JLabel("Reta");
		labelTituloDoCabecalho.setForeground(Color.WHITE);
		labelTituloDoCabecalho.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		labelTituloDoCabecalho.setBounds(10, 11, 273, 27);
		panelCabecalho.add(labelTituloDoCabecalho);

		ImageIcon imageIcon = new ImageIcon(PanelComputacaoGrafica.class.getResource("/imagens/iconHomePage.png"));
		int scale = 2; // 2 times smaller
		int width = imageIcon.getIconWidth();
		int newWidth = width / scale;

		add(painelBuffer);
		painelBuffer.setLocation(368, 75);

		painelBuffer.limparTela();
		painelBuffer.desenharRetasPlano();

		textFieldX1 = new JTextField();
		textFieldX1.setForeground(new Color(0, 102, 153));
		textFieldX1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		textFieldX1.setBounds(42, 177, 122, 24);
		add(textFieldX1);
		textFieldX1.setColumns(10);

		textFieldY1 = new JTextField();
		textFieldY1.setForeground(new Color(0, 102, 153));
		textFieldY1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		textFieldY1.setBounds(42, 208, 122, 24);
		add(textFieldY1);
		textFieldY1.setColumns(10);

		textFieldX2 = new JTextField();
		textFieldX2.setForeground(new Color(0, 102, 153));
		textFieldX2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		textFieldX2.setColumns(10);
		textFieldX2.setBounds(42, 301, 122, 24);
		add(textFieldX2);

		textFieldY2 = new JTextField();
		textFieldY2.setForeground(new Color(0, 102, 153));
		textFieldY2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		textFieldY2.setColumns(10);
		textFieldY2.setBounds(42, 330, 122, 24);
		add(textFieldY2);

		JLabel labelX = new JLabel("");
		labelX.setForeground(new Color(0, 102, 153));
		labelX.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		labelX.setBounds(28, 576, 88, 28);
		add(labelX);

		JLabel labelY = new JLabel("");
		labelY.setForeground(new Color(0, 102, 153));
		labelY.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		labelY.setBounds(28, 609, 88, 28);
		add(labelY);

		JLabel labelX1 = new JLabel("X1:");
		labelX1.setForeground(new Color(0, 102, 153));
		labelX1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		labelX1.setBounds(10, 177, 25, 20);
		add(labelX1);

		JLabel labelY1 = new JLabel("Y1:");
		labelY1.setForeground(new Color(0, 102, 153));
		labelY1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		labelY1.setBounds(10, 208, 25, 24);
		add(labelY1);

		JLabel labelX2 = new JLabel("X2:");
		labelX2.setForeground(new Color(0, 102, 153));
		labelX2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		labelX2.setBounds(10, 306, 25, 19);
		add(labelX2);

		JLabel labelY2 = new JLabel("Y2:");
		labelY2.setForeground(new Color(0, 102, 153));
		labelY2.setFont(new Font("Segoe UI Semilight", Font.BOLD, 18));
		labelY2.setBounds(10, 330, 34, 24);
		add(labelY2);

		JButton botaoLimparTela = new JButton("Limpar a tela");
		botaoLimparTela.setBounds(42, 440, 153, 42);
		botaoLimparTela.setForeground(Color.WHITE);
		botaoLimparTela.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		botaoLimparTela.setBackground(new Color(0, 102, 153));
		add(botaoLimparTela);

		JButton botaoPlotarReta = new JButton("Plotar Reta");
		botaoPlotarReta.setBounds(42, 381, 153, 42);
		botaoPlotarReta.setForeground(Color.WHITE);
		botaoPlotarReta.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		botaoPlotarReta.setBackground(new Color(0, 102, 153));
		add(botaoPlotarReta);

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
		botaoPaginaInicial.setIcon(
				new ImageIcon(imageIcon.getImage().getScaledInstance(newWidth, -1, java.awt.Image.SCALE_SMOOTH)));
		botaoPaginaInicial.setOpaque(false);
		botaoPaginaInicial.setContentAreaFilled(false);
		botaoPaginaInicial.setBorderPainted(true);
		
		JPanel panelPlotarReta = new JPanel();
		panelPlotarReta.setLayout(null);
		panelPlotarReta.setBackground(new Color(0, 102, 153));
		panelPlotarReta.setBounds(0, 75, 308, 42);
		add(panelPlotarReta);
		
		JLabel labelPlotarReta = new JLabel("Plotar Pixel");
		labelPlotarReta.setForeground(Color.WHITE);
		labelPlotarReta.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		labelPlotarReta.setBounds(10, 11, 273, 27);
		panelPlotarReta.add(labelPlotarReta);
		
		JLabel labelPixelInicial = new JLabel("Pixel Inicial");
		labelPixelInicial.setForeground(new Color(0, 102, 153));
		labelPixelInicial.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		labelPixelInicial.setBounds(10, 140, 171, 28);
		add(labelPixelInicial);
		
		JLabel labelPixelFinal = new JLabel("Pixel Final");
		labelPixelFinal.setForeground(new Color(0, 102, 153));
		labelPixelFinal.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		labelPixelFinal.setBounds(10, 262, 171, 28);
		add(labelPixelFinal);
		
		JPanel panelCoordenadas = new JPanel();
		panelCoordenadas.setLayout(null);
		panelCoordenadas.setBackground(new Color(0, 102, 153));
		panelCoordenadas.setBounds(0, 523, 308, 42);
		add(panelCoordenadas);
		
		JLabel labelCoordenadas = new JLabel("Coordenadas");
		labelCoordenadas.setForeground(Color.WHITE);
		labelCoordenadas.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		labelCoordenadas.setBounds(10, 11, 273, 27);
		panelCoordenadas.add(labelCoordenadas);
		
		JLabel labelCoordenadaX = new JLabel("X:");
		labelCoordenadaX.setForeground(new Color(0, 102, 153));
		labelCoordenadaX.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		labelCoordenadaX.setBounds(10, 576, 25, 28);
		add(labelCoordenadaX);
		
		JLabel labelCoordenadaY = new JLabel("Y:");
		labelCoordenadaY.setForeground(new Color(0, 102, 153));
		labelCoordenadaY.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		labelCoordenadaY.setBounds(10, 609, 25, 28);
		add(labelCoordenadaY);

		// evento para colocar todos os pixeis brancos

		botaoLimparTela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				painelBuffer.limparTela();
				painelBuffer.desenharRetasPlano();
				textFieldX1.setText("");
				textFieldY1.setText("");
				textFieldX2.setText("");
				textFieldY2.setText("");

				

			}
		});

		// Evento quando o mouse move, para pegar as coordenadas

		painelBuffer.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent arg0) {

				int x = arg0.getX() - 300;
				int y = 300 - arg0.getY();

				labelX.setText(Integer.toString(x));
				labelY.setText(Integer.toString(y));

			}

		});


		botaoPlotarReta.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {

				try {
					painelBuffer.plotarRetaDDA(Integer.parseInt(textFieldX1.getText()),
							Integer.parseInt(textFieldY1.getText()), Integer.parseInt(textFieldX2.getText()),
							Integer.parseInt(textFieldY2.getText()));
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Ocorreu um erro!");
				}
			}

		});

		botaoPlotarReta.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {

				try {
					painelBuffer.plotarRetaDDA(Integer.parseInt(textFieldX1.getText()),
							Integer.parseInt(textFieldY1.getText()), Integer.parseInt(textFieldX2.getText()),
							Integer.parseInt(textFieldY2.getText()));
					// painelBuffer.desenharRetasPlano();
					// painelBuffer.repaint();
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Ocorreu um erro!");
				}
			}

		});
	}

}
