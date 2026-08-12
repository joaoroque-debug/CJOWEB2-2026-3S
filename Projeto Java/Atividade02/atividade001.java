import javax.swing.JOptionPane;

public class atividade001 {
    public static void main(String[] args) {
        int age = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade = "));

        if(age >= 18){
            JOptionPane.showMessageDialog(null, "Bem vindo ao sistema !");
        }else{
            JOptionPane.showConfirmDialog(null, "Você não tem idade suficiente para acessar esse site.");
        }
    }
    
}
