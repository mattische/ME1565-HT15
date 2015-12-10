import java.util.Date;

/**
 * Created by mattische on 2015-12-10.
 */
public class Course {

    private String name;
    private int points;
    private String code;
    private Date startDate;
    private Date endDate;

    private Teacher courseAdmin;
    private Teacher examinator;

    public Course(String name, int points, String code,
                  Date start, Date end, Teacher admin, Teacher exam) {
        this.name = name;
        this.code = code;
        this.points = points;
        this.startDate = start;
        this.endDate = end;

        this.courseAdmin = admin;
        this.examinator = exam;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", points=" + points +
                ", code='" + code + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", courseAdmin=" + courseAdmin +
                ", examinator=" + examinator +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Teacher getCourseAdmin() {
        return courseAdmin;
    }

    public void setCourseAdmin(Teacher courseAdmin) {
        this.courseAdmin = courseAdmin;
    }

    public Teacher getExaminator() {
        return examinator;
    }

    public void setExaminator(Teacher examinator) {
        this.examinator = examinator;
    }
}
