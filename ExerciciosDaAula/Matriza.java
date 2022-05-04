import java.util.Scanner;
import java.text.DecimalFormat;

class Matriza{
    public static void main(String args[]){
        double matriz[][] = new double[2][2];
        DecimalFormat df = new DecimalFormat("#.##");
        Scanner ler = new Scanner (System.in);
        for (int lin = 0; lin<matriz.length; lin++){
            for(int col =0; col<matriz.length; col++){
                System.out.print("digite um valor pra tabela ");
                matriz[lin][col] = ler.nextDouble();
            }
        }
        System.out.println("Media: " + df.format(media(matriz)));
        System.out.println("Menor: " + menor(matriz));
        System.out.println("Maior: " + maior(matriz));
    }
    //metodo que retorna a media aritmetica
    public static double media(double mat[][]){
        double total = 0;
        for (int linha = 0;  linha < mat.length; linha++){//criar laço [for] alinhado para percorrer todas linhas e colunas 
            for (int coluna = 0; coluna < mat[0].length; coluna++){//[for] para as colunas :)
                total += mat[linha][coluna];
            }
        } 
        double media = total / (mat.length * mat[0].length);//calculo da media
        return media;//retorno da variavel media
    }
    //metodo que retorna a media menor
    public static double menor(double matriz[][]){  
        double menornum = matriz[0][0]; //variavel
        for (int linha=1; linha < matriz.length ; linha++){ //pega dos as linhas
            for (int coluna = 0; coluna < matriz[0].length; coluna++){ //pega todas as colunas
                if(menornum > matriz[linha][coluna]){ // compara se a variavel é maior que a variavel matriz
                    menornum = matriz[linha][coluna]; //
                }
            }    
        } 
        return menornum;
    } 
    //metodo que retorna a media maior
    public static double maior(double matriz[][]){
        double maiornum = matriz[0][0];
        for (int linha=1; linha > matriz.length ; linha++){
            for (int coluna = 0; coluna > matriz[0].length; coluna++){
                if(maiornum < matriz[linha][coluna]){
                    maiornum = matriz[linha][coluna];
                }
            }    
        } 
        return maiornum;
    }
}