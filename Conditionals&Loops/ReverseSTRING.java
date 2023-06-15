import java.util.Scanner;

public class ReverseSTRING {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String str=in.nextLine();
        String revstr ="";
        for (int i=0; i<str.length(); i++){
            revstr=str.charAt(i)+revstr;
        }
        System.out.println("Reversed string is: "+revstr);
    }
}
