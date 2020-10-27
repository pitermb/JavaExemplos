public class Exercicio01 {
/* 
1 -​ Desenvolver um algoritmo que armazene as seguintes informações:
➔ nome recebe "Porco";
➔ peso recebe 50.39kg;
➔ altura recebe 1.30kg;
➔ idade recebe 1;
➔ quantidade roncadas recebe 381272;
➔ possuo brinco recebe verdadeiro;
➔ valor sem nenhum valor;

Após isto apresentar o valor das variáveis através do System.out.println.
Implemente os seguintes itens:

➔ Inicialize a variável valor;
➔ Altere o valor de todas as variáveis.
➔ Incrementar em 10 a variável valor;
➔ Apresentar as variáveis novamente.
➔ Incrementar um na variável quantidade roncadas;
➔ Incremente um na variável de peso;
➔ Decrementar dois na variável quantidade roncadas;
➔ Apresentar as variáveis novamente.
*/
    public static void main(String[] args) {
        String nome = "Porco";
        double peso = 50.39, altura = 1.30;
        double valor;
        int idade = 1, quantidaderoncadas = 381272;
        boolean brinco = true;
            System.out.println(nome + " contém:");
            System.out.println("Peso: " + peso);
            System.out.println("Altura: " + altura);  
            System.out.println("Idade: " + idade); 
            System.out.println("Quantidades roncadas: " + quantidaderoncadas);
            System.out.println("Brinco: " + brinco);
        
            System.out.println("");
        valor = 3;
        
        nome = "Javali";
        peso = 72.50;
        altura = 1.50;
        idade = 9;
        quantidaderoncadas = 504523;
        brinco = false;

        valor = valor + 10;
        quantidaderoncadas = quantidaderoncadas + 1;
        peso = peso + 1;
        quantidaderoncadas = quantidaderoncadas - 2;
            System.out.println("Novo nome: " + nome);
            System.out.println("Nova idade: " + idade);
            System.out.println("Nova altura: " + altura);        
            System.out.println("Novo valor: " + valor);
            System.out.println("Nova quantidade roncada: " + quantidaderoncadas);
            System.out.println("Novo peso: " + peso);
    }
}