import javax.swing.JOptionPane;

public class ExemploFor02 {

    public static void main(String[] args) {
        for(int i = 0; i <= 4; i = i + 1){
            String nome = JOptionPane.showInputDialog(
                null, "Informe o seu nome");
            System.out.println(nome);
        }
    }
}