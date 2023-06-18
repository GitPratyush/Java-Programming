public class OverloadingINjava {
    public static void main(String[] args) {
        fun(65);
        fun("Pratyush sinha");
    }

    static void fun(String name) {
        System.out.println(name);
    }

    static void fun(int i) {
        System.out.println(i);
    }
}
