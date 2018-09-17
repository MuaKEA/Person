public class Student extends Person{

    private int studentNo;
    private double gradeaverage;
    private int examtaken;
    private int totalexam;

public Student(){

}
    public Student(String name, String cpr, int studentNo, double gradeaverage) {
        super(name, cpr);
        this.studentNo = studentNo;
        this.gradeaverage = gradeaverage;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }



    public double getGradeaverage() {
        return gradeaverage;
    }

    public void setGradeaverage(double gradeaverage) {

    this.gradeaverage = gradeaverage;
    }

    public int getExamtaken() {
        return examtaken;
    }

    public void setExamtaken(int examtaken) {
        this.examtaken = examtaken;
    }

    public int getTotalexam() {
        return totalexam;
    }

    public void setTotalexam(int totalexam) {
        this.totalexam = totalexam;
    }

    @Override
    public String toString() {
        return String.format(name + " " + cpr + " " + studentNo + " " + gradeaverage);
    }
}
