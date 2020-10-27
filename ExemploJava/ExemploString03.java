import javax.swing.JOptionPane;

public class ExemploString03 {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o seu nome:");
        nome = nome.trim();
        int quantidadecaracteres = nome.length();
        while (quantidadecaracteres < 10) {
            JOptionPane.showMessageDialog(null, "Nome deve conter no mínimo 10 caracteres");
            nome = JOptionPane.showInputDialog("Digite o seu nome:");
            nome = nome.trim();
            quantidadecaracteres = nome.length();
        }
        JOptionPane.showMessageDialog(null, "Obrigado!");
    }
}