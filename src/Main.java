import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        loginmenu();
    }

    public static void loginmenu() throws FileNotFoundException {
    Scanner scan = new Scanner(System.in);
        System.out.println("press \n1.for adminstration\n2.for Teachers");
    int num=scan.nextInt();
    switch (num){
        case 1:
            Teachers.adminstrationmenu();
            break;
        case 2:
            students.menu();
            break;
    }

    }




}
















