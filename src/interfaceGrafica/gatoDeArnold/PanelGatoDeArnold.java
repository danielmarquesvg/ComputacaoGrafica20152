package interfaceGrafica.gatoDeArnold;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class PanelGatoDeArnold extends JPanel {

	private static final long serialVersionUID = 1L;

	public BufferedImage imagemGatoDeArnold;

	public PanelGatoDeArnold() {
		
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setBounds(new Rectangle(0, 0, 250, 250));

	}
	
	public void colocaImagemNoPainel(int alturaDaImagem1, int larguraDaImagem1, int matrizDaImagem1[][]){
		try {
			geraImagem(alturaDaImagem1, larguraDaImagem1, matrizDaImagem1);
			
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro ao tentar abrir a imagem.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void geraImagem(int alturaDaImagem1, int larguraDaImagem1, int matrizDaImagem1[][]) throws Exception{
		
        int altura = alturaDaImagem1;
        int largura = larguraDaImagem1;
        
        imagemGatoDeArnold = new BufferedImage(altura, largura, BufferedImage.TYPE_INT_RGB);
               
        int matrizInput [][] = matrizDaImagem1;
        int matrizResultado [][] = new int [altura][largura];
        
        
        
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.drawImage(imagemGatoDeArnold, 0, 0, null);
	}
}
