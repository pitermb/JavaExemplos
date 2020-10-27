import javax.swing.JOptionPane;
public class Exercicio0401{
/*
1 - ​Faça um programa que solicite os dados abaixo enquanto o nome for diferente de “sair”:
➔ Idade;
➔ Peso;
➔ Altura.
Apresentar ao final:
➔ Média das alturas;
➔ Média das idades;
➔ IMC da pessoa mais velha (peso / altura2)
➔ Nome e a idade da pessoa mais nova;
*/
	public static void main(String[] args) {
		int opcao = JOptionPane.showConfirmDialog(null,
			"Deseja inserir um nome?", "Aviso!", JOptionPane.YES_NO_OPTION);
        String nomevelhoimc = "", nomemenoridade = "";
        double velhoimc = Double.MIN_VALUE, menoridade = Double.MAX_VALUE, mediaidade = 0, mediaaltura = 0;
		int contador = 0;
		while (opcao == JOptionPane.YES_OPTION){
			String nome = JOptionPane.showInputDialog(
                "Digite o nome:");
            int idade = Integer.parseInt(JOptionPane.
                showInputDialog("Digite a idade:"));
			double altura = Double.parseDouble(JOptionPane.
				showInputDialog("Digite a altura:"));
			double peso = Double.parseDouble(JOptionPane.
				showInputDialog("Digite o peso:"));
            double imc = peso / (altura * altura); 
			if(imc > velhoimc){
				velhoimc = imc;
				nomevelhoimc = nome;
			}
			if(idade < menoridade){
				menoridade = idade;
				nomemenoridade = nome;
			}
			JOptionPane.showMessageDialog(null, " IMC: " + imc);
			opcao = JOptionPane.showConfirmDialog(null, 
				"Deseja cadastrar mais uma pessoa?", "Aviso!",
				JOptionPane.YES_OPTION);
            contador = contador + 1;
            mediaaltura = altura / contador;
            mediaidade = idade / contador;
		}
		JOptionPane.showMessageDialog(null, 
            "A média de altura é: " + mediaaltura +
            "\nA média de idade é: " + mediaidade +
			"\n" + nomevelhoimc + " é o mais velho e tem o maior IMC: " + velhoimc +
			"\n" + nomemenoridade + " tem a menor idade: " + menoridade);
	}
}