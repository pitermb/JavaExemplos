public class ExemploFor03 {

    public static void main(String[] args) throws InterruptedException {
        for(int i = 10; i >= 0; i = i - 1){
            for(int j = 59; j >= 0; j = j - 1){
                Thread.sleep(1000);
                System.out.println(i + ":" + j);
            }
        }  
    }
}