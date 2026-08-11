import java.util.Scanner;

public class atividade06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o valor do quilowatt de energia = ");
        float quilowatt = scan.nextFloat();

        System.out.print("Informe a quantida de quilowatt gasto = ");
        float spent = scan.nextFloat();

        float cost = quilowatt * spent;
        float desc = cost * (1 - 15 / 100.0f);

        System.out.printf("O valor de luz este mês fica %.2f pagando a vista recebe 15% de desconto, ficando no valor de %.2f" , cost , desc );
        scan.close();
    }
}
