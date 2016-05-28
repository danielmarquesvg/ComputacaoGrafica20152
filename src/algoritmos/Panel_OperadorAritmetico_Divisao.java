package algoritmos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Panel_OperadorAritmetico_Divisao extends JPanel {

	public BufferedImage imagemDivisao;
	
	/**
	 * Create the panel.
	 */
	public Panel_OperadorAritmetico_Divisao() {
		
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
         * utiliza a menor resolucao como padrao da resolucao da imagem processada com a operacao de divisao
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
        imagemDivisao = new BufferedImage(altura, largura, BufferedImage.TYPE_INT_RGB);
        
        for(int i = 0; i<altura; i++){
        	for(int j=0;j<largura;j++){
        		
        		//operacao de divisao
        		if(matrizDaImagem2[i][j] == 0){
        			
        			//tratamento da divisao por zero, por padrao soma-se mais 1 no divisor
        			matrizDaImagem2[i][j] = matrizDaImagem2[i][j] + 1;
        			matrizImagem[i][j] = (int)(matrizDaImagem1[i][j] / matrizDaImagem2[i][j]);
        		} else {
        			matrizImagem[i][j] = (int)(matrizDaImagem1[i][j] / matrizDaImagem2[i][j]);
        		}
        		
        		//verificacao do valor do pixel caso o mesmo ultrapasse o valor de 255 (valor maximo)
        		if(matrizImagem[i][j] > 255){
        			matrizImagem[i][j] = 255;
        		}
        		
        		imagemDivisao.setRGB(j, i, corPixel(matrizImagem[i][j]));
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
		g.drawImage(imagemDivisao, 0, 0, null);
	}

}
