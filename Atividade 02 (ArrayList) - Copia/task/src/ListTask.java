import java.util.ArrayList;
import java.util.List;

public class ListTask {

    private List<Task> listask;

    // constructor 
    public ListTask(){
        this.listask = new ArrayList<>();
    }

    //método para retornar a lista de tarefas
    public List<Task> getListask(){
        return listask;
    }

    // método para add/salvar task a lista
    public boolean save(Task tasks){
        if(tasks != null){
            listask.add(tasks);
            return true;
        }
        return false;
    }


    // verifica se o código já existe
    public boolean codeExists(int code){

        for(Task task : listask){

            if(task.getCode() == code){
                return true;
            }
        }

        return false;
    }

    public boolean delete(int code){
        for(Task task : listask){
            if(task.getCode() == code){ //usei assim porque to querendo achar pelo número / equals só funciona para string.
                listask.remove(task);
                return true;
            }
        
        }
    return false;
    }
    




















}
