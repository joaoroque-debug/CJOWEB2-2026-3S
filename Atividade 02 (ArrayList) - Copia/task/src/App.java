

import java.util.Scanner;

public class App {

    private static Scanner scanner = new Scanner(System.in);
    private static ListTask list = new ListTask();
    
    public static int menu(){
        System.out.println("----------------------------------");
        System.out.println("--Sistema de Controle de Pessoas--");
        System.out.println("----------------------------------");
        System.out.println("---------MENU DE OPÇÕES-----------");
        System.out.println("----------------------------------");
        System.out.println("1 - Inserir");
        System.out.println("2 - Listar tarefas");
        System.out.println("3 - Remover");
        System.out.println("4 - Sair");
        System.out.println("----------------------------------");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
     }
    

public static void insert(){

        System.out.println("Digite sua tarefa: ");
        String name_task = scanner.nextLine();

        int code;

        do {

            System.out.println("Digite o código dela: ");
            code = scanner.nextInt();

            if(list.codeExists(code)){
                System.out.println("Esse código já existe! Digite outro.");
            }

        } while(list.codeExists(code));

        scanner.nextLine();

        Task task = new Task(code, name_task);

        if(list.save(task)){
            System.out.println("Tarefa incluida!");
        }else{
            System.out.println("Erro!, tarefa não inclusa");
        }
}
    public static void delete(){
        System.out.println("Digite o código da tarefa: ");
            int code = scanner.nextInt();
        if(list.delete(code)){
            System.out.println("Código deletado com sucesso!");
        }else{
            System.out.println("Erro ao remover tarefa");
        }
    }


    public static void main(String[] args) throws Exception{
        int option;

        do{
            option = menu();
            scanner.nextLine();
            switch (option){
                case 1:
                    insert();
                    break;
                case 2:
                    System.out.println(list.getListask());
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    break; 
                default: 
                    System.out.println("Opção inválida. Tente novamente!");
                    break;
            }

            System.out.println("Pressione ENTER para continuar...");
            scanner.nextLine();
            
        }while( option != 4 );
    }
}


