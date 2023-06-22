import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistBasics {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list=new ArrayList<>(10 );
//        list.add(33);
//        list.add(56);
//        list.add(565);
//        list.add(399);
//        list.add(52);
//        list.add(54);
//        System.out.println(list);
//        list.set(0,879); //changes the value of 0th index
//        System.out.println(list);//prints the change array
//        list.remove(2);//removes the index
//        System.out.println(list);
        // we can also iterate on this using for loop
        //input
        for (int i=0; i<5; i++){
            list.add(in.nextInt());
        }
        //get item at any index
        for (int i=0; i<5; i++){
            System.out.print(list.get(i) +" "); //passing index here,list[inde]syntax will not work here
        }
    }
}
