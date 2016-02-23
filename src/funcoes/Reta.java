package funcoes;

public class Reta {
	// Métodos da normalizaçao

	public static double user_to_NDC(double coordenada) {
		double result = (coordenada - 0) / (600 - 0);
		// System.out.printf("%.6f%n",result);

		return result;
	}

	public static int NDC_TO_DC(double coordenada) {
		return (int) Math.round(coordenada * 599);
	}

	public static int user_to_DC(double coordenada) {
		return NDC_TO_DC(user_to_NDC(coordenada));
	}
}
