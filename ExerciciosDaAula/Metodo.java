import java.util.Scanner;
class Metodo{
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        System.out.println("\nola, digite o primeiro numero");
        int n1 = ler.nextInt();
        System.out.println("\nola, digite o segundo numero");
        int n2 = ler.nextInt();
        

        double resultadoSo  = somar(n1, n2);
        double resultadoSu  = subtrair(n1, n2);
        double resultadoMul = multiplicar(n1, n2);
        double resultadoDiv = dividir(n1, n2);
        System.out.println("\nqual operação deseja realizar");
        String decisao = ler.next();
        if(decisao.equalsIgnoreCase(soma)){
            System.out.println("soma = " +resultadoSo);
        }
        if(decisao.equalsIgnoreCase(subtracao)){
            System.out.println("soma = " +resultadoSu);
        }
        if(decisao.equalsIgnoreCase(multiplicacao)){
            System.out.println("soma = " +resultadoMul);
        }
        if(decisao.equalsIgnoreCase(divisao)){
            System.out.println("soma = " +resultadoDiv);
        }
        //System.out.println("soma = " +resultadoSo);
        //System.out.println("subtracao = " +resultadoSu);
        //System.out.println("multiplicacao = " +resultadoMul);
        //System.out.println("divisao = "+resultadoDiv);
    }
    public static double somar(double n1, double n2){
        double soma = n1 + n2;
        return soma;
       
    }
    public static double subtrair(double n1, double n2){
        double sub = n1 - n2;
        return sub;
    }
    public static double multiplicar(double n1, double n2){
        double mult = n1 * n2;
        return mult;
    }
    public static double dividir(double n1, double n2){
        double div = n1 / n2;
        return div;
    }
}
