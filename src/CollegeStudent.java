/**
 * Created by Leha on 04.07.2016.
 */
public class CollegeStudent extends Student {

    private int year;
    private String major;

    public CollegeStudent(String name, int age, String gender, String idNumber, double gpa, int year, String major) {
        super(name, age, gender, idNumber, gpa);
        this.year = year;
        this.major = major;
    }

    public String toString() {
        return super.toString() + ", year: " + year + ", major: " + major;
    }
}
