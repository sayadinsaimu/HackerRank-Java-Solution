package Examples;

import java.io.IOException;
import java.util.Scanner;

public class Loop_1 {
public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);
        int n =input.nextInt();
        if (n>=2 && n<=20){
            for(int x=1;x<=10;x++){
                System.out.println(n+" x "+x+" = "+(n*x));
            }
        }
        else System.out.println("Entered number is out of range.");
        input.close();
    }
}
