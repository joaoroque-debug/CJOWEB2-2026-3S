import javax.swing.JOptionPane;

public class atividade07 {
    public static void main(String[] args) {
        
        float weigth = Float.parseFloat(JOptionPane.showInputDialog("Informe seu peso = "));

        float more = weigth * ( 1 + 15 / 100.0f);
        float less = weigth * ( 1 - 20 / 100.0f);

        JOptionPane.showConfirmDialog(null, String.format("Se ganhar 15%% a mais você ficara com %.2f de peso, e se perder 20%% ficara com %.2f", more, less));
}           //%% MOSTRA PORCENTAGEM; 
    }

