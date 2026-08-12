import javax.swing.JOptionPane;

public class Atividade01 {
   public Atividade01() {
   }

   public static void main(String[] args) throws Exception{
        int cat_foodg = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de ração em gramas, dada diariamente ao seu gato: "));
        int cat_foodkg = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos de ração em kg, que há no saco de ração: "));

        int over = (cat_foodkg * 1000 - cat_foodg * 5) / 1000;

        JOptionPane.showMessageDialog(null,"Depois de 5 dias, restará: " + over + " kg de ração.");

   }


}