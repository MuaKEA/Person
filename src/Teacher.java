public class Teacher extends Person {
    private String course;
    private String title;

public Teacher(){

}
    public Teacher(String name, String cpr,String course, String title) {
        super(name,cpr);
        this.course = course;
        this.title = title;
        this.name=name;
        this.cpr=cpr;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return cpr + " " + name + " " +title + " #" + course;
    }
}