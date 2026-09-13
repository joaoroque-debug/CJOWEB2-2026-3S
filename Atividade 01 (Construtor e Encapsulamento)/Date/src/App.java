import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Date date = new Date(19, 9, 2001);

        int day = Integer.parseInt(
            JOptionPane.showInputDialog("Informe o dia: "));
                date.setDay(day);
            
        int month = Integer.parseInt(
            JOptionPane.showInputDialog("Informe o mês: "));
                date.setMonth(month);
            
        int year = Integer.parseInt(
            JOptionPane.showInputDialog("Informe o ano: "));
                date.setYear(year);
          

        JOptionPane.showMessageDialog(null, date);
    }

}
