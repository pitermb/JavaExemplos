import javax.swing.JOptionPane;

public class Exercicio0301 {
/*
1 - ​Desenvolver um algoritmo que solicite para o usuário quatro notas e realize a média do
mesmo, apresentando ao final:
➔ Caso a média do aluno seja inferior a 5.0 apresentar que ele está reprovado.
➔ Caso a média do aluno seja inferior a 7.0 apresentar que o aluno está em exame;
➔ Caso a média for superior ou igual a 7.0 apresentar que o mesmo está aprovado.
*/
    public static void main(String[] args) {
      
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Insira sua primeira nota:"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Insira sua segunda nota:"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Insira sua terceira nota:"));
        double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Insira sua quarta nota:"));
        double soma = 0;
        soma = (nota1 + nota2 + nota3 + nota4) / 4;
        
        if (soma < 5) {
            JOptionPane.showMessageDialog(null, "Aluno está reprovado!");
        
        } else if (soma < 7) {
            JOptionPane.showMessageDialog(null, "Aluno está em exame!");
        
        } else if (soma >= 7) {
            JOptionPane.showMessageDialog(null, "Aluno está aprovado!");
        }
    }
}