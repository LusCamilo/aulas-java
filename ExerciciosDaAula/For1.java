class For1{
    public static void main(String args[]){
        int n = 5;

        for (int i = 1; i <= 3; i++){ //controla  a repetição de quantas tabuadas serão exibidas
            System.out.println();
            for (int j = 0; j <= 10; j++){ //controla a estrutura da tabuada
            System.out.println(n + " X " + j + " = " + n*j);
            }
            n++;
        }
    }
}