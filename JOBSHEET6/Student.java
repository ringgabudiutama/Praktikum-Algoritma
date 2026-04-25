public class Student {
    public final static Object id = null;
    String nim;
    String name;
    String studentClass;
    double gpa;

    public Student() {
    }

    public Student(String nim, String name, String studentClass) {
        this.nim = nim;
        this.name = name;
        this.studentClass = studentClass;
        this.gpa = gpa;
    }

    public void print() {
        System.out.println("NIM: " + nim + ", Name: " + name + ", Class: " + studentClass + ", GPA: " + gpa);
    }

    public void showStudent() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showStudent'");
    }
}