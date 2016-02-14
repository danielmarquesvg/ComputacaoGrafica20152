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

		//limparTela();
		//repaint();
		//desenharRetasPlano();
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
	
	//Plota um pixel pela entrada do usu�rio
	
	public void plotarPixel(){
		
		try{
			
			buffer.setRGB(this.coordeX,this.coordeY, Color.BLACK.getRGB() );
			repaint();
		
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Digite um n�mero v�lido: X: 0 a 600 e Y: 0 a 600");
		}
		
	}
	
	//M�todo de plotar a reta
	public void plotarRetaDDA(double x1, double y1,double x2, double y2){
		
		try{
		
			int comprimento;
			double x,y,xinc,yinc;
		
			comprimento = (int) Math.abs(x2-x1);
			System.out.println("comprimento x2-x1: "+comprimento);
		
					if(Math.abs(y2-y1) > comprimento){
						comprimento = (int) Math.abs(y2-y1);
						System.out.println("comprimento y2-y1: "+comprimento);
					}
		
				System.out.println("Valor de x1 e x2: "+x1+" "+x2);
					
				xinc = (x2-x1)/comprimento;
				System.out.println("Valor de xinc: "+xinc);
				yinc = (y2-y1)/comprimento;
				System.out.println("Valor de yinc: "+yinc);
		
				x=x1;
				y=y1;
			
				buffer.setRGB((int) Math.round(x), (int) Math.round(y), Color.BLACK.getRGB());
		
					//|| 
					//x<x2 ||
				//||y<y2
					if(x1==x2 && y<y2){
						
						System.out.println("Cond1");
						while( y<y2 ){
							
							System.out.println("Valor de x do while: "+x+" e valor de x2: "+x2);
					
							x = x + xinc;
							y = y + yinc;
				
							System.out.println("x: "+ (int) Math.round(x)+" e y: "+(int) Math.round(y));
							buffer.setRGB((int) Math.round(x),(int) Math.round(y), Color.BLACK.getRGB());
						}
					
					}
						
					if(x1==x2 && y>y2){
						System.out.println("Cond2");
						while( y>y2 ){
							
							System.out.println("Valor de x do while: "+x+" e valor de x2: "+x2);
					
							x = x + xinc;
							y = y + yinc;
				
							System.out.println("x: "+ (int) Math.round(x)+" e y: "+(int) Math.round(y));
							buffer.setRGB((int) Math.round(x),(int) Math.round(y), Color.BLACK.getRGB());
						}
					
					}
				
		
					if(x1>x2 && y1>y2){
						System.out.println("Cond3");
						while( x>x2 ){
						
							System.out.println("Valor de x do while: "+x+" e valor de x2: "+x2);
					
							x = x + xinc;
							y = y + yinc;
				
							System.out.println("x: "+ (int) Math.round(x)+" e y: "+(int) Math.round(y));
							buffer.setRGB((int) Math.round(x),(int) Math.round(y), Color.BLACK.getRGB());
						}
					
					}
				
					
						while( x<x2 ){
							System.out.println("Cond4");
							System.out.println("Valor de x do while: "+x+" e valor de x2: "+x2);
					
							x = x + xinc;
							y = y + yinc;
				
							System.out.println("x: "+ (int) Math.round(x)+" e y: "+(int) Math.round(y));
							buffer.setRGB((int) Math.round(x),(int) Math.round(y), Color.BLACK.getRGB());
						}
					
					if(x1>x2 && y1<y2){
						
						System.out.println("Cond5");
						while( y<y2 ){
							
							System.out.println("Valor de x do while: "+x+" e valor de x2: "+x2);
						
							x = x + xinc;
							y = y + yinc;
					
							System.out.println("x: "+ (int) Math.round(x)+" e y: "+(int) Math.round(y));
							buffer.setRGB((int) Math.round(x),(int) Math.round(y), Color.BLACK.getRGB());
						}
						
					}else{
						
						while( x<x2 || x>x2){
							System.out.println("Cond4");
							System.out.println("Valor de x do while: "+x+" e valor de x2: "+x2);
					
							x = x + xinc;
							y = y + yinc;
				
							System.out.println("x: "+ (int) Math.round(x)+" e y: "+(int) Math.round(y));
							buffer.setRGB((int) Math.round(x),(int) Math.round(y), Color.BLACK.getRGB());
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
