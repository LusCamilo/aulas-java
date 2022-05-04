import java.util.Scanner;

class Matriz {
	public static void main(String args[]){
        Scanner ler = new Scanner(System.in); 
        int m[][] = new int[2][2];
        for (int linha = 0 ; linha < m.length ; linha++){
            for (int coluna = 0 ; coluna < m.length ; coluna++){
                System.out.println("digite um numero:");
                m[linha][coluna] = ler.nextInt();
            }
        }
        for (int linha = 0 ; linha < m.length ; linha++){
            for (int coluna = 0 ; coluna < m.length ; coluna++){
                System.out.println(m[linha][coluna] * 2);
            }
        }
    }
}