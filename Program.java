package exercicio_matriz;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a altura e a largura da matriz em um n: ");
		int n = sc.nextInt();
		int [][] matriz = new int [n][n];
		 int contagem = 0;
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < n; j++) {
				matriz [i][j] = sc.nextInt();
			}
		}
		System.out.println("Diagonal principal: "); 
		for(int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i]+ " ");
		}
		System.out.println(); 
		System.out.print("Quantidade de números negativos: ");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if (matriz [i][j] < 0){
					contagem ++;
				}
			}
		}
		System.out.println(contagem);
		
		sc.close();

	}

}
