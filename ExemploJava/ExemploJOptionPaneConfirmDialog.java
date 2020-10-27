import javax.swing.JOptionPane;
public class ExemploJOptionPaneConfirmDialog{
	public static void main(String[] args) {
		int escolha = JOptionPane.showConfirmDialog(
			null, "Deseja pagar?", "Título",
			JOptionPane.YES_NO_OPTION);
		if (escolha == JOptionPane.YES_OPTION){
			//APAGAR SYSTEM 32 DO SEU COMPUTADOR
			JOptionPane.showMessageDialog(null, "Registro apagado!");
		}else{
			JOptionPane.showMessageDialog(null, "Registro mantido!");
		}
	}
}