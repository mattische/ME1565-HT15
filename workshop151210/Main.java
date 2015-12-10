import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Student[] students = new Student[5];
        students[0] = new Student("Torbjörn", "toho15");
        students[1] = new Student("Jack", "jakn15");
        students[2] = new Student("Maria", "majo15");
        students[3] = new Student("Tommi", "tosv15");
        students[4] = new Student("Johanna", "jojo15");

        Teacher t1 = new Teacher("Sven Svensson", "sve", 56);
        Teacher t2 = new Teacher("Birgitta Andersson", "bis", 66);
        Teacher t3 = new Teacher("Andreas Larsson", "ala", 32);

        Program webb = new Program("Webbutveckling", 2015, 5);
        webb.setStudents(students);
        Date end = new Date(2016, 0, 16);
        Course c1 = new Course("Gestaltande programmering", 15, "ME1565",
                new Date(2015, 10, 7), end, t2, t1);

        webb.addCourse(c1);

        University bth = new University("Blekinge Tekniska Högskola");
        bth.addProgram(webb);
        System.out.println(bth);
        /*
       Program webb15 = new Program("Webbutveckling 15", 2015, 35);


        webb15.addStudent(new Student("Torbjörn", "toho15"));
        System.out.println(webb15);
        webb15.dropOut(webb15.searchStudent("toho15"));


        System.out.println(webb15);

    */




       /*
        Scanner scan = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();
        Main.printStudents(students);


        System.out.print("enter name (q to quit): ");
        String n = scan.nextLine();
        while(!n.equalsIgnoreCase("q")) {
            System.out.print("\nenter acro: ");
            String a = scan.nextLine();

            System.out.print("enter name: ");
            n = scan.nextLine();
            students.add(new Student(n, a));

        }
        Main.printStudents(students);



       Student test = new Student();
        test.setName("Lasse");
        test.setAcronym("lala12");
        System.out.println(test);

        Student s1 = new Student("Kenneth", "kesve15");

        System.out.println(s1);

        Student s2 = new Student("Lisa", "lila13");
        System.out.println(s2);


        Student[] students = new Student[4000];
        students[0] = s1;
        students[1] = s2;
        students[2] = new Student("Rolf", "roro10");

        for(int i = 0; i < students.length; i++)
            students[i] = new Student();

        students[1999].setName("Lennart");
        Student temp = students[1999];
        temp.setAcronym("lele09");
        temp.setName("Kerstin");
        System.out.println(students[1999]);*/
    }

    static void printStudents(ArrayList<Student> s) {
        for(int i = 0; i < s.size(); i++)
            System.out.println(s.get(i));
    }
}
