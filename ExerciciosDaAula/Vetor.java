import java.util.Scanner;

class Vetor {
	public static void main(String args[]){
		Scanner ler = new Scanner(System.in);
		double notas[] = new double[4];
		for(int i = 0; i < notas.length; i++){
			System.out.println((i+1) + "° nota");
			notas[i] = ler.nextDouble();
		}

		System.out.println(notas[5]);

		double somanotas = 0;

		for(int i = 0; i < notas.length; i++){
			System.out.println((i+1) + "nota: " + notas[i]);
			somanotas = somanotas + notas[i];
		}
		double media = somanotas / notas.length;
		System.out.println("\nMedia: " + media);

	}
}
