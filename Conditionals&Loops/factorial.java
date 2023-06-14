import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1 = input.nextInt();
        int fact=1;
        while(num1>0){
            fact=fact*(num1);
            num1=num1-1;
        }
        System.out.println(fact);
    }
}
/* int num;
* int fact=1;
* while(num>0){
* fact=fact*num
* num--}
* sout fact;*/