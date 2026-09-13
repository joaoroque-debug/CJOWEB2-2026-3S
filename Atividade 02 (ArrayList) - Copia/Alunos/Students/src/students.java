public class students {

    private String registration;
    private String name;
    private double grade;

    public students(String registration, String name, double grade) {
        this.registration = registration;
        this.name = name;
        this.grade = grade;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Prontuário: " + registration +
               " | Nome: " + name +
               " | Nota: " + grade;
    }
}