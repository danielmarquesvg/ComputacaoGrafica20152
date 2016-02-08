package algoritmos;

public class Converter {
	
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

}
