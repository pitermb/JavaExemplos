public class Exemplo02 {
	
	public static void main(String[] args){

		// String serve para armazenar texto
		String nome = "Piter";
		String sobrenome = "Merlo Bruner";

		String nomeCompleto = nome + " " + sobrenome;

		System.out.println("Nome: " + nomeCompleto);

		int numero1 = 10;
		int numero2 = 15;
		int soma = numero1 + numero2;

		System.out.println("Soma: " + soma);

		double valorhora = 20.30;
		int quantidadehoras = 160;

		double salario = valorhora * quantidadehoras;
		System.out.println("Salário: " + salario);

		boolean empregado = true;
		System.out.println("Empregado: " + empregado);

		char letra = 'a';
		System.out.println("Caracter: " + letra);

		/*
		Tipos primitivos: int, double, char, boolean
		Classe: String
		*/

	}

}