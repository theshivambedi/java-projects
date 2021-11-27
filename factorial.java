import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int factorial = in.nextInt();
        int num = factorial;
        int mul = 1;
        while(factorial>=1){
            mul = mul*factorial;
            factorial--;
        }
        System.out.println("Factorial of " + num + " is " + mul);

    }
    
}
