import javax.swing.JOptionPane;

public class ExemploEstruturaCondicional06 {

    public static void main(String[] args) {
        
        // numero != 10
        String texto = "Piter";
        if (!texto.equals("Piter")) {
            JOptionPane.showMessageDialog(null, "Diferente");
        } else {
            JOptionPane.showMessageDialog(null, "Igual");
        }
    }
}