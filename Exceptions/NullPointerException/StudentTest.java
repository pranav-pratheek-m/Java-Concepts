
class Student {
    String name;
    int age;
    String rollno;

    public Student(String name, int age, String rollno) {
        this.name = name;
        this.age = age;
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "Student [age=" + this.age + ", name=" + this.name + ", rollno=" + this.rollno + "]";
    }

}

public class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[3];

        students[1] = new Student("Rakesh", 19, "31");
        students[2] = new Student("Suresh", 20, "33");

        for (Student st : students) {
            System.out.println(st);
        }

    }

}
