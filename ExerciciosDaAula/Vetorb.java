

class Vetorb {
	public static void main(String args[]){
        
        double num[] = {10, 6, 5, 9, 100};
        System.out.println("Media: " + media(num));
        System.out.println("Menor: " + menor(num));
        System.out.println("Maior: " + maior(num));
    }
    
public static double menor(double vetor[]){
    double menornum = vetor[0];
    for (int i=1; i < vetor.length ; i++){
        if(menornum > vetor[i]){
            menornum = vetor[i];
        }
    } 
    return menornum;
}
public static double maior(double vetor[]){
    double maiornum = vetor[0];
    for (int i=1; i < vetor.length ; i++){
        if(maiornum < vetor[i]){
            maiornum = vetor[i];
        }
    } 
    return maiornum;
}

public static double media(double media[]){
    double total = 0;
    for (int i=0 ; i < media.length ; i++){
        total += media[i];
    }
        return total / media.length;
    }
}