import javax.swing.JOptionPane;

public class ExemploJOptionPaneInputConversaoBoolean{

	public static void main(String[] args){

		boolean empregado = Boolean.parseBoolean(JOptionPane.showInputDialog("Empregado?"));
		JOptionPane.showMessageDialog(null, "Empregado: " + empregado);

	}

}