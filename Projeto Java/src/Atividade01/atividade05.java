import javax.swing.JOptionPane;

public class atividade05 {
    public static void main(String[] args) {
        float dolar = Float.parseFloat(JOptionPane.showInputDialog("Informe quantos dolares você tem = "));
        float cotacao = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da cotação do dolar = "));

        float real = dolar * cotacao;

        JOptionPane.showMessageDialog(null, String.format("Você tem %.2f reais", real));
}

}