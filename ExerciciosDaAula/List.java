import java.util.ArrayList;

class List{
    public static void main(String args[]){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        System.out.println("\n1 == indeterminado\n\n2 == primo\n\n3 == primo\n\n4 == composto\n\n5 == primo\n\n6 == composto\n\n7 == primo\n\n8 == composto\n\n9 == composto\n");
        for(int j = 10; j >= lista.size(); j++){
            if(j % 2 == 0 || j % 3 == 0 || j % 4 == 0  ||  j % 5 == 0 ||  j % 6 == 0 ||  j % 7 == 0 ||  j % 8 == 0 ||  j % 9 == 0){
                lista.add(j);
                System.out.println(j + " == composto");
            } 
    
            else{
                lista.add(j);
                System.out.println(j + " == primo\n");
            }
        }
    }
}