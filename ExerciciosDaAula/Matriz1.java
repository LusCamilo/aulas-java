import javax.swing.JOptionPane;
class Matriz1{
    public static void main(String args[]){
        JOptionPane jop = new JOptionPane();
        double matriza[][] = {{-7, 3},{4,5}};
        double matrizb[][] = {{8, 5},{9, 8}};
        double somatriz[][] = new double[2][2];
        double coordenada1 = somatriz[0][0];
        coordenada1 = matriza[0][0] + matrizb[0][0];

        System.out.println(coordenada1);
        jop.showMessageDialog(null, coordenada1);
        
    }
}