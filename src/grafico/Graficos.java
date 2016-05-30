package grafico;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class Graficos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Graficos frame = new Graficos();
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
	public Graficos() {
		super("GRÁFICOS!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(69, 44, 751, 469);
		contentPane.add(panel);
		
		JButton botaoPizza = new JButton("Pizza");
		botaoPizza.setForeground(new Color(0, 0, 0));
		botaoPizza.setBackground(new Color(0, 153, 102));
		botaoPizza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				/*DefaultPieDataset dpd = new DefaultPieDataset();
				dpd.setValue("Provedor A ",25);
				dpd.setValue("Provedor B ",42.5);
				dpd.setValue("Provedor C ",17.5);
				dpd.setValue("Provedor D ",15);
				
				JFreeChart grafico = ChartFactory.createPieChart("GRÁFICO EM PIZZA",dpd,true,true,false);
				
				ChartPanel chartPanel = new ChartPanel(grafico);*/
				
				Pizza pizza = new Pizza();
				panel.removeAll();
				panel.add(pizza);
				panel.validate();
				panel.repaint();
				
				
				
			
				
			}
		});
		botaoPizza.setBounds(228, 524, 89, 23);
		contentPane.add(botaoPizza);
		
		JButton btnNewButton_1 = new JButton("Colunas");
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(new Color(0, 153, 102));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Coluna linha = new Coluna();
				panel.removeAll();
				panel.add(linha);
				panel.validate();
				panel.repaint();
				
			}
		});
		btnNewButton_1.setBounds(380, 524, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Barras");
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setBackground(new Color(0, 153, 102));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Barra barra = new Barra();
				panel.removeAll();
				panel.add(barra);
				panel.validate();
				panel.repaint();
				
			}
		});
		btnNewButton_2.setBounds(535, 524, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Gr\u00E1ficos");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(389, 11, 204, 22);
		contentPane.add(lblNewLabel);
		
		
		
		
	}
}
