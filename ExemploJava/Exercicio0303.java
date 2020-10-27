import javax.swing.JOptionPane;

public class Exercicio0303 {
/*
3 - ​Solicite uma palavra e verifique se o comprimento da palavra está entre 4 letras e 10
letras, apresentando uma mensagem se está ou não no intervalo.
Para obter o tamanho da palavra utilize o comando nome.length()​.
*/
    public static void main(String[] args) {
    
        String palavra = JOptionPane.showInputDialog("Digite a palavra:");
        int quantidade = palavra.length();

        if ((quantidade >= 4) && (quantidade <= 10)) {
            JOptionPane.showMessageDialog(null, "Está no intervalo!");
        } else {
            JOptionPane.showMessageDialog(null, "Está fora do intervalo!");
        }
    }
}