import java.util.ArrayList;
import java.util.Scanner;

public class App {

    private static Scanner scanner = new Scanner(System.in);

    public static int menu() {

        System.out.println("\n===== PLAYLIST =====");
        System.out.println("1. Adicionar música");
        System.out.println("2. Buscar música por título");
        System.out.println("3. Remover música por título");
        System.out.println("4. Listar playlist e tempo total");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");

        return scanner.nextInt();
    }

    public static void main(String[] args) {

        ArrayList<Music> playlist = new ArrayList<>();
        PlaylistManager manager = new PlaylistManager();

        int option;

        do {

            option = menu();

            scanner.nextLine();

            switch (option) {

                case 1:

                    System.out.print("Digite o título da música: ");
                    String title = scanner.nextLine();

                    System.out.print("Digite o artista: ");
                    String artist = scanner.nextLine();

                    System.out.print("Digite a duração em segundos: ");
                    int duration = scanner.nextInt();

                    Music music = new Music(
                        title,
                        artist,
                        duration
                    );

                    manager.save(playlist, music);

                    System.out.println("Música adicionada à playlist!");

                    break;

                case 2:

                    System.out.print("Digite o título da música: ");
                    String searchTitle = scanner.nextLine();

                    Music foundMusic = manager.search(
                        playlist,
                        searchTitle
                    );

                    if (foundMusic != null) {
                        System.out.println(foundMusic);
                    } else {
                        System.out.println(
                            "A música não está na playlist."
                        );
                    }

                    break;

                case 3:

                    System.out.print("Digite o título da música: ");
                    String deleteTitle = scanner.nextLine();

                    boolean removed = manager.delete(
                        playlist,
                        deleteTitle
                    );

                    if (removed) {
                        System.out.println(
                            "Música removida com sucesso!"
                        );
                    } else {
                        System.out.println(
                            "A música não está na playlist."
                        );
                    }

                    break;

                case 4:

                    System.out.println("\n===== PLAYLIST =====");

                    manager.showPlaylist(playlist);

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