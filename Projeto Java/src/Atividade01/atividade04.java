import java.util.Scanner;

public class atividade04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor total da prestação = ");
        float prest = scanner.nextFloat();

        float New_valor = prest / 5;

        System.out.print("O valor de cada prestação ficara = " + New_valor);
        scanner.close();

    }  
}