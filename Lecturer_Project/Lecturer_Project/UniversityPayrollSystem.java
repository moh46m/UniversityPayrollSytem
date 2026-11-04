import java.util.ArrayList;

public class UniversityPayrollSystem {
    private ArrayList<Lecturer> lecturers = new ArrayList<>();

    public void addLecturer(Lecturer lecturer) {
        lecturers.add(lecturer);
    }

    public void displayAllLecturers() {
        for (Lecturer lecturer : lecturers) {
            lecturer.displayInformation();
            System.out.println("----------------------");
        }
    }

    public double calculateFullTimePayroll() {
        double total = 0;
        for (Lecturer lecturer : lecturers) {
            if (lecturer instanceof FullTimeLecturer) {
                total += lecturer.calculateSalary();
            }
        }
        return total;
    }

    public double calculatePartTimePayroll() {
        double total = 0;
        for (Lecturer lecturer : lecturers) {
            if (lecturer instanceof PartTimeLecturer) {
                total += lecturer.calculateSalary();
            }
        }
        return total;
    }

    public Lecturer findHighestPaidLecturer() {
        if (lecturers.isEmpty()) {
            return null;
        }

        Lecturer highest = lecturers.get(0);
        for (Lecturer lecturer : lecturers) {
            if (lecturer.calculateSalary() > highest.calculateSalary()) {
                highest = lecturer;
            }
        }
        return highest;
    }

    public void displayLecturersAbove(double amount) {
        boolean found = false;
        for (Lecturer lecturer : lecturers) {
            if (lecturer.calculateSalary() > amount) {
                lecturer.displayInformation();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No lecturer found.");
        }
    }
}
