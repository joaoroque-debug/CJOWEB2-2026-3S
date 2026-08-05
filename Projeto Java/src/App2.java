import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int number1, number2, result;

        System.out.print("Digita o primeiro valor = ");
        number1 = scanner.nextInt();

        System.out.print("Digita o segundo valor = ");
        number2 = scanner.nextInt();
        
        result = number1 + number2;

        System.out.printf("Soma = " + result);
        scanner.close();
    }
}
