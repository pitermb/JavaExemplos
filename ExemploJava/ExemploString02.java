import javax.swing.JOptionPane;

public class ExemploString02 {

    public static void main(String[] args) {
        String texto = "Piter Merlo Bruner";
        int quantidadecaracteres = texto.length();
        JOptionPane.showMessageDialog(
            null, "Quantidade de caracteres: " + quantidadecaracteres);
    }
}