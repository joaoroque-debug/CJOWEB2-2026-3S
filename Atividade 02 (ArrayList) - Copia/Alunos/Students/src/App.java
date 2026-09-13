import java.util.ArrayList;
import java.util.Scanner;

public class App {

    private static Scanner scanner = new Scanner(System.in);

    public static int menu() {

        System.out.println("\n===== SISTEMA DE ALUNOS =====");
        System.out.println("1. Cadastrar aluno");
        System.out.println("2. Exibir alunos aprovados");
        System.out.println("3. Exibir média da turma");
        System.out.println("4. Remover aluno por prontuário");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");

        return scanner.nextInt();
    }

    public static void main(String[] args) throws Exception {

        ArrayList<students> students = new ArrayList<>();
        ManagerStudents manager = new ManagerStudents();

        int option;

        do {

            option = menu();

            scanner.nextLine();

            switch (option) {

                case 1:

                    System.out.print("Digite o prontuário: ");
                    String registration = scanner.nextLine();

                    System.out.print("Digite o nome: ");
                    String name = scanner.nextLine();

                    System.out.print("Digite a nota: ");
                    double grade = scanner.nextDouble();

                    students data = new students(
                        registration,
                        name,
                        grade
                    );

                    manager.save(students, data);

                    System.out.println("Aluno cadastrado com sucesso!");

                    break;

                case 2:

                    System.out.println("\n===== ALUNOS APROVADOS =====");

                    manager.approved(students);

                    break;

                case 3:

                    double average = manager.average(students);

                    System.out.println("\nMédia da turma: " + average);

                    break;

                case 4:

                    System.out.print("Digite o prontuário do aluno: ");
                    String registrationDelete = scanner.nextLine();

                    boolean removed = manager.delete(
                        students,
                        registrationDelete
                    );

                    if (removed) {
                        System.out.println("Aluno removido com sucesso!");
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }

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