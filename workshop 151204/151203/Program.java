import java.util.Arrays;

/**
 * Created by mattische on 2015-12-03.
 */
public class Program {

    private String name;
    private int year;
    private Student[] students;

    public Program(String name, int year, Student[] students) {
        this.name = name;
        this.year = year;
        this.students = students;
    }

    public Program(String name, int year, int nbrStuds) {
        this.name = name;
        this.year = year;
        this.students = new Student[nbrStuds];
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void dropOut(int i) {
        this.students[i] = null;
    }

    /**
     * Search for student by acronym.
     * @param acro - acronym
     * @return - index of student with acronym. -1 if student not found.
     */
    public int searchStudent(String acro) {
        for(int i = 0; i < this.students.length; i++)
            if(this.students[i].getAcronym().equalsIgnoreCase(acro))
                return i;
        return -1;
    }

    public boolean addStudent(Student s) {
        for(int i = 0; i < this.students.length; i++) {
            if(this.students[i] == null) {
                this.students[i] = s;
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString() {
        return "Program{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
