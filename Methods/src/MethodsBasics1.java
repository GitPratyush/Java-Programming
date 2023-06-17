import java.util.Scanner;

public class MethodsBasics1 {
    public static void main(String[] args) {
//        int ans = sum2(); //assigning the value of sum to ans
//        System.out.println(ans);
        int ans=sum3(20, 30);
        System.out.println(ans);
    }

    //passing the value of numbers when you are calling the method  in main()
    static int sum3(int a, int b){   //these are called Arguments
        int sum=a+b;
        return sum;
    }




    //To Return the value  we use return type format.
    //to Return the value we use static int/float/char...etc..according to the type of return value
    static int sum2(){
        Scanner in=new Scanner(System.in);
        System.out.println("enter number 1:  ");
        int num1=in.nextInt();
        System.out.println("enter number 2:  ");
        int num2=in.nextInt();
        int sum=num1+num2;
        return sum;
    }
    static void sum(){
        Scanner in=new Scanner(System.in);
        System.out.println("enter number 1:  ");
        int num1=in.nextInt();
        System.out.println("enter number 2:  ");
        int num2=in.nextInt();
        int sum=num1+num2;
        System.out.println("The sum is: "+sum);
    }


}
