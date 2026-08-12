import java.util.Scanner;

public class atividade08 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a altura do degrau em cm = ");
        float step = scan.nextFloat();
        System.out.print("Informe a altura que deseja subir em metros = ");
        float height = scan.nextFloat();

        float tall = step / 100;
        float tall1 = height / tall;

        System.out.printf("Você precisa subir " + tall1 + " para chegar a altura desejada");
        scan.close();


    }
}
