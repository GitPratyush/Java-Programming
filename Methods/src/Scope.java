public class Scope {
    public static void main(String[] args) {
        int a=20;
        int b=30;
        //creating a block scope:-
        {
//           int  a=70;//already initiqalised outside the block in the same method, hence you cannot initialise again inside this scope
            a=100;//here we can reassign the value of 'a' to some other value
//            int c=99;
            //values initialised int the scope will remain int only this block
        }
//        System.out.println(c); //cannot print the value of scope outside the scope //
        System.out.println(a);// here we can print the reassigned value of a
    }
    static   void random(int marks){
        int num =67;
        System.out.println(num);
        System.out.println(marks);
    }
}
