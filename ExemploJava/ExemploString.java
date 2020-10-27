import javax.swing.JOptionPane;

public class ExemploString {

    public static void main(String[] args) {
        String texto = "R$ 2.00";
        texto = texto.replace("R$", "");
        texto = texto.replace(" ", "");
        texto = texto.replace(",", ".");
        double valor = Double.parseDouble(texto);
        JOptionPane.showMessageDialog(null, "Valor: " + valor);
    }
}