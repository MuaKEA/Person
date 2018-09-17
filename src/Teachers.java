import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Teachers {
    static Scanner scan=new Scanner(System.in);
    static ArrayList<Teacher> teacherslist;

    static {
        try {
            teacherslist = readfromfile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static void adminstrationmenu() throws FileNotFoundException {
        System.out.println("***********welcome************\n press\n 1.for adding employe");
        int numb=scan.nextInt();

        switch (numb){
            case 1:
                registereemployee();
            break;
            case 2:
                showsteacher();
                break;
            default:
                System.out.println("comming soon");
        break;
        }

    }


    public static void registereemployee() throws FileNotFoundException {
        System.out.println("name");
        String name=scan.next();
        System.out.println("cpr");
        String cpr=scan.next();
        System.out.println("add courses");
        String courses=scan.next( );
        System.out.println("titel");
        String titel=scan.next();
        teacherslist.add(new Teacher(name,cpr,courses,titel));
        writeteacherToFile();

    }

    private static void writeteacherToFile() throws FileNotFoundException {
        PrintStream writeteacher = new PrintStream(new File("Teachers.txt"));
        String concat="";
         for (Object teachers:teacherslist) {
             concat+=teachers.toString() + "\n";
        }
             writeteacher.print(concat);
         }



public static ArrayList<Teacher> readfromfile() throws FileNotFoundException {
    ArrayList<Teacher> teacherlist= new ArrayList<>();
                Scanner filescan = new Scanner(new File("Teachers.txt"));
        while(filescan.hasNextLine()) {
             String a=filescan.next();
            String b=filescan.next();
            String c=filescan.next();
            String d=filescan.next();
            System.out.println(a + " " + b + " " + c + " " +d );

        }
    return teacherlist;
}

 public static void showsteacher(){
     for (Object teacher: teacherslist) {
         System.out.println(teacher);

     }

 }


}
