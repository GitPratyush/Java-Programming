public class shadowingINJava {
    static int x=90; //this is the shadowed value

    public static void main(String[] args) {
        System.out.println(x);//prints the shadowed value of x which is 90
        int x=60;//by creating this value we just shadowed the value of x which was 90
        System.out.println(x);//prints the value of the x after the previous value is shadowed 60
        fun();

    }

    static void fun() {
    }
}
