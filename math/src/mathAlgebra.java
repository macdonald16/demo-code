import java.util.Scanner;

public class mathAlgebra {
    int sum(int a, int b) {
        int ans = a + b;
        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number ");
        int b = sc.nextInt();

        mathAlgebra obj = new mathAlgebra();
        int ans =obj.sum( a , b);
        System.out.print("The sum is " + ans);
    }
}
