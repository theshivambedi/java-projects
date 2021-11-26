import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int factor = input.nextInt();
        System.out.print("The factors of " + factor +" are:");
        for(int num =1; num<=factor; num++){
            if(factor%num == 0)
            System.out.print(num + " ");
        }
    }
}    