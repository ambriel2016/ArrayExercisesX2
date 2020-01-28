import java.sql.SQLOutput;
import java.util.Scanner;

public class OddEvenArray {
    public static void main(String[] args) {
        // Initializing the Scanner
        Scanner sc = new Scanner(System.in);
        // declaring an array
        int[] OddEven1 = new int[5];

       // This for loop for catching the user input
        for(int i = 0; i < OddEven1.length; i++) {

            System.out.println("Please enter a number: ");
            OddEven1[i] = sc.nextInt();
        }
        // This for loop checking in if the number is odd or even
        for(int j = 0; j < OddEven1.length; j++){

            if (OddEven1[j] % 2 == 0){
               System.out.println(OddEven1[j] + " is even. ");

            }else{
                System.out.println(OddEven1[j] + " is odd. ");
            }
        }
    }
}

