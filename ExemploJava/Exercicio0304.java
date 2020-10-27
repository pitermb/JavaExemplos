import javax.swing.JOptionPane;

public class Exercicio0304 {
/*
4 - ​Solicite a unidade de medida inicial, a unidade de medida desejada para conversão e a
temperatura.
Exemplo:
Informe o nome da unidade térmica de origem: C
Informe o valor para ser: 32
Informe o nome da unidade térmica de destino: F
A temperatura convertida é de 89,6

Fórmulas:
Celsius para Kelvin: C + 273.15
Celsius para Fahrenheit: (C * 1.8000) + 32.00

Kelvin para Celsius: K - 273.15
Kelvin para Fahrenheit: (K - 273.15) * 1.8000 + 32.00

Fahrenheit para Celsius: (F - 32) / 1.800
Fahrenheit para Kelvin: ((F - 32) / 1.800) + 273.15
*/
    public static void main(String[] args) {
        
        String origem = JOptionPane.showInputDialog("Digite o nome da unidade térmica de origem:");
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor para ser convertido:"));
        String destino = JOptionPane.showInputDialog("Digite o nome da unidade térmica de destino:");
        double conversao = 0;

        if ((origem.equals("C")) && (destino.equals("F"))) {
            conversao = (numero * 1.8000) + 32.00;
        } else if ((origem.equals("C")) && (destino.equals("K"))) {
            conversao = numero + 273.15; 
        } else if ((origem.equals("K")) && (destino.equals("C"))) {
            conversao = numero - 273.15;
        } else if ((origem.equals("K")) && (destino.equals("F"))) {
            conversao = (numero - 273.15) * 1.8000 + 32.00;
        } else if ((origem.equals("F")) && (destino.equals("C"))) {
            conversao = (numero - 32) / 1.800;
        } else if ((origem.equals("F")) && (destino.equals("K"))) {
            conversao = (numero - 32) / 1.800 + 273.15;
        }
        JOptionPane.showMessageDialog(null, "A temperatura convertida é de: " + conversao);
    }
}