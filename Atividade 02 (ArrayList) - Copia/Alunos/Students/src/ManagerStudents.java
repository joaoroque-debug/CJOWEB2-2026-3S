import java.util.ArrayList;

public class ManagerStudents {

    public boolean save(ArrayList<students> students_table, students data) {

        if (data != null) {
            students_table.add(data);
            return true;
        }

        return false;
    }

    public void approved(ArrayList<students> students_table) {

        for (students data : students_table) {

            if (data.getGrade() >= 6.0) {
                System.out.println(data);
            }
        }
    }

    public double average(ArrayList<students> students_table) {

        if (students_table.isEmpty()) {
            return 0;
        }

        double sum = 0;

        for (students data : students_table) {
            sum += data.getGrade();
        }

        return sum / students_table.size();
    }

    public boolean delete(ArrayList<students> students_table, String registration) {

        for (int i = 0; i < students_table.size(); i++) {

            students data = students_table.get(i);

            if (data.getRegistration().equals(registration)) {
                students_table.remove(i);
                return true;
            }
        }

        return false;
    }
}