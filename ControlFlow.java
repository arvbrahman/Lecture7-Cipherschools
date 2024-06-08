import java.util.*;

class Student{
    String name;
    int marks;
    boolean checkpass()
    {
        // if (marks>40) 
        // {
        //     return true;
        // }else{
        //     return false;
        // }
        if (marks>=40) return true ; 
        return false;

    }
}

public class ControlFlow {
    
    int findmax(int a,int b,int c)
    {
        if (a>b) {  //nested if-else
            if (a>c) {
                return a;
            }else{
                return c;
            }
        }else{
            if (b>c) {
                return b;
            }else{
                return c;
            }
        }
    }

    public static void main(String[] args) {
        Student S1 = new Student();
        S1.name = "Ram";
        S1.marks = 80;

        Student S2 = new Student();
        S2.name = "Sham";
        S2.marks = 30;

        System.out.println(S1.checkpass());
        System.out.println(S2.checkpass());

        ControlFlow cf = new ControlFlow();
        
        System.out.println(cf.findmax(10, 7, 15));

        char c = 'a';

        switch (c) {
            case 'a':
                System.out.println("Hi, I'm A");
                break;
            case 'b':
                System.out.println("Hi, I'm B");
                break;
            case 'c':
                System.out.println("Hi, I'm C");
                break;
            default:
                System.out.println("I'm not A, B, C");
                break;
        }

        System.out.println("After Switch");

    }
}
