import javax.swing.JOptionPane;
public class ExemploEstruturaCondicional05{
	public static void main(String[] args) {
		
		String opcao = JOptionPane.showInputDialog("Deseja apagar?");
		if((opcao.equals("sim")) || (opcao.equals("s"))){
			JOptionPane.showMessageDialog(null, "Arquivo apagado com sucesso");
		}else{
			JOptionPane.showMessageDialog(null, "Seu arquivo está salvo");
		}
	}
}