package algoritmos;

import java.awt.image.BufferedImage;

public class Circunferencia {
	
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
	
	public void algoritmoDoPontoMedioParaCircunferencia(BufferedImage buffer, int raio, int color){
		
		int x, y, d;
		/* Valores iniciais */
		
		x = 0;
		y = raio;
		d = 1 - raio;
		
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
			
			pontosDoCirculoSimetria8(buffer, x, y, color);
		}
	}

}
