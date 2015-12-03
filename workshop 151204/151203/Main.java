import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Program webb15 = new Program("Webbutveckling 15", 2015, 35);


        webb15.addStudent(new Student("Torbjörn", "toho15"));
        System.out.println(webb15);
        webb15.dropOut(webb15.searchStudent("toho15"));


        System.out.println(webb15);






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
