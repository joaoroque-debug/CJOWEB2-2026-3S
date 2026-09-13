import java.util.ArrayList;
import java.util.Scanner;

public class App {

    private static Scanner scanner = new Scanner(System.in);

    public static int menu() {

        System.out.println("\n===== CARRINHO DE COMPRAS =====");
        System.out.println("1. Adicionar item ao carrinho");
        System.out.println("2. Exibir detalhes do carrinho");
        System.out.println("3. Exibir valor total da compra");
        System.out.println("4. Limpar carrinho");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");

        return scanner.nextInt();
    }

    public static void main(String[] args) {

        ArrayList<CartItem> cart = new ArrayList<>();
        CartManager manager = new CartManager();

        int option;

        do {

            option = menu();

            scanner.nextLine();

            switch (option) {

                case 1:

                    System.out.print("Digite o nome do produto: ");
                    String productName = scanner.nextLine();

                    System.out.print("Digite o preço unitário: ");
                    double unitPrice = scanner.nextDouble();

                    System.out.print("Digite a quantidade: ");
                    int quantity = scanner.nextInt();

                    CartItem item = new CartItem(
                        productName,
                        unitPrice,
                        quantity
                    );

                    manager.save(cart, item);

                    System.out.println("Item adicionado ao carrinho!");

                    break;

                case 2:

                    System.out.println("\n===== DETALHES DO CARRINHO =====");

                    manager.showCart(cart);

                    break;

                case 3:

                    double total = manager.total(cart);

                    System.out.println("\nValor total da compra: R$ " + total);

                    break;

                case 4:

                    manager.clear(cart);

                    System.out.println("Carrinho limpo com sucesso!");

                    break;

                case 5:

                    System.out.println("Programa encerrado.");

                    break;

                default:

                    System.out.println("Opção inválida.");
            }

        } while (option != 5);

        scanner.close();
    }
}