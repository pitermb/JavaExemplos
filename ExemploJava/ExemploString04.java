public class ExemploString04 {
    public static void main(String[] args) {
        String texto = "League of Legends com Annie";
        System.out.println(texto);

        texto = texto.toLowerCase();
        System.out.println(texto);

        texto = texto.toUpperCase();
        System.out.println(texto);
        
        if (texto.toLowerCase().contains("annie")) {
            System.out.println("Contém Annie");
        }else{
            System.out.println("Não contém Annie");
        }
    }
}