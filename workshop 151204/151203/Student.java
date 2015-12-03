/**
 * Created by mattische on 2015-12-03.
 */
public class Student {

    private String name;
    private String acronym;

    public Student(String n, String a) {
        this.name = n;
        this.acronym = a;
    }

    public Student() {
        this.name = "";
        this.acronym = "";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getAcronym() {
        return this.acronym;
    }

    public void setAcronym(String a) {
        this.acronym = a;
    }

    public String toString() {
        return this.name + " " + this.acronym;
    }


}
