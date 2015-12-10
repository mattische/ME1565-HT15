import java.util.ArrayList;

/**
 * Created by mattische on 2015-12-10.
 */
public class University {

    private String name;
    private ArrayList<Program> programs;

    public University(String name) {
        this.name = name;
        this.programs = new ArrayList<Program>();
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", programs=" + programs +
                '}';
    }

    public void addProgram(Program p) {
        this.programs.add(p);
    }

    public Program searchProgram(String name) {
        for (Program program : this.programs) {
            if(program.getName().equalsIgnoreCase(name))
                return program;
        }

        return null;
    }

    public Course searchCourse(String courseName) {
        for (Program program : this.programs) {
            for (Course course : program.getCourses()) {
                if(course.getName().equalsIgnoreCase(courseName))
                    return course;
            }

        }
        return null;
    }

    public Teacher searchTeacher(String name) {
        for (Program program : this.programs) {
            for (Course course : program.getCourses()) {
                if(course.getExaminator().getName().equalsIgnoreCase(name))
                    return course.getExaminator();
                else if(course.getCourseAdmin().getName().equalsIgnoreCase(name))
                    return course.getCourseAdmin();
            }

        }
        return null;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Program> getPrograms() {
        return programs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrograms(ArrayList<Program> programs) {
        this.programs = programs;
    }
}
