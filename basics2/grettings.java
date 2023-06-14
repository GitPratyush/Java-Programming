//Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class grettings {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter any name");
        String name =input.next();
        System.out.println("Hello "+name);
    }
}
