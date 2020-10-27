import javax.swing.JOptionPane;

public class ExemploEstruturaCondicional02 {
	
	public static void main(String[] args) {
		
		String categoria = JOptionPane.showInputDialog(null, "Categoria do filme");
		//String se compara com EQUALS
		if(categoria.equals("Ação")){
			JOptionPane.showMessageDialog(null, "R$ 7,00");
		}else if(categoria.equals("Terror")){
			JOptionPane.showMessageDialog(null, "R$ 5,99");
		}else if(categoria.equals("Fantasia")){
			JOptionPane.showMessageDialog(null, "R$ 10,00");
		}else{
			JOptionPane.showMessageDialog(null, "R$ 3,00");
		}
	}
}