package algoritmos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Panel_OperadorLogico_XOR extends JPanel {

	public BufferedImage imagemXOR;
	
	/**
	 * Create the panel.
	 */
	public Panel_OperadorLogico_XOR() {
		
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setBounds(new Rectangle(0, 0, 250, 250));

	}
	
	public void colocaImagemNoPainel(int alturaDaImagem1, int larguraDaImagem1, int matrizDaImagem1[][], int alturaDaImagem2, int larguraDaImagem2, int matrizDaImagem2[][]){
		try {
			geraImagem(alturaDaImagem1, larguraDaImagem1, matrizDaImagem1, alturaDaImagem2, larguraDaImagem2, matrizDaImagem2);
			
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro ao tentar abrir a imagem.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void geraImagem(int alturaDaImagem1, int larguraDaImagem1, int matrizDaImagem1[][], int alturaDaImagem2, int larguraDaImagem2, int matrizDaImagem2[][]) throws Exception{
		
        int altura;
        int largura;
        
        /*
         * verificacao da imagem com menor resolucao
         * utiliza a menor resolucao como padrao da resolucao da imagem processada com a operacao de adicao
         */
        if(alturaDaImagem1 <= alturaDaImagem2){
        	altura = alturaDaImagem1;
        } else {
        	altura = alturaDaImagem2;
        }
        
        if(larguraDaImagem1 <= larguraDaImagem2){
        	largura = larguraDaImagem1;
        } else {
        	largura = larguraDaImagem2;
        }
        
        int matrizImagem[][] = new int[altura][largura];       
        imagemXOR = new BufferedImage(altura, largura, BufferedImage.TYPE_INT_RGB);
        
        for(int i = 0; i<altura; i++){
        	for(int j=0;j<largura;j++){
        		
        		//operacao de XOR
        		matrizImagem[i][j] = (matrizDaImagem1[i][j] ^ matrizDaImagem2[i][j]);
        		
        		//verificacao do valor do pixel caso o mesmo ultrapasse o valor de 255 (valor maximo)
        		if(matrizImagem[i][j] > 255){
        			matrizImagem[i][j] = 255;
        		}
        		
        		imagemXOR.setRGB(j, i, corPixel(matrizImagem[i][j]));
        		repaint();
        	}
        } 
    }
	
	static int corPixel(int corRGB){
		Color cor = new Color(corRGB, corRGB, corRGB);
		return cor.getRGB();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.drawImage(imagemXOR, 0, 0, null);
	}

}
