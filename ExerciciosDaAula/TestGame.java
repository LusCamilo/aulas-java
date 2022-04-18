import java.util.Scanner;

class TestGame{
    public static void main(String args[]){
     Scanner ler = new Scanner(System.in);
     System.out.println("\ninsira sua resposta:");
     String carro = ler.next();

        if (carro.equalsIgnoreCase("carro")) {
             System.out.println("correto");
        
        }
        else {
            System.out.println("errado");

        }
    }
}