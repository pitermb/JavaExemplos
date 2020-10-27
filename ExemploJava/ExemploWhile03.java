import javax.swing.JOptionPane;
public class ExemploWhile03{
	public static void main(String[] args) {
		int quantidadedesejada = Integer.parseInt(
			JOptionPane.showInputDialog(
				"Digite a quantidade desejada:"));
		int atual = 0;
		double total = 0;
		while (atual < quantidadedesejada){
			String nome = JOptionPane.showInputDialog("Dgite o nome:");
			int quantidade = Integer.parseInt(
				JOptionPane.showInputDialog("Digite a quantidade:"));
			double preco = Double.parseDouble(
				JOptionPane.showInputDialog("Digite o preço:"));
			double precopedido = quantidade * preco;
			JOptionPane.showMessageDialog(null, "Preço pedido: "
				+ precopedido);
			total = total + precopedido;
			atual = atual + 1;
			System.out.println(nome);
		}
		JOptionPane.showMessageDialog(null, "Total pedido: " + total);
	}
}