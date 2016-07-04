import java.util.ArrayList;
import java.util.Iterator;


/**
 * Created by Leha on 04.07.2016.
 */
public class BackToSchool {
    public static void main(String[] args) {
        ArrayList<Person> someHumansList = new ArrayList<>();

        Person bob = new Person("Coach Bob", 27, "M");
        Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");

        someHumansList.add(bob);
        someHumansList.add(lynne);
        someHumansList.add(mrJava);
        someHumansList.add(ima);
        for (int i = 0; i< someHumansList.size(); i++) {
            System.out.println(someHumansList.get(i));
        }
    }
}

