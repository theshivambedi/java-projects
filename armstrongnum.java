import java.util.Scanner;
class armstrongnum {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int num2 = num; 
    int cube2 = 0;
    while(num>0){
        int cube = num%10;
        int cube1 = cube*cube*cube; 
        cube2 += cube1;
        num = num/10;
    }
    if(cube2 == num2){
        System.out.println(num2 + " is an armstrong number");
    }else{
        System.out.println(num2 + " is not an armstrong number");
    }
}    
}
