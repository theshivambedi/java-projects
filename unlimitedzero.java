import java.util.Scanner;
public class unlimitedzero {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Please put a number");
        int sum=0;
        while((num = input.nextInt()) != 0){
            sum += num;
            System.out.println("Please put a number");

            }
            System.out.println(sum);
        
        
    }    
}