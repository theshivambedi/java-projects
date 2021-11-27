import java.util.Scanner;
public class stringreversal {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        int n = word.length();
        int start = 0;
        char word2 = word.charAt(start);
        String word4 = "";
        
        while(n>start){
            char word3 = word.charAt(n-1);
            System.out.println(word3);
            n--;
            word4 += word3;
        }
        System.out.println(word4);
    }
    
}
