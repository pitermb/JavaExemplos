import javax.swing.JOptionPane;

public class ExemploEstruturaCondicional03 {
	
	public static void main(String[] args) {
		
		String categoria = JOptionPane.showInputDialog(null, "Categoria do filme");
		//String se compara com EQUALS
		double preco1 = 0;
		if(categoria.equals("Ação")){
			preco1 = 7;
		}else if(categoria.equals("Terror")){
			preco1 = 5.99;
		}else if(categoria.equals("Fantasia")){
			preco1 = 10;
		}else{
			preco1 = 3;
		}

		String categoria2 = JOptionPane.showInputDialog("Categoria do segundo filme");
		double preco2 = 0;
		if(categoria2.equals("Ação")){
			preco2 = 7.00;
		}else if(categoria2.equals("Terror")){
			preco2 = 5.99;
		}else if(categoria2.equals("Fantasia")){
			preco2 = 10.00;
		}else {
			preco2 = 3.00;
		}

		double total = preco1 + preco2;
		JOptionPane.showMessageDialog(null,
			"Filme " + categoria + ": " + preco1 +
			"\nFilme " + categoria2 + ": " + preco2 +
			"\nTotal: " + total);
	}
}