public class ExemploConversao{
	
	public static void main(String[] args){

		String texto = "2";
		int numero = Integer.parseInt("2");

		double salario = Double.parseDouble("20000.99");

		boolean empregado = Boolean.parseBoolean("false");

		System.out.println("Texto: " + texto);
		System.out.println("Número: " + numero);
		System.out.println("Salário: " + salario);
		System.out.println("Empregado: " + empregado);

	}
}