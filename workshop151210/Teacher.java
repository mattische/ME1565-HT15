/**
 * Created by mattische on 2015-12-10.
 */
public class Teacher {

    private String name;
    private String acronym;
    private int age;

    /**
     * Constructor.
     * @param n - name
     *
     */
    public Teacher(String n, String acro, int age) {
        this.name = n;
        this.acronym = acro;
        this.age = age;
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

    public int getAge() {
        return this.age;
    }

    public void setAge(int a) {
        this.age = a;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", acronym='" + acronym + '\'' +
                ", age=" + age +
                '}';
    }
}
