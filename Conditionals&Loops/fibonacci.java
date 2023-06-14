//        Problem: Print a pattern.
//        Write a program that prints the following pattern using nested loops:
//
//        markdown
//        Copy code
//        *
//        **
//        ***
//        ****
//        *****



import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner In=new Scanner(System.in);
        int n= In.nextInt();
        int a=0;        // a initialized to zero
        int b=1;        //b initialised to 1
        int count=1;    //taking count to 1
        while (count<n){//if 1<n that is 1<8
            int temp=b; //taking temp as b so that we can assign it to a
            b=b+a;      //adding a and b
            a=temp;     // assigning new value of a that is a=b
            count++;    //increasing count
        }
        System.out.println(b);
    }
}

//most simple code
/*  int i=in.nextInt(); , x=0,y=1,z=0;
* while(z<=i){
* system.out.println(z);
* x=y;
* y=z;
* z=x+y;
* }  */