public class Nto1 {
    public static void main(String[] args) {
        //revnto1(5);
        //nto1(5);
        Bothnto1(5);

    }
    static  void nto1(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        nto1(n-1);
    }

    static  void revnto1(int n){
        if (n==0){
            return;
        }
        revnto1(n-1);
        System.out.println(n);
    }

    static  void Bothnto1(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        Bothnto1(n-1);
        System.out.println(n);
    }
}