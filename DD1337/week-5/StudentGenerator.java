import java.util.ArrayList;
import java.util.Random;

public class StudentGenerator {
    private ArrayList<Student> students =  new ArrayList<Student>();
    private Random r = new Random();

    StudentGenerator(){
        Student s1 = new Student("Hummam");
        Student s2 = new Student("George");
        Student s3 = new Student("Artin");
        Student s4 = new Student("Sebastian");

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        int size = students.size();

        for(int i = 0; i< size; i++){
            int index = r.nextInt(students.size());
            System.out.println(students.get(index).getName());
            students.remove(index);
        }

    }

    public static void main(String[] args) {
        new StudentGenerator();
    }
}
