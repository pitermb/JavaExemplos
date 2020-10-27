import javax.swing.JOptionPane;

public class ExemploJOptionPaneInput {
	
	public static void main(String [] args) {

		String nome = JOptionPane.showInputDialog("Digite o seu nome");
		String sobrenome = JOptionPane.showInputDialog("Digite o seu sobrenome");
		String nomecompleto = nome + " " + sobrenome;

		JOptionPane.showMessageDialog(null, nomecompleto);

	}

}