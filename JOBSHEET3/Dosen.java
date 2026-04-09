public class Dosen {
    public String code;
    public String name;
    public boolean gender;
    public int age;

    public Dosen(String code, String name, boolean gender, int age) {
        this.code = code;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Code   : " + code);
        System.out.println("Name   : " + name);
        System.out.println("Gender : " + (gender ? "Male" : "Female"));
        System.out.println("Age    : " + age);
    }
}