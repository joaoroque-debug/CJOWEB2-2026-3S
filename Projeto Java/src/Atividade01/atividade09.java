import javax.swing.JOptionPane;

public class atividade09 {
    public static void main(String[] args) {
        float sal = Float.parseFloat(JOptionPane.showInputDialog("Informe seu salário = "));
        float cont1= Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da primeira conta = "));
        float cont2= Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da segunda conta conta = "));

        float nv_cont1 = cont1 * (1 + 2 / 100.0f );
        float nv_cont2 = cont2 * (1 + 2 / 100.0f );

        float res = sal - (nv_cont1 + nv_cont2);

        if (res < 0 ){
            JOptionPane.showMessageDialog(null, "Você ficou com um saldo negativo de = " + res);
        }else{
            JOptionPane.showMessageDialog(null, "Você ficou com um saldo positivo de = " + res);
        }
    }
}
