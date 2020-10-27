import javax.swing.JOptionPane;

public class Exercicio0203 {
/*
3 - ​Desenvolver um algoritmo que solicite um número, apresentando este número elevado
ao quadrado.
Exemplos: Usuário informou o número 9.
Irá apresentar o texto abaixo:
92 = 81
*/
    public static void main(String[] args) {
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Insira o número que queira elevar ao quadrado:"));
        int soma = numero * numero;

        JOptionPane.showMessageDialog(null, numero + "²" + " = " + soma);
    }
}