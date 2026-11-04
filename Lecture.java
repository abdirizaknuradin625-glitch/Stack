abstract class Lecture {

    private String lectureId;
    private String lectureName;

    public Lecture(String lectureId, String lectureName) {
        this.lectureId = lectureId;
        this.lectureName = lectureName;
    }

    public String getLectureId() {
        return lectureId;
    }

    public String getLectureName() {
        return lectureName;
    }

    public abstract double calculateSalary();

    public abstract void displayInformation();
}

class FullLecture extends Lecture {

    private double salary;
    private double researchAllowance;

    public FullLecture(String lectureId, String lectureName,
                       double salary, double researchAllowance) {
        super(lectureId, lectureName);
        this.salary = salary;
        this.researchAllowance = researchAllowance;
    }

    @Override
    public double calculateSalary() {
        return salary + researchAllowance;
    }

    @Override
    public void displayInformation() {
        System.out.println("Lecturer Type: Full-Time");
        System.out.println("Lecturer ID: " + getLectureId());
        System.out.println("Lecturer Name: " + getLectureName());
        System.out.println("Basic Salary: $" + salary);
        System.out.println("Research Allowance: $" + researchAllowance);
        System.out.println("Total Salary: $" + calculateSalary());
    }
}

// Part-Time Lecturer
class PartTimeLecture extends Lecture {

    private double teachingHours;
    private double hourlyRate;

    public PartTimeLecture(String lectureId, String lectureName,
                           double teachingHours, double hourlyRate) {
        super(lectureId, lectureName);
        this.teachingHours = teachingHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return teachingHours * hourlyRate;
    }

    @Override
    public void displayInformation() {
        System.out.println("Lecturer Type: Part-Time");
        System.out.println("Lecturer ID: " + getLectureId());
        System.out.println("Lecturer Name: " + getLectureName());
        System.out.println("Teaching Hours: " + teachingHours);
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Total Salary: $" + calculateSalary());
    }
}

