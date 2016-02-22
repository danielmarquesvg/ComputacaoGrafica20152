package interfaceGrafica;
import java.awt.image.BufferedImage;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;


public class PainelDoBuffer extends JPanel {

	int coordeX,coordeY;
	
	
	BufferedImage buffer = new BufferedImage(600,600,BufferedImage.TYPE_INT_RGB);
	
	public PainelDoBuffer() {
		
		
		setBounds(new Rectangle(0, 0, 600, 600));
		setBorder(new LineBorder(new Color(0, 0, 0)));

		repaint();
	
	}
	 
	//Coloca o buffer no painel
	@Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        buffer.createGraphics();
	        
	        g.drawImage(buffer, 0,0, null); // see javadoc for more info on the parameters            
	    }
	

	//Colore todos os pixel do buffer para branco
	
	public void limparTela(){
		
		for (int i = 0; i < 600; i++) {
			
			for (int j = 0; j < 600; j++) {
				
				buffer.setRGB(i, j,Color.WHITE.getRGB());
			}
		}
		repaint();
		
	}
	
	//Desenha as retas do plano cartesiano
	public void desenharRetasPlano(){
		//System.out.println("OI");
		
		for (int x = 0; x < 600; x++) {
			
			buffer.setRGB(x,300,Color.BLACK.getRGB());
		}
			
		for (int y = 0; y < 600; y++) {
				
			buffer.setRGB(300, y,Color.BLACK.getRGB());
		}
		
		//repaint();
		
	}
	
	//Plota um pixel pela entrada do usuário
	
	public void plotarPixel(){
		
		try{
			
			buffer.setRGB(this.coordeX + 300, - this.coordeY + 300, Color.BLACK.getRGB() );
			repaint();
		
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Digite um número válido: X: 0 a 600 e Y: 0 a 600");
		}
		
	}
	
	//Método de plotar a reta
	public void plotarRetaDDA(double x1, double y1,double x2, double y2){
		
		try{
		
			int comprimento;
			double x,y,xinc,yinc;
		
			comprimento = (int) Math.abs(x2-x1);
		
					if(Math.abs(y2-y1) > comprimento){
						comprimento = (int) Math.abs(y2-y1);
					}
		
					
				xinc = (x2-x1)/comprimento;
				yinc = (y2-y1)/comprimento;
		
				x=x1;
				y=y1;
			
				buffer.setRGB((int) Math.round(x) + 300, - (int) Math.round(y) + 300, Color.BLACK.getRGB());
		
					//|| 
					//x<x2 ||
				//||y<y2
					if(x1==x2 && y<y2){
						
						while( y<y2 ){
					
							x = x + xinc;
							y = y + yinc;
				
							buffer.setRGB((int) Math.round(x) + 300, - (int) Math.round(y) + 300, Color.BLACK.getRGB());
						}
					
					}
						
					if(x1==x2 && y>y2){

						while( y>y2 ){							
					
							x = x + xinc;
							y = y + yinc;
				
							buffer.setRGB((int) Math.round(x) + 300, - (int) Math.round(y) + 300, Color.BLACK.getRGB());
						}
					
					}
				
		
					if(x1>x2 && y1>y2){

						while( x>x2 ){
					
							x = x + xinc;
							y = y + yinc;
				
							buffer.setRGB((int) Math.round(x) + 300, - (int) Math.round(y) + 300, Color.BLACK.getRGB());
						}
					
					}
				
					
						while( x<x2 ){
					
							x = x + xinc;
							y = y + yinc;
				
							buffer.setRGB((int) Math.round(x) + 300, - (int) Math.round(y) + 300, Color.BLACK.getRGB());
						}
					
					if(x1>x2 && y1<y2){
						
						while( y<y2 ){
						
							x = x + xinc;
							y = y + yinc;
					
							buffer.setRGB((int) Math.round(x) + 300, - (int) Math.round(y) + 300, Color.BLACK.getRGB());
						}
						
					}else{
						
						while( x<x2 || x>x2){

							x = x + xinc;
							y = y + yinc;
				
							buffer.setRGB((int) Math.round(x) + 300, - (int) Math.round(y) + 300, Color.BLACK.getRGB());
						}
						
					}

					repaint();
					
		}catch(Exception e){
			
			JOptionPane.showMessageDialog(null, "Ocorreu um erro ao desenhar a reta!");
		}
		
	}
	
	
	public int getXX(){
		return coordeX;
	}
   
	public int getYY(){
		return coordeY;
	}
	public void setXX(int coordeX){
		this.coordeX = coordeX ;
	}
	
	public void setYY(int coordeY){
		this.coordeY = coordeY ;
	}
}
