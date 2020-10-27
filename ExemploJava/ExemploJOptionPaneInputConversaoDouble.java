import javax.swing.JOptionPane;

public class ExemploJOptionPaneInputConversaoDouble{

	public static void main(String[] args){

		int quantidadehoras = Integer.parseInt(
			JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas"));

		double valorhora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor hora"));

		double salario = quantidadehoras * valorhora;
		JOptionPane.showMessageDialog(null, "Salário: " + salario);

	}

}