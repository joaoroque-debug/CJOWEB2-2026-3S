import java.util.Scanner;

public class Atividade02 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Indique o custo do espetáculo: ");
        float cost = scanner.nextFloat();
        System.out.print("Indique o valor do ingresso: ");
        float how_much = scanner.nextFloat();

        int ingress = 0; 
        float sum = 0; 

        while (sum < cost) {
            sum += how_much;
            ingress++;
        }

        System.out.printf("Você vai precisar vender " + ingress + " para cobrir o custo do espetáculo.");
        scanner.close();
    }
}
