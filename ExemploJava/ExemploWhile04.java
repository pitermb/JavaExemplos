import javax.swing.JOptionPane;
public class ExemploWhile04{
	public static void main(String[] args) {
		int opcao = JOptionPane.showConfirmDialog(null,
			"Deseja cadastrar?", "Aviso", JOptionPane.YES_NO_OPTION);
		int contador = 0;
		double maiorimc = Double.MIN_VALUE, menorimc = Double.MAX_VALUE;
		String nomemaiorimc = "", nomemenorimc = "";
		while (opcao == JOptionPane.YES_OPTION){
			String paciente = JOptionPane.showInputDialog(
				"Digite o nome:");
			double altura = Double.parseDouble(JOptionPane.
				showInputDialog("Digite a altura:"));
			double peso = Double.parseDouble(JOptionPane.
				showInputDialog("Digite o peso"));
			double imc = peso / (altura * altura);
			if(imc > maiorimc){
				maiorimc = imc;
				nomemaiorimc = paciente;
			}
			if(imc < menorimc){
				menorimc = imc;
				nomemenorimc = paciente;
			}
			JOptionPane.showMessageDialog(null, " IMC: " + imc);
			opcao = JOptionPane.showConfirmDialog(null, 
				"Deseja cadastrar mais um paciente?", "Aviso",
				JOptionPane.YES_OPTION);
			contador = contador + 1;
		}
		JOptionPane.showMessageDialog(null, 
			"Quantidade de pacientes atendidos: " + contador +
			"\n" + nomemaiorimc + " tem o maior IMC: " + maiorimc +
			"\n" + nomemenorimc + " tem o menor IMC: " + menorimc);
	}
}