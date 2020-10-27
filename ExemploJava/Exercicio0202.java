import javax.swing.JOptionPane;

public class Exercicio0202 {
/*
2 - ​Desenvolver um algoritmo que solicite as informações abaixo:
➔ código produto 1
➔ nome produto 1
➔ quantidade do produto 1
➔ valor do produto 1
➔ código produto 2
➔ nome produto 2
➔ quantidade do produto 2
➔ valor do produto 2
➔ código produto 3
➔ nome produto 3
➔ quantidade do produto 3
➔ valor do produto 3
➔ % de desconto

Apresentar ao final da seguinte forma os três produtos:

Código: 23
Nome: Maçã
Valor: R$ 2.30
Quantidade: 4
Total: R$ 9.20

Código: 24
Nome: Pera
Valor: R$ 2.00
Quantidade: 3
Total: R$ 6.00

Código: 25
Nome: Abacaxi
Valor: R$ 1.00
Quantidade: 10
Total: R$ 10.00

$ Desconto: 20
Total da compra: R$ 25.20
Total com 20% de desconto: R$ 20.16
*/
    public static void main(String[] args) {
    
        int codigoproduto1 = Integer.parseInt(JOptionPane.showInputDialog("Digite código do produto 1: "));
        String nomeproduto1 = JOptionPane.showInputDialog("Digite o nome do produto 1: ");
        int quantidadeproduto1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto 1: "));
        double valorproduto1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto 1: "));
        double total1 = quantidadeproduto1 * valorproduto1;

        int codigoproduto2 = Integer.parseInt(JOptionPane.showInputDialog("Digite código do produto 2: "));
        String nomeproduto2 = JOptionPane.showInputDialog("Digite o nome do produto 2: ");
        int quantidadeproduto2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto 2: "));
        double valorproduto2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto 2: "));
        double total2 = quantidadeproduto2 * valorproduto2;

        int codigoproduto3 = Integer.parseInt(JOptionPane.showInputDialog("Digite código do produto 3: "));
        String nomeproduto3 = JOptionPane.showInputDialog("Digite o nome do produto 3: ");
        int quantidadeproduto3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto 3: "));
        double valorproduto3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto 3: "));
        double total3 = quantidadeproduto3 * valorproduto3;

        double desconto = Double.parseDouble(JOptionPane.showInputDialog("Digite a % de desconto: "));

        double valortotal = total1 + total2 + total3;
        double valordesconto = (valortotal * desconto) / 100;
        double valortotalcomD = valortotal - valordesconto;

        JOptionPane.showMessageDialog(null, 
        "Código: " + codigoproduto1 + 
        "\nNome: " + nomeproduto1 +
        "\nValor: " + valorproduto1 + 
        "\nQuantidade: " + quantidadeproduto1 +
        "\nTotal: " + total1 + "\n" +
        "\nCódigo: " + codigoproduto2 + 
        "\nNome: " + nomeproduto2 +
        "\nValor: " + valorproduto2 + 
        "\nQuantidade: " + quantidadeproduto2 +
        "\nTotal: " + total2 + "\n" +
        "\nCódigo: " + codigoproduto3 + 
        "\nNome: " + nomeproduto3 +
        "\nValor: " + valorproduto3 + 
        "\nQuantidade: " + quantidadeproduto3 +
        "\nTotal: " + total3 + "\n" +
        "\n% de desconto: " + desconto + "\n" +
        "\nTotal da compra: " + valortotal +
        "\nTotal da compra com desconto: " + valortotalcomD);
    }
}