import java.util.Scanner;
public class averageofnums{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int sub;
        int total = 0;
        System.out.println("Input number or press 0 to exit");
        while((sub = in.nextInt()) !=0){
            
            total += sub;
            count++;
            System.out.println("Input number or press 0 to exit");

        }
        System.out.println("Your average is " + total/count);
        }
}