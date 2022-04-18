import javax.swing.JOptionPane;


class Fatorial1{
    public static void main(String args[]){
        JOptionPane jop = new JOptionPane();
        while(true){
            String np = jop.showInputDialog(null, "digite um numero positivo");                                   
            int n = Integer.parseInt(np);                                                                                                                                               
            if ( n >= 0){
                if ( n == 0){
                    jop.showMessageDialog(null, n + "! = 1" );   
                    System.exit(0);                                                                                     
                }
                long fat = n; 
                    if(n >= 0){
                        for (int i = 2; i < n; i++){ 
                            fat *= i;                                                                               
                        }                                          
                        jop.showMessageDialog(null, n + "! = " + fat); 
                        System.exit(0);
                    }                                    
                }                                                                                           
                jop.showMessageDialog(null,  " e um valor INVALIDO");                                            
                jop.showMessageDialog(null, "digite novamente");

       
        }
    }
}
