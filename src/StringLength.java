import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int j = 0;
        String word;
        String length;

        System.out.println("Please enter a word: ");
        word = sc.nextLine();

        char ch[] = word.toCharArray();
        for (char w : ch){
            j++;
        }
        System.out.println("Length of the String is: " + j );
    }
}
