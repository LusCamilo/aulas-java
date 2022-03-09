import java.util.Scanner;

class Idade{
    public static void main(String args[]){
    Scanner ler = new Scanner(System.in);
    System.out.println("\nola, digite sua idade");
    int idade = ler.nextInt();

        if (idade > 17){

           System.out.println("\noloko vc e maior de idade\n");

        }
        else if (10 > idade > 70 ){
            System.out.println("ata que vc tem essa idade");
        }
        else {
            System.out.println("\n o cara e de menor kkkkkkkkkkkkkkkkkkj\n");  
        }    
    }
}