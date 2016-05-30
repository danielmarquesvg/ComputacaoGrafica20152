package algoritmosDeProcessamentoDeImagens;

import java.awt.image.BufferedImage;

public class Circunferencia {
	
	//Simetria de 8 pontos
	public void pontosDoCirculoSimetria8(BufferedImage buffer,int x, int y, int color){
		buffer.setRGB( x + 300,  y + 300, color);
		buffer.setRGB( x + 300, -y + 300, color);
		buffer.setRGB(-x + 300,  y + 300, color);
		buffer.setRGB(-x + 300, -y + 300, color);
		buffer.setRGB( y + 300,  x + 300, color);
		buffer.setRGB( y + 300, -x + 300, color);
		buffer.setRGB(-y + 300,  x + 300, color);
		buffer.setRGB(-y + 300, -x + 300, color);
	}
	
	//Ponto Medio
	public void algoritmoDoPontoMedioParaCircunferencia(BufferedImage buffer, int raio, int color){
		
		int x, y, d;
		/* Valores iniciais */
		
		x = 0;
		y = raio;
		d = 1 - raio;
		
		//Setando os pixels da posicao inicial
		pontosDoCirculoSimetria8(buffer, x, y, color);
		
		while (y > x){
			
			if (d < 0){
				/* Selecione E */
				d = d + 2 * x + 3;
				x++;
			}else{
				/* Selecione SE */
				d = d + 2 * (x - y) + 5;
				x++;
				y--;
			}
			
			//seta os pixeis atuais
			pontosDoCirculoSimetria8(buffer, x, y, color);
		}
	}

}
