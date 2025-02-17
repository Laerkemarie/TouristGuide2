package StudentSorting;

public class Student implements Comparable<Student> {
    private String name;
    private int zipCode;
    private boolean livingWithParents;
    private char gender;

    public Student(String name, int zipCode, boolean livingWithParents, char gender) {
        this.name = name;
        this.zipCode = zipCode;
        this.livingWithParents = livingWithParents;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getZipCode() {
        return zipCode;
    }

    public boolean isLivingWithParents() {
        return livingWithParents;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public int compareTo(Student other) {
        int result = this.name.compareTo(other.name);
        if (result != 0) return result;

        result = Integer.compare(this.zipCode, other.zipCode);
        if (result != 0) return result;

        result = Boolean.compare(this.livingWithParents, other.livingWithParents);
        if (result != 0) return result;

        return Character.compare(this.gender, other.gender);
    }

//    @Override
//    public String toString() {
//        return "Name: " + name +
//                "\nZip code: " + zipCode +
//                "\nDo you live with your parents (True or false)? " + livingWithParents +
//                "\nGender: " + gender +
//                "\n";
//    }
}
