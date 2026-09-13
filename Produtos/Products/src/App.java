import java.util.ArrayList;
import java.util.Scanner;

public class App {

    private static Scanner scanner = new Scanner(System.in);

    public static int menu() {

        System.out.println("\n===== SISTEMA DE PRODUTOS =====");
        System.out.println("1. Adicionar produto");
        System.out.println("2. Consultar produto por código");
        System.out.println("3. Atualizar quantidade em estoque");
        System.out.println("4. Listar produtos com estoque baixo");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");

        return scanner.nextInt();
    }

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();
        ProductManager manager = new ProductManager();

        int option;

        do {

            option = menu();

            scanner.nextLine();

            switch (option) {

                case 1:

                    System.out.print("Digite o código do produto: ");
                    int code = scanner.nextInt();

                    scanner.nextLine();

                    System.out.print("Digite o nome do produto: ");
                    String name = scanner.nextLine();

                    System.out.print("Digite a quantidade em estoque: ");
                    int quantity = scanner.nextInt();

                    Product product = new Product(
                        code,
                        name,
                        quantity
                    );

                    boolean saved = manager.save(products, product);

                    if (saved) {
                        System.out.println(
                            "Produto cadastrado com sucesso!"
                        );
                    } else {
                        System.out.println(
                            "Código já cadastrado. Produto não inserido."
                        );
                    }

                    break;

                case 2:

                    System.out.print("Digite o código do produto: ");
                    int searchCode = scanner.nextInt();

                    Product foundProduct = manager.search(
                        products,
                        searchCode
                    );

                    if (foundProduct != null) {

                        System.out.println(
                            "Nome: " + foundProduct.getName()
                        );

                        System.out.println(
                            "Quantidade em estoque: " +
                            foundProduct.getQuantity()
                        );

                    } else {

                        System.out.println("Produto não encontrado.");
                    }

                    break;

                case 3:

                    System.out.print("Digite o código do produto: ");
                    int updateCode = scanner.nextInt();

                    System.out.print(
                        "Digite a nova quantidade em estoque: "
                    );
                    int newQuantity = scanner.nextInt();

                    boolean updated = manager.updateQuantity(
                        products,
                        updateCode,
                        newQuantity
                    );

                    if (updated) {
                        System.out.println(
                            "Quantidade atualizada com sucesso!"
                        );
                    } else {
                        System.out.println("Produto não encontrado.");
                    }

                    break;

                case 4:

                    System.out.println(
                        "\n===== PRODUTOS COM ESTOQUE BAIXO ====="
                    );

                    manager.showLowStock(products);

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