import java.util.Scanner;

class TestGame{
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        for(int i = 3; i >= 0 ; i--){
            System.out.println("\ncapital do equador");
            String carro = ler.nextLine();
            if (carro.equalsIgnoreCase("quito")) {
                System.out.println("correto");
                System.exit(0);
            }
            if (i >= 1){
                System.out.println("errado, voce tem mais " + i + " chances");
            }
            else{
                System.out.println("errado, voce nao tem mais chances");
                System.out.println("tente novamente mais tarde");
                System.exit(0);
            }
        }
    }   
}