public class StudentClient {
    public static void main(String[] args){


        Student s1 = new Student(); // S1 is reference variable not obj
        s1.id = 1;
        s1.name = "John";  // id, name = is Object
        s1.course = "MCA";
        s1.cgpa = 3.5f;

        System.out.println(s1.id);
        System.out.println(s1.name);
        System.out.println(s1.course);
        System.out.println(s1.cgpa);

        System.out.println("******************");
        Student s2 = new Student();
        System.out.println(s2.id);
        System.out.println(s2.name);
        System.out.println(s2.course);
        System.out.println(s2.cgpa);

        System.out.println("******************");
        Student s3 = new Student();
        System.out.println(s3.id);
        System.out.println(s3.name);
        System.out.println(s3.course);
        System.out.println(s3.cgpa);
    }
}