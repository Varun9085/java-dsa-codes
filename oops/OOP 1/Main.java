public class Main {
    public static void main(String[] args) {
        Student varun = new Student();
        System.out.println(varun.name);
        Student Tejas = new Student(varun);
        System.out.println(Tejas.marks);
    }
}
