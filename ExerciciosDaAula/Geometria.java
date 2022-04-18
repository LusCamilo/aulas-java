import java.util.Scanner;
class Geometria{
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        while(true){
            System.out.println("\nqual operacaoo deseja realizar? [digite quadrado, retangulo, triangulo,  circulo]" );
            String decisao = ler.next();
            if(decisao.equalsIgnoreCase("retangulo")){
                System.out.println("\nok, digite a base");
                double n1 = ler.nextDouble();
                System.out.println("\ndigite a altura");
                double n2 = ler.nextDouble();
                double areaRet  = retangulo(n1, n2);
                System.out.println("Area: " + areaRet);
            }
            if(decisao.equalsIgnoreCase("quadrado")){
                System.out.println("\nok, digite o lado");
                double n1 = ler.nextDouble();
                double areaQuad  = quadrado(n1);
                System.out.println("Area: " + areaQuad);
            }
            if(decisao.equalsIgnoreCase("circulo")){
                System.out.println("\nok, digite o raio");
                double n3 = ler.nextDouble();
                double areacirc = circulo(n3);
                System.out.println("Area: " + areacirc);
            }
            if(decisao.equalsIgnoreCase("triangulo")){
                System.out.println("\nok, digite a base");
                double n1 = ler.nextDouble();
                System.out.println("\n digite a altura");
                double n2 = ler.nextDouble();
                double areatriang = triangulo(n1, n2);
                System.out.println("Area: " + areatriang);
            }
            System.out.println("\ndeseja continuar? [digite sim ou nao]" );
            String decisao2 = ler.next(); 
            if(decisao2.equalsIgnoreCase("sim")){}
            else{
                System.exit(0);
            }
        }

    }
//---------------------------------------MÉTODOS------------------------------------\\
    public static double retangulo(double n1, double n2){
        double retangulo = n1 * n2;
        return retangulo;
    }
    public static double quadrado(double n1){
        double quadrado = n1 * n1;
        return quadrado;
    }
    public static double circulo(double n3){
        double circulo = 3.14 * (n3*n3);
        return circulo;
    }
    public static double triangulo(double n1, double n2){
        double triangulo = (n1 * n2) / 2;
        return triangulo;
    }
}
