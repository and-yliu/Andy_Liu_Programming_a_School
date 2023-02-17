import java.util.ArrayList;
public class School {
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    private String name;
    private int size;
    private String address;

    public School(String name, int size, String address) {
        this.name = name;
        this.size = size;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeTeacher(Teacher teacher){
        teachers.remove(teacher);
    }

    public void removeStudent(Student student){
        students.remove(student);
    }

    public void showTeacher(){
        for(int i = 0; i < teachers.size(); i++){
            System.out.println(teachers.get(i));
        }
    }
    public void showStudent(){
        for(int i = 0; i < students.size(); i++){
            System.out.println(students.get(i));
        }
    }
}
