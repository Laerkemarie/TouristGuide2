package lightOpgaver.syv;

public class Names {
    private String firstName;
    private String middleName;
    private String lastName;

    public Names(String fullName) {
        String[] parts = fullName.trim().split(" ");
        if (parts.length == 1) {
            this.firstName = parts[0];
            this.middleName = "";
            this.lastName = "";
        } else if (parts.length == 2) {
            this.firstName = parts[0];
            this.middleName = "";
            this.lastName = parts[1];
        } else {
            this.firstName = parts[0];
            this.middleName = parts[1];
            this.lastName = parts[2];
        }
    }
    @Override
    public String toString() {
        if (middleName.isEmpty()) {
            return firstName + " " + lastName;
        } else {
            return firstName + " " +  middleName + " " + lastName;
        }
    }
    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
