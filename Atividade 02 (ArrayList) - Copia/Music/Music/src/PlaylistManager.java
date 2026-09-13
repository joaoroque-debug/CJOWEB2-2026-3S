import java.util.ArrayList;

public class PlaylistManager {

    public boolean save(ArrayList<Music> playlist, Music music) {

        if (music != null) {
            playlist.add(music);
            return true;
        }

        return false;
    }

    public Music search(ArrayList<Music> playlist, String title) {

        for (Music music : playlist) {

            if (music.getTitle().equals(title)) {
                return music;
            }
        }

        return null;
    }

    public boolean delete(ArrayList<Music> playlist, String title) {

        for (int i = 0; i < playlist.size(); i++) {

            Music music = playlist.get(i);

            if (music.getTitle().equals(title)) {
                playlist.remove(i);
                return true;
            }
        }

        return false;
    }

    public int totalDuration(ArrayList<Music> playlist) {

        int total = 0;

        for (Music music : playlist) {
            total += music.getDuration();
        }

        return total;
    }

    public void showPlaylist(ArrayList<Music> playlist) {

        if (playlist.isEmpty()) {
            System.out.println("A playlist está vazia.");
            return;
        }

        for (Music music : playlist) {
            System.out.println(music);
        }

        int total = totalDuration(playlist);

        int minutes = total / 60;
        int seconds = total % 60;

        System.out.println(
            "Tempo total da playlist: " +
            minutes + " minutos e " +
            seconds + " segundos"
        );
    }
}