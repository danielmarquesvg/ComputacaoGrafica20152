package grafico;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

public class Coluna extends JPanel {

	/**
	 * Create the panel.
	 */
	public Coluna() {


		DefaultCategoryDataset dpd = new DefaultCategoryDataset();
		dpd.setValue(25,"Provedor","A");
		dpd.setValue(42.5,"Provedor","B");
		dpd.setValue(17.5,"Provedor","C");
		dpd.setValue(15,"Provedor","D");
		
		JFreeChart grafico = ChartFactory.createBarChart3D("GRÁFICO EM COLUNAS", "Provedores", "100", dpd);
				
		
		ChartPanel chartPanel = new ChartPanel(grafico);
		
		add(chartPanel);
		validate();
	}

}
