public class Student {
    private String firstName;
    private String lastName;
    private int grade;
    private int stuID;
    static int nextStudent = 1;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getStuID() {
        return stuID;
    }

    public void setStuID(int stuID) {
        this.stuID = stuID;
    }

    public Student(String firstName, String lastName, int grade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.stuID = nextStudent;
        nextStudent++;
    }

    public String toString() {
        return "Name: " + firstName + " " + lastName + " Grade: " + grade;
    }

}
