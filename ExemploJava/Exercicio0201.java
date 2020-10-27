import javax.swing.JOptionPane;

public class Exercicio0201 {
/*
1 -​ Desenvolver um algoritmo que solicite as seguintes informações ao usuário:
➔ Nome
➔ Sobrenome
➔ Nota 1
➔ Nota 2
➔ Nota 3
➔ Nota 4
Apresente ao final:
➔ Nome concatenado com o sobrenome;
➔ Média
➔ As Notas da seguinte forma (7.0 + 5.5 + 4.3 + 3.1) / 4 = 4,97 
*/
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o seu nome:");
        String sobrenome = JOptionPane.showInputDialog("Digite o seu sobrenome:");
        String nomecompleto = nome + " " + sobrenome;
        int i = 0;
        double soma = 0;

        while (i < 4) {
            double nota = Double.parseDouble(JOptionPane.showInputDialog("(" + (i + 1) + " de 4) - Digite a sua nota:"));
        i = i + 1;
        soma = soma + nota;
        }
        double media = (double) + soma / 4;
        JOptionPane.showMessageDialog(null, "A nota média de " + nomecompleto + " seria: " + media);
    }
}