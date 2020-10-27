import javax.swing.JOptionPane;
public class ExemploEstruturaCondicional04 {
	public static void main(String[] args) {
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
		//Bebê = 0..3
		//Criança = 4..11
		//Adolescente = 12..17
		//Adulto = 18..59
		//Idoso = 60..infinito
		String faixaetaria = "";
		if((idade >= 0) && (idade <= 3)){
			faixaetaria = "Bebê";
		}else if((idade >= 4) && (idade <= 11)){
			faixaetaria = "Criança";
		}else if((idade >= 12) && (idade <= 17)){
			faixaetaria = "Adolescente";
		}else if((idade >= 18) && (idade <= 59)){
			faixaetaria = "Adulto";
		}else if(idade >= 60){
			faixaetaria = "Idoso";
		}
		JOptionPane.showMessageDialog(null, "Faixa etária: " + faixaetaria);
	}
}