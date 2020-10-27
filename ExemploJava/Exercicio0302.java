import javax.swing.JOptionPane;

public class Exercicio0302 {
/*
2 - ​Desenvolver um programa que calcule o IMC:
Fórmula: IMC = peso / altura2
Para fazer algum número elevado utilize: Math.pow(1.72, 2), onde 2 será o expoente.
*/
    public static void main(String[] args) {
        
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso: "));
        double imc = peso / (altura * altura);

        if (imc < 17) {
            JOptionPane.showMessageDialog(null, "Muito abaixo do peso!");
        } else if (imc <= 18.9) {
            JOptionPane.showMessageDialog(null, "Abaixo do peso!");
        } else if (imc <= 24.9) {
            JOptionPane.showMessageDialog(null, "Peso normal!");
        } else if (imc <= 29.9) {
            JOptionPane.showMessageDialog(null, "Acima do peso!");
        } else if (imc <= 34.9) {
            JOptionPane.showMessageDialog(null, "Obesidade I!");
        } else if (imc <= 39.9) {
            JOptionPane.showMessageDialog(null, "Obesidade II (severa)!");
        } else {
            JOptionPane.showMessageDialog(null, "Obesidade III (mórbida)!");
        }
    }
}