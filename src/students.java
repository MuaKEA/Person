import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class students {
    static ArrayList<Student> stuList;

    static {
        try {
            stuList = getobjectfromfile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }



    public static void enrollstudent() throws FileNotFoundException {
        Scanner enrollment = new Scanner(System.in);
        Random ran = new Random();
        int studnumber = ran.nextInt(9999);
        System.out.println(studnumber);
        System.out.println("enter name of the student");
        String name = enrollment.nextLine();
        System.out.println("enter cpr");
        String cpr = enrollment.next();
        stuList.add(new Student(name, cpr, studnumber, 0.0));
        writetofile();

    }

    public static void entergrades() throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter cpr or the studendent ID, you wish to add grades to");
        int studentid = scan.nextInt();
        String IDTOString=String.valueOf(studentid);
        String yesorno;

        for (Student stud : stuList) {

            if (IDTOString==stud.getCpr() || studentid==stud.getStudentNo())  {
                do {
                    System.out.println("enter grades");
                    int grades = scan.nextInt();
                    stud.setTotalexam(stud.getTotalexam() + grades);
                    stud.setExamtaken(stud.getExamtaken() + 1);
                    System.out.println("wish to continue");

                    yesorno = scan.next();
                } while (yesorno=="yes");
                stud.setGradeaverage(stud.getTotalexam() /stud.getExamtaken());
                System.out.println("average grade for " + stud.toString());


            }


        }
        writetofile();

    }






    public static void menu() throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        do {
            System.out.println("*****\t welcome to your intranet \t****** " + "\n \n what do you wish to do" +
                    " press\n 1.for studenet enrollment\n 2.for adding grads to student\n 3 for showing all students \n-1 sign out");

            i = scan.nextInt();

            switch (i) {
                case 1:
                    enrollstudent();
                    break;
                case 2:
                    entergrades();
                    break;

                case 3:
                    showstudent();
                    break;


            }

        } while (i >= 0);
        System.out.println("lfkwnelkfnew");
    }

    public static void showstudent() {
        for (Student student : stuList) {
            System.out.println("*************************\n" + student + "\n********************\n");
        }
    }

    public static ArrayList<Student> getobjectfromfile() throws FileNotFoundException {
        ArrayList<Student> studentarraylist = new ArrayList<>();
        Scanner scan = new Scanner(new File("students.txt"));

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            Scanner delimitted = new Scanner(line).useDelimiter(" ");
            Student student = new Student();
            student.setName(delimitted.next());
            student.setCpr(delimitted.next());
            student.setStudentNo(delimitted.nextInt());
            String tranfertocomma = delimitted.next().replace(",", ".");
            Double averagegrade = Double.valueOf(tranfertocomma);
            student.setGradeaverage(averagegrade);
            student.setExamtaken(delimitted.nextInt());
            student.setTotalexam(delimitted.nextInt());
            studentarraylist.add(student);
        }






        return studentarraylist;

    }
    public static void writetofile() throws FileNotFoundException {
        PrintStream writetofile = new PrintStream(new File("students.txt"));
        String concat="";
        for (Student student: stuList) {
            concat+=student.toString() + " "+ student.getExamtaken() + " " + student.getTotalexam() + "\n";

        }
        writetofile.print(concat);

    }

     public static void studentcounter() {
        int i;
        for ( i = 0; i <stuList.size(); i++) {

        }
         System.out.println(i-1);
    }

}
