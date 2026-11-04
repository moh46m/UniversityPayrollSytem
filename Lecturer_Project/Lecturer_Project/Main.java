public class Main {
    public static void main(String[] args) {
        UniversityPayrollSystem system = new UniversityPayrollSystem();

        system.addLecturer(new FullTimeLecturer("L001", "Ahmed", 1500, 300, 200));
        system.addLecturer(new FullTimeLecturer("L002", "Mohamed", 1800, 400, 300));
        system.addLecturer(new PartTimeLecturer("L003", "Ali", 40, 15));
        system.addLecturer(new PartTimeLecturer("L004", "Hassan", 30, 20));

        System.out.println("ALL LECTURERS");
        system.displayAllLecturers();

        System.out.println("Full-Time Payroll: " + system.calculateFullTimePayroll());
        System.out.println("Part-Time Payroll: " + system.calculatePartTimePayroll());

        Lecturer highest = system.findHighestPaidLecturer();
        if (highest != null) {
            System.out.println("Highest Paid Lecturer:");
            highest.displayInformation();
        }

        System.out.println("Lecturers earning more than 2000:");
        system.displayLecturersAbove(2000);
    }
}
