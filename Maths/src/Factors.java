import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        factors3(20,3);
    }

    static void factors3(int n,int k) {
        ArrayList<Integer> list=new ArrayList<>();

        // Loop to find factors up to the square root of n
        for (int i=1; i<=Math.sqrt(n); i++){
            if (n%i==0){       // If i is a factor of n
                if (n/i==i) {
                    System.out.println(i+ " ");// Print the factor (square root of n)
                }else {
                    System.out.println(i+ " ");// Print the factor
                    list.add(n/i);  // Store the corresponding factor
                }
            }
        }

        // Loop to print the factors greater than the square root of n
        for (int i = list.size()-1; i>=0; i--) {
            System.out.println(list.get(i)+ " ");   // Print the stored factor
        }
    }
}