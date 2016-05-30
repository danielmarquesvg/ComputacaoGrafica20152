package funcoes;

import java.util.ArrayList;

public class Matriz {//Classe com operações com matrizes

	public void multiplicacaoMatrizes(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {

	}

	public static void mostraMatriz(ArrayList<ArrayList<Integer>> A) {
		if (!A.isEmpty()) {

			for (int i = 0; i < A.size(); i++) {
				System.out.print("|");
				for (int j = 0; j < A.get(0).size(); j++) {
					System.out.printf(" " + A.get(i).get(j));
					System.out.printf("\t");
				}
				System.out.print("|\n");
			}
		} else {
			System.out.println("Matriz Vazia");
		}
	}

	
	public static void mostraMultiplicacaoMatriz(ArrayList<ArrayList<Integer>> matrizA, 
												 ArrayList<ArrayList<Integer>> matrizB, 
												 ArrayList<ArrayList<Integer>> matrizSolucao) {
		if (!matrizA.isEmpty() || !matrizB.isEmpty() || !matrizSolucao.isEmpty()) {

			int i = 0;
			int j = 0;
			int k = 0;
			
			while (i < matrizA.size() || 
				   j < matrizB.size() || 
				   k < matrizSolucao.size()) {
				
				if(i < matrizA.size()) {
					System.out.print("|");
					for (int l = 0; l < matrizA.get(0).size(); l++) {
						System.out.printf(" " + matrizA.get(i).get(l));
						System.out.printf("\t");
					}
					System.out.print("|\tx\t");					
				} else {
					for (int l = 0; l < matrizA.get(0).size(); l++) {
						System.out.printf(" ");
						System.out.printf("\t");
					}
					System.out.print(" \t \t");
				}
				
				if(j < matrizB.size()) {
					System.out.print("|");
					for (int l = 0; l < matrizB.get(0).size(); l++) {
						System.out.printf(" " + matrizB.get(j).get(l));
						System.out.printf("\t");
					}
					System.out.print("|");	
				} else {
					for (int l = 0; l < matrizB.get(0).size(); l++) {
						System.out.printf(" ");
						System.out.printf("\t");
					}
					System.out.print(" \t \t");				
				}
				
				if(k < matrizSolucao.size()) {
					System.out.print("\t=\t|");
					for (int l = 0; l < matrizSolucao.get(0).size(); l++) {
						System.out.printf(" " + matrizSolucao.get(k).get(l));
						System.out.printf("\t");
					}
					System.out.print("|\n");
				} else {
					for (int l = 0; l < matrizSolucao.get(0).size(); l++) {
						System.out.printf(" ");
						System.out.printf("\t");
					}					
				}
				
				i++; j++; k++;
				
			}
		} else {
			System.out.println("Ao menos uma das Matrizes encontra-se Vazia");
		}
	}
	

	public static ArrayList<ArrayList<Integer>> multiplicaMatriz(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
		ArrayList<ArrayList<Integer>> matrizSolucao = new ArrayList<ArrayList<Integer>>();
		int aux = 0;
		
		if (!A.isEmpty() || !B.isEmpty()) {
			matrizSolucao = Matriz.criaMatriz(A.size(), B.get(0).size()); // cria matriz solucao com dimencoes adequadas
			
			for (int i = 0; i < matrizSolucao.size(); i++) { // varendo as linhas da matriz solucao
				
				for (int j = 0; j < matrizSolucao.get(0).size(); j++) { // varendo as colunas da matriz solucao
					
					for (int k = 0; k < A.get(0).size(); k++) { // varre os itens que serao calculados
						aux = matrizSolucao.get(i).get(j) + (A.get(i).get(k) * B.get(k).get(j)); // calcula os valores 
						matrizSolucao.get(i).set( j, aux ); 
					}
				}
			}
		} else {
			System.out.println("ERRO: Uma das Matrizes é Vazia");
			return null;
		}
			
		return matrizSolucao;
	}
	

	public static ArrayList<ArrayList<Integer>> criaMatriz(int numDeLinhas, int numColunas) {
		ArrayList<ArrayList<Integer>> novaMatriz = new ArrayList<ArrayList<Integer>>();
		
		for (int i = 0; i < numDeLinhas; i++) {
			novaMatriz.add(new ArrayList<Integer>()); //cria uma linha
			for (int j = 0; j < numColunas; j++) {
				novaMatriz.get(i).add(0); //cria uma coluna e adiciona o valor 0
			}
		}
		//Matriz.mostraMatriz(novaMatriz);
		
		return novaMatriz;
	}

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
/*
		A.add(new ArrayList<Integer>());
		A.add(new ArrayList<Integer>());

		A.get(0).add(2);
		A.get(0).add(3);

		A.get(1).add(4);
		A.get(1).add(5);

		B.add(new ArrayList<Integer>());
		B.add(new ArrayList<Integer>());

		B.get(0).add(6);
		B.get(0).add(7);

		B.get(1).add(8);
		B.get(1).add(9);

		Matriz.mostraMatriz(A);
		System.out.println("");
		Matriz.mostraMatriz(B);
		System.out.println("");
		
		Matriz.mostraMatriz(Matriz.multiplicaMatriz(A, B));
*/		

		A.add(new ArrayList<Integer>());
		A.add(new ArrayList<Integer>());

		A.get(0).add(2);
		A.get(0).add(5);
		A.get(0).add(9);

		A.get(1).add(3);
		A.get(1).add(6);
		A.get(1).add(8);

		B.add(new ArrayList<Integer>());
		B.add(new ArrayList<Integer>());
		B.add(new ArrayList<Integer>());

		B.get(0).add(2);
		B.get(0).add(7);

		B.get(1).add(4);
		B.get(1).add(3);

		B.get(2).add(5);
		B.get(2).add(2);
		
		Matriz.mostraMultiplicacaoMatriz(A, B, Matriz.multiplicaMatriz(A, B));

		
	}
}
