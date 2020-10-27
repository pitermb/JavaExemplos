import javax.swing.JOptionPane;

public class ExemploCalculoPercentual {

    public static void main(String[] args) {
        
        double valor = 250;
        double percentual = 25;
        
        /*
        250  100
        x    25
        (250 * 25) / 100 -> valordesconto = 62,5
        */

        double valordesconto = (valor * percentual) / 100;

        JOptionPane.showMessageDialog(null, valordesconto);
    }
}