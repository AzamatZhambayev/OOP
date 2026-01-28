import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String original = sc.nextLine();
        
       
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

      
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("It is a Palindrome!");
        } else {
            System.out.println("It is NOT a Palindrome.");
        }

        sc.close();
    }
}