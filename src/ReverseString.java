import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String original;
        String reverse = "";

        System.out.println("Please enter a word: ");
        original = sc.nextLine();

        int length = original.length();

        for (int r = length - 1; r >=0; r--)
            reverse = reverse + original.charAt(r);

        System.out.println(reverse);

    }
}
