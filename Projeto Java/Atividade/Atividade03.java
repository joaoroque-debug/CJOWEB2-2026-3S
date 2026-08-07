import javax.swing.JOptionPane;

public class Atividade03 {
    public static void main(String[] args) {
        float value = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor da diária: "));
        float discount = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor do desconto: "));

        float New_value = value * (1 - discount / 100);

    JOptionPane.showMessageDialog(null,String.format("O valor da diária com desconto = %.2f", New_value));
    }
    
}
