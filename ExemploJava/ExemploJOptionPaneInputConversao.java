import javax.swing.JOptionPane;

public class ExemploJOptionPaneInputConversao{

	public static void main(String[] args){

		//String texto = JOptionPane.showInputDialog("Digite o número");
		//int numero = Integer.parseInt(texto);
		int numero1 = Integer.parseInt(
						JOptionPane.showInputDialog("Digite o número"));
		int numero2 = Integer.parseInt(
						JOptionPane.showInputDialog("Digite o número 2"));

		int soma = numero1 + numero2;
		JOptionPane.showMessageDialog(null, "Soma: " + soma);

	}

}