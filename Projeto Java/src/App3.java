import javax.swing.JOptionPane;


 //Interface grafica 


public class App3 {
    public static void main(String[] args) throws Exception {

        int number1, number2, result;

        number1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número = "));
        number2 = Integer.parseInt(JOptionPane.showInputDialog("Digite + um número = "));
        
        result = number1 + number2;

        JOptionPane.showMessageDialog(null, "Soma = " + result);
    }
}
