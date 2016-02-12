package funcoes;

import javax.xml.bind.ParseConversionEvent;

public class Funcoes {
	
	public static String rgbParaHexadecimal(int red, int green, int blue){
		
		int redDivisao = red / 16;
		int redResto = red % 16;
		
		int greenDivisao = green / 16;
		int greenResto = green % 16;
		
		int blueDivisao = blue / 16;
		int blueResto = blue % 16;
		
		String hexadecimal = "#" + Integer.toHexString(redDivisao);
		hexadecimal = hexadecimal + Integer.toHexString(redResto);
		hexadecimal = hexadecimal + Integer.toHexString(greenDivisao);
		hexadecimal = hexadecimal + Integer.toHexString(greenResto);
		hexadecimal = hexadecimal + Integer.toHexString(blueDivisao);
		hexadecimal = hexadecimal + Integer.toHexString(blueResto);
		hexadecimal = hexadecimal.toUpperCase();
		
		return hexadecimal;
	}
	
	public static int [] criarArrayDeCoresRGB(int bitsDeProfundidade){
		
		int [] arrayRGB = new int[bitsDeProfundidade];
		
		int divisao = 255 / bitsDeProfundidade;
		int nivelDeIntensidadeDaCor = 255;
		
		for(int i = arrayRGB.length - 1; i > 0; i--){
			arrayRGB[i] = nivelDeIntensidadeDaCor;
			nivelDeIntensidadeDaCor = nivelDeIntensidadeDaCor - divisao;
		}
		
		return arrayRGB;
		
	}
	
	public static String [] criarArrayAuxiliarDeCoresRGB(int [] arrayRGB){
		
		String [] arrayAuxiliar = new String [arrayRGB.length];
		
		
		for(int i = 0; i < arrayAuxiliar.length; i++){
			arrayAuxiliar[i] = Integer.toString(arrayRGB[i]);
			
			while(arrayAuxiliar[i].length() < 3){
				arrayAuxiliar[i] = "0"+ arrayAuxiliar[i];
			}
		}
		
		
		return arrayAuxiliar;
	}

}
