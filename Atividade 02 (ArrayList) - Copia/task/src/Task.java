

public class Task {
    private int code;
    private String titlle;

    public Task(int code, String titlle){
        this.code = code;
        this.titlle = titlle;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitlle() {
        return titlle;
    }

    public void setTitlle(String titlle) {
        this.titlle = titlle;
    }

        @Override
    public String toString() {
        return "Código: " + code + " -> Tarefa: " + titlle + "\n";
    }
    
}
