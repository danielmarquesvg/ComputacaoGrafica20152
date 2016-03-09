package interfaceGrafica;

import java.awt.image.BufferedImage;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

@SuppressWarnings("serial")
public class PainelDoBuffer extends JPanel {

	int coordeX, coordeY;
	double xincAtual, yincAtual;

	BufferedImage buffer = new BufferedImage(600, 600, BufferedImage.TYPE_INT_RGB);

	public PainelDoBuffer() {

		setBounds(new Rectangle(0, 0, 600, 600));
		setBorder(new LineBorder(new Color(0, 0, 0)));

		repaint();

	}

	// Coloca o buffer no painel
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		buffer.createGraphics();

		g.drawImage(buffer, 0, 0, null); // see javadoc for more info on the
											// parameters
	}

	// Colore todos os pixel do buffer para branco

	public void limparTela() {

		for (int i = 0; i < 600; i++) {

			for (int j = 0; j < 600; j++) {

				buffer.setRGB(i, j, Color.WHITE.getRGB());
			}
		}
		repaint();

	}

	// Desenha as retas do plano cartesiano
	public void desenharRetasPlano() {
		// System.out.println("OI");

		for (int x = 0; x < 600; x++) {

			buffer.setRGB(x, 300, Color.BLACK.getRGB());
		}

		for (int y = 0; y < 600; y++) {

			buffer.setRGB(300, y, Color.BLACK.getRGB());
		}

		// repaint();

	}

	// Plota um pixel pela entrada do usuário

	public void plotarPixel() {

		try {

			buffer.setRGB(this.coordeX + 300, -this.coordeY + 300, Color.BLACK.getRGB());
			repaint();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Digite um número válido: X: 0 a 600 e Y: 0 a 600");
		}

	}

	public void plotarRetaPontoMedio(int x1, int y1, int x2, int y2) {
		int deltaX, deltaY, x, y, p, twoDy, twoDyMinusDx;
		deltaX = Math.abs(x2 - x1);
		deltaY = Math.abs(y2 - y1);

		try {

			// Reta de 0 ate 90 graus || Reta de 180 ate 270 graus
			if ((x1 < x2 && y1 < y2) || (x1 > x2 && y1 > y2)) {
				// Reta de 0 ate 45 graus
				System.out.println("Reta de 0 ate 45 graus com " + "X1 = " + x1 + ", Y1 = " + y1 + ", X2 = " + x2 + ", Y2 = " + y2);
				if (deltaX > deltaY) {
					p = 2 * deltaY - deltaX;
					twoDy = 2 * deltaY;
					twoDyMinusDx = 2 * (deltaY - deltaX);

					if (x1 > x2) {
						x = x2;
						y = y2;
						x2 = x1;
					} else {
						x = x1;
						y = y1;
					}

					do {
						buffer.setRGB(x + 300, -y + 300, Color.BLACK.getRGB());
						x++;
						if (p < 0) {
							p += twoDy;
						} else {
							y++;
							p += twoDyMinusDx;
						}
					} while (x < x2);

					// Reta de 45 ate 90 graus
					System.out.println("Reta de 45 ate 90 graus com " + "X1 = " + x1 + ", Y1 = " + y1 + ", X2 = " + x2 + ", Y2 = " + y2);
				} else {
					p = 2 * deltaX - deltaY;
					twoDy = 2 * deltaX;
					twoDyMinusDx = 2 * (deltaX - deltaY);

					if (y1 > y2) {
						x = x2;
						y = y2;
						y2 = y1;
					} else {
						x = x1;
						y = y1;
					}

					do {
						buffer.setRGB(x + 300, -y + 300, Color.BLACK.getRGB());
						y++;
						if (p < 0) {
							p += twoDy;
						} else {
							x++;
							p += twoDyMinusDx;
						}
					} while (y < y2);

				}

				// Reta de 90 ate 180 graus || Reta de 270 ate 360 graus
			} else {
				// Reta de 135 ate 180 graus
				System.out.println("Reta de 135 ate 180 graus com " + "X1 = " + x1 + ", Y1 = " + y1 + ", X2 = " + x2 + ", Y2 = " + y2);
				if (deltaX > deltaY) {
					p = 2 * deltaY - deltaX;
					twoDy = 2 * deltaY;
					twoDyMinusDx = 2 * (deltaY - deltaX);

					if (x1 > x2) {
						x = x2;
						y = y2;
						x2 = x1;
					} else {
						x = x1;
						y = y1;
					}

					do {
						buffer.setRGB(x + 300, -y + 300, Color.BLACK.getRGB());
						x++;
						if (p < 0) {
							p += twoDy;
						} else {
							y--;
							p += twoDyMinusDx;
						}
					} while (x < x2);

					// Reta de 90 ate 135 graus
					System.out.println("Reta de 90 ate 135 graus com " + "X1 = " + x1 + ", Y1 = " + y1 + ", X2 = " + x2 + ", Y2 = " + y2);
				} else {
					p = 2 * deltaX - deltaY;
					twoDy = 2 * deltaX;
					twoDyMinusDx = 2 * (deltaX - deltaY);

					if (y1 < y2) {
						x = x2;
						y = y2;
						y2 = y1;
					} else {
						x = x1;
						y = y1;
					}

					do {
						buffer.setRGB(x + 300, -y + 300, Color.BLACK.getRGB());
						y--;
						if (p < 0) {
							p += twoDy;
						} else {
							x++;
							p += twoDyMinusDx;
						}
					} while (y > y2);
				}
			}

			repaint();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro ao desenhar a reta com " + "X1 = " + x1 + ", Y1 = " + y1 + ", X2 = " + x2 + ", Y2 = " + y2);
		}
	}

	// Método de plotar a reta
	public void plotarRetaDDA(double x1, double y1, double x2, double y2) {

		try {

			int comprimento;
			double x, y, xinc, yinc;

			comprimento = (int) Math.abs(x2 - x1);

			if (Math.abs(y2 - y1) > comprimento) {
				comprimento = (int) Math.abs(y2 - y1);
			}

			x = x1;
			y = y1;

			xinc = Math.abs((x2 - x1) / comprimento);
			yinc = Math.abs((y2 - y1) / comprimento);

			if (x1 < x2) {

				if (y1 < y2) { // Retas da esquerda para a direita, de baixo
								// para cima
					do {
						buffer.setRGB((int) Math.round(x) + 300, -(int) Math.round(y) + 300, Color.BLACK.getRGB());
						x += xinc;
						y += yinc;
					} while (x <= x2 && y <= y2);

				} else { // Retas da esquerda para a direita, de cima para baixo
					do {
						buffer.setRGB((int) Math.round(x) + 300, -(int) Math.round(y) + 300, Color.BLACK.getRGB());
						x += xinc;
						y -= yinc;
					} while (x <= x2 && y >= y2);

				}

			} else {

				if (y1 < y2) { // Retas da direita para a esquerda, de baixo para cima
					do {
						buffer.setRGB((int) Math.round(x) + 300, -(int) Math.round(y) + 300, Color.BLACK.getRGB());
						x -= xinc;
						y += yinc;
					} while (x >= x2 && y <= y2);

				} else { // Retas da direita para a esquerda, de cima para baixo
					do {
						buffer.setRGB((int) Math.round(x) + 300, -(int) Math.round(y) + 300, Color.BLACK.getRGB());
						x -= xinc;
						y -= yinc;
					} while (x >= x2 && y >= y2);

				}

			}

			repaint();

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Ocorreu um erro ao desenhar a reta!");
		}

	}
	
	public void plotarCircunferencia(int x1, int y1, int x2, int y2){
		
			int dx, dy, incE, incNE, d, x, y;

			dx = x2 - x1;
			dy = y2 - y1;
			d = 2 * dy - dx; /* Valor inicial de d */
			incE = 2 * dy; /* Incremento de E */
			incNE = 2 * (dy - dx); /* Incremento de NE */
			x = x1;
			y = y1;

			System.out.println("dx,dy,d,incE,incNE,x,y: "+ dx+" "+dy+" "+d+" "+incE+" "+incNE+" "+x+" "+y);
			//write_pixel( x, y, color);
			buffer.setRGB(x + 300, -y + 300, Color.BLACK.getRGB());
			
			//write_pixel( x, -y, color);
			buffer.setRGB(x + 300, +y + 300, Color.BLACK.getRGB());
			
			//write_pixel(-x, y, color);
			buffer.setRGB(-x + 300, -y + 300, Color.BLACK.getRGB());
			
			//write_pixel(-x, -y, color);
			buffer.setRGB(-x + 300, +y + 300, Color.BLACK.getRGB());
			
			//write_pixel( y, x, color);
			buffer.setRGB(y + 300, -x + 300, Color.BLACK.getRGB());
			
			//write_pixel( y, -x, color);
			buffer.setRGB(y + 300, x + 300, Color.BLACK.getRGB());
			
			//write_pixel(-y, x, color);
			buffer.setRGB(-y + 300, -x + 300, Color.BLACK.getRGB());
			
			//write_pixel(-y, -x, color);
			buffer.setRGB(-y + 300, x + 300, Color.BLACK.getRGB());
			
			
			repaint();
			
			
			while (x < x2){
				
				if (d <= 0){
					/* Escolhe E */
					d = d + incE;
					x = x + 1;
				}else{
					/* Escolhe NE */
					d = d + incNE;
					x = x + 1;
					y = y + 1;
				}/* end if */

				//write_pixel( x, y, color);
				buffer.setRGB(x + 300, -y + 300, Color.BLACK.getRGB());
				
				//write_pixel( x, -y, color);
				buffer.setRGB(x + 300, +y + 300, Color.BLACK.getRGB());
				
				//write_pixel(-x, y, color);
				buffer.setRGB(-x + 300, -y + 300, Color.BLACK.getRGB());
				
				//write_pixel(-x, -y, color);
				buffer.setRGB(-x + 300, +y + 300, Color.BLACK.getRGB());
				
				//write_pixel( y, x, color);
				buffer.setRGB(y + 300, -x + 300, Color.BLACK.getRGB());
				
				//write_pixel( y, -x, color);
				buffer.setRGB(y + 300, x + 300, Color.BLACK.getRGB());
				
				//write_pixel(-y, x, color);
				buffer.setRGB(-y + 300, -x + 300, Color.BLACK.getRGB());
				
				//write_pixel(-y, -x, color);
				buffer.setRGB(-y + 300, x + 300, Color.BLACK.getRGB());
				repaint();
			}/* end while */

		
	}

	public int getXX() {
		return coordeX;
	}

	public int getYY() {
		return coordeY;
	}

	public void setXX(int coordeX) {
		this.coordeX = coordeX;
	}

	public void setYY(int coordeY) {
		this.coordeY = coordeY;
	}

	public double getXinc() {
		return xincAtual;
	}

	public double getYinc() {
		return yincAtual;
	}
}
