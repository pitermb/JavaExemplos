import javax.swing.JOptionPane;
public class ExemploWhile01 {
	public static void main(String[] args) {
		int atual = 0;
		while(atual < 10){
			JOptionPane.showMessageDialog(null, atual);
			atual = atual + 1;
		}
	}
}