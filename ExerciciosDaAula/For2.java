import javax.swing.JOptionPane;


class For2{
    public static void main(String args[]){
        JOptionPane jop = new JOptionPane();
        while(true){
            String np = jop.showInputDialog(null, "digite um numero positivo");                                   
            int n = Integer.parseInt(np);                                                                
            long fat = n;                                                                                
            if ( n >= 0){
                if ( n == 0){
                    jop.showMessageDialog(null, n + "! = 1" );   
                    String decisao = jop.showInputDialog(null, "voce quer continuar? (digite s/n)");
                    if (decisao.equalsIgnoreCase("s")){}
                    else{
                        System.exit(0);
                    }                                                                                        
                }
                else{
                    for (int i = 2; i < n; i++){ 
                        fat *= i;                                                                               
                    }                                          
                    jop.showMessageDialog(null, n + "! = " + fat);  
                    String decisao = jop.showInputDialog(null, "voce quer continuar? (digite s/n)");
                    if (decisao.equalsIgnoreCase("s")){}
                    else{
                        System.exit(0);
                    }
                }                                    
            }
            else{                                                                                           
                jop.showMessageDialog(null, n +" e um valor INVALIDO");                                            
                jop.showMessageDialog(null, "digite novamente");
            }
        }
    }
}