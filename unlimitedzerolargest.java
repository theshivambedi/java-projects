import java.util.Scanner;
public class unlimitedzerolargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int zero;
        int highest = 0;
        while((zero = input.nextInt())!=0){
            System.out.println("Please input the number");
            if(zero>highest){
                highest = zero;
            }
            
        }
        System.out.println(highest);
    }
    
}
