public class Main {
    public static void main(String[] args) {
        School school = new School("UHill", 1200, "3288 Ross Road");

        school.addStudent(new Student("James", "Jones", 10));
        school.addStudent(new Student("Robert", "Taylor", 9));
        school.addStudent(new Student("Mary", "Brown", 7));
        school.addStudent(new Student("Patricia", "Evans", 8));
        school.addStudent(new Student("Jennifer", "Thomas", 12));
        school.addStudent(new Student("William", "Davies", 11));
        school.addStudent(new Student("Richard", "Thompson", 6));
        school.addStudent(new Student("Jessica", "Wright", 9));
        school.addStudent(new Student("Karen", "White", 8));
        school.addStudent(new Student("Matthew", "Walker", 12));

        school.addTeacher(new Teacher("John", "Smith", "Math"));
        school.addTeacher(new Teacher("Karl", "Johnson", "Science"));
        school.addTeacher(new Teacher("Bob", "Adams", "English"));

        // Display the list of teachers
        System.out.println("List of Teachers:");
        school.showTeacher();

        // Display the list of students
        System.out.println("\nList of Students:");
        school.showStudent();

        school.removeTeacher(school.teachers.get(1));

        school.removeStudent(school.students.get(8));
        school.removeStudent(school.students.get(3));

        // Display the list of teachers
        System.out.println("\nList of Teachers:");
        school.showTeacher();

        // Display the list of students
        System.out.println("\nList of Students:");
        school.showStudent();
    }
}