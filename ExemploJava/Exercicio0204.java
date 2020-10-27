import javax.swing.JOptionPane;

public class Exercicio0204 {
/*
4 - ​Desenvolver um algoritmo que solicite um número e apresente a tabuada desse número.
Exemplo: Usuário informou o número 3, deve ser apresentado a seguinte tabuada:
3 * 0 = 0
3 * 1 = 3
3 * 2 = 6
3 * 3 = 9
3 * 4 = 12
3 * 5 = 15
3 * 6 = 18
3 * 7 = 21
3 * 8 = 24
3 * 9 = 27
3 * 10 = 30
Obs.: ​Usuário pode informar qualquer número.
*/
    public static void main(String[] args) {
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número desejado:"));
        
        JOptionPane.showMessageDialog(null, "Tabuada do número " + numero + ":"
        + "\n" + numero + " * 0 = " + numero * 0
        + "\n" + numero + " * 1 = " + numero * 1
        + "\n" + numero + " * 2 = " + numero * 2
        + "\n" + numero + " * 3 = " + numero * 3
        + "\n" + numero + " * 4 = " + numero * 4
        + "\n" + numero + " * 5 = " + numero * 5
        + "\n" + numero + " * 6 = " + numero * 6
        + "\n" + numero + " * 7 = " + numero * 7
        + "\n" + numero + " * 8 = " + numero * 8
        + "\n" + numero + " * 9 = " + numero * 9
        + "\n" + numero + " * 10 = " + numero * 10);
    }
}