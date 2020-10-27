import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ExemploFor04 {
    public static void main(String[] args) {
        for(int i = 0; i < 3; i = i + 1){
            String nome = JOptionPane.
            showInputDialog("Digite o nome:").trim();
            while (nome.length() < 3 || nome.length() > 30) {
                nome = JOptionPane.
                showInputDialog("Nome deve conter entre 3 e 30 caracteres.\nDigite o nome:").trim();
            }
            String precostring = JOptionPane.
                showInputDialog("Digite o preço:");
            precostring = precostring
                .replace("R$", "")
                .replace(" ", "")
                .replace(".", "")
                .replace(",", ".").trim();
            double preco = Double.parseDouble(precostring);
            while (preco <= 0){
                precostring = JOptionPane.
                showInputDialog("Preço deve ser maior que zero.\nDigite o preço:");
                precostring = precostring
                    .replace("R$", "")
                    .replace(" ", "")
                    .replace(".", "")
                    .replace(",", ".").trim();
                preco = Double.parseDouble(precostring);
            }
            int quantidade = Integer.parseInt(JOptionPane.
                showInputDialog("Digite a quantidade:"));
            while (quantidade < 1 || quantidade > 25) {
                quantidade = Integer.parseInt(JOptionPane.
                showInputDialog("Quantidade deve ser entre 1 e 25 produtos.\nDigite a quantidade"));
            }
            double total = quantidade * preco;
            JOptionPane.showMessageDialog(null, "Total: R$ " + 
                new DecimalFormat("#####.##").format(total).replace(".", ","));
        }        
    }
}