import javax.swing.JOptionPane;
public class ExemploWhile02 {
	public static void main(String[] args) {
		int atual = 0;
		int soma = 0;
		while(atual < 4){
			String nome = JOptionPane.showInputDialog("[" + (atual + 1) + "/4] - Digite o seu nome");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
			atual = atual + 1;
			soma = soma + idade;
			System.out.println(nome);
		}
		double media = (double) soma / 4;
		JOptionPane.showMessageDialog(null, "Soma: " + soma + "\nMédia: " + media);
	}
}