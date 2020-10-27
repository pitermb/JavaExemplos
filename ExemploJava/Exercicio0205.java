import javax.swing.JOptionPane;

public class Exercicio0205 {
/*
5 - ​Desenvolver um algoritmo que solicite os seguintes itens:
➔ Valor da luz;
➔ Valor da água;
➔ Valor da NET;
➔ Valor da Vivo;
➔ Valor da Oi;
➔ Valor do IPTU;
➔ Valor do IPVA;
➔ Valor do licenciamento do carro;
➔ Valor do licenciamento do Iate;
➔ Valor do seguro do carro;
➔ Valor do seguro da casa;
➔ Valor do seguro Iate;
➔ Valor de combustível do carro;
➔ Valor de combustível do Iate.

Após isto, apresente as seguintes informações:
● Valor das contas de Telefonia;
● Valor dos impostos;
● Valor dos seguros;
● Valor dos combustíveis;
● Valor das demais contas.
● Valor Total das contas.
*/   
    public static void main(String[] args) {
        
        double luz = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da conta de luz:"));
        double agua = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da conta da água:"));
        double net = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da conta da NET:"));
        double vivo = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da conta da Vivo:"));
        double oi = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da conta da Oi:"));
        double IPTU = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da conta do IPTU:"));
        double IPVA = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da conta do IPVA:"));
        double licenCarro = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do licenciamento do carro:"));
        double licenIate = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do licenciamento do iate:"));
        double seguroCarro = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do seguro do carro:"));
        double seguroCasa = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do seguro da casa:"));
        double seguroIate = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do seguro do iate:"));
        double combusCarro = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do combustivel do carro:"));
        double combusIate = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do combustivel do iate:"));

        double contas = net + vivo + oi;
        double impostos = luz + agua;
        double seguros = seguroCarro + seguroCasa + seguroIate;
        double combustivel = combusCarro + combusIate;
        double demaiscontas = licenCarro + licenIate + IPTU + IPVA;
        double valortotal = contas + impostos + seguros + combustivel + demaiscontas;

        JOptionPane.showMessageDialog(null, "Valor das contas de telefonia: " + contas
        + "\nValor dos impostos: " + impostos
        + "\nValor dos seguros: " + seguros
        + "\nValor dos combustiveis: " + combustivel
        + "\nValor das demais contas: " + demaiscontas
        + "\nValor total das contas: " + valortotal);
    }
}