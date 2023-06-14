import java.util.Scanner;

public class primeORnot {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num= in.nextInt();
        int n=2;
        int count=0;
        for (int i=1; num>=i; i++){
            if (num%i==0){
                count+=1;
            }
        }
        if (count==2){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not prime");
        }


    }
}
