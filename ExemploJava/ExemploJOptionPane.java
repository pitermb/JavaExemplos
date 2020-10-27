import javax.swing.JOptionPane;

public class ExemploJOptionPane {
	
	public static void main(String[] args){

		JOptionPane.showMessageDialog(null, 
			"Olá Mundo",
			"Título da caixa",
			JOptionPane.PLAIN_MESSAGE);

		JOptionPane.showMessageDialog(null,
			"Seja bem vindo ao nosso sistema",
			"Título da caixa",
			JOptionPane.WARNING_MESSAGE);
		/*
		WARNING_MESSAGE
		ERROR_MESSAGE
		PLAIN_MESSAGE
		INFORMATION_MESSAGE
		QUESTION_MESSAGE
		*/
	}

}