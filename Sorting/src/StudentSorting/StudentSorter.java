package StudentSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentSorter {
    public static void main(String[] args) {

        new StudentSorter().run();
    }

    public void run() {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Hans", 2200, true, 'm'));
        students.add(new Student("Mie", 2900, false, 'f'));
        students.add(new Student("Tom", 4000, false, 'm'));
        students.add(new Student("Lis", 2450, true, 'f'));

//        Collections.sort(students);

        System.out.println("Sortering efter navn:");
        students.sort(Comparator.comparing(Student::getName));
        printStudents(students);

        System.out.println("\nSortering efter postnummer:");
        students.sort(Comparator.comparing(Student::getZipCode));
        printStudents(students);

        System.out.println("\nSortering efter boform:");
        students.sort(Comparator.comparing(Student::isLivingWithParents));
        printStudents(students);

        System.out.println("\nSortering efter køn:");
        students.sort(Comparator.comparing(Student::getGender));
        printStudents(students);

    }

    private void printStudents(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println("Name: " + student.getName() +
                    ", Zip code: " + student.getZipCode() +
                    ", Is living with parents? " + student.isLivingWithParents() +
                    ", Gender: " + student.getGender());
        }
    }
}

