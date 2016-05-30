package grafico;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class Pizza extends JPanel {

	/**
	 * Create the panel.
	 */
	public Pizza() {
	
		DefaultPieDataset dpd = new DefaultPieDataset();
		dpd.setValue("Provedor A, 25 ",25);
		dpd.setValue("Provedor B, 42.5 ",42.5);
		dpd.setValue("Provedor C, 17.5 ",17.5);
		dpd.setValue("Provedor D, 15 ",15);
		
		JFreeChart grafico = ChartFactory.createPieChart3D("GRÁFICO EM PIZZA",dpd,true,true,false);
		
		ChartPanel chartPanel = new ChartPanel(grafico);
		
		add(chartPanel);
		validate();
	}

}
