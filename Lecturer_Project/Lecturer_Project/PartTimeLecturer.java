public class PartTimeLecturer extends Lecturer {
    private double teachingHours;
    private double hourlyRate;

    public PartTimeLecturer(String id, String name, double hours, double rate) {
        super(id, name);
        teachingHours = hours;
        hourlyRate = rate;
    }

    public double getTeachingHours() { return teachingHours; }
    public void setTeachingHours(double value) { teachingHours = value; }
    public double getHourlyRate() { return hourlyRate; }
    public void setHourlyRate(double value) { hourlyRate = value; }

    @Override
    public double calculateSalary() {
        return teachingHours * hourlyRate;
    }

    @Override
    public void displayInformation() {
        System.out.println("Part-Time Lecturer");
        System.out.println("ID: " + getLecturerId());
        System.out.println("Name: " + getName());
        System.out.println("Teaching Hours: " + teachingHours);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Total Salary: " + calculateSalary());
    }
}
