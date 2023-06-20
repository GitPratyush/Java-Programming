public class ArrayBasics {
    public static void main(String[] args) {
        //Syntax
        //datatype[] variable_name=new datatype[size];
        int[] rollnos=new int[6];   //storing 6 roll numbers which is of integer datatype.
        //or we can also use:-
        int[] rollnumber={1,3,4,6,7,21};


        int[] ros; //declaration of array ros is getting defined in stack.
        ros=new int[5];  //initialization: actually here object is being created in the memory.
        System.out.println(ros[1]);  //gives the output 0 as there is nothing in ros.


        //taking a string array :-
        String[] arr=new String[5];
        System.out.println(arr[0]); //gives the output as null as there is nothing present in the arr string array.

    }
}