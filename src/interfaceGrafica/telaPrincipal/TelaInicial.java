package interfaceGrafica.telaPrincipal;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;


public class TelaInicial extends JFrame {

	public static JPanel contentPane;
	PanelInicial panelInicial = new PanelInicial();
	static TelaInicial frame = new TelaInicial();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1024, 720);
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		panelInicial.setBounds(0, 0, 1024, 682);
		contentPane.add(panelInicial);
		setVisible(true);
	}
}
