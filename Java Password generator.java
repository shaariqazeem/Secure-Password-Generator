import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        // 1. Set up tools for input and randomness
        Scanner reader = new Scanner(System.in);
        Random rand = new Random();

        // 2. Define our character "pool"
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String punctuation = "!@#$%^&*()_+-=";
        String allChars = upper + lower + digits + punctuation;

        System.out.println("--- 🛡️ Java Password Generator ---");
        System.out.print("Enter desired password length: ");

        // 3. Get input and generate
        if (reader.hasNextInt()) {
            int length = reader.nextInt();
            
            // Start with an empty string
            String password = "";

            for (int i = 0; i < length; i++) {
                // Pick a random index from the pool
                int randomIndex = rand.nextInt(allChars.length());
                // Add that character to our password
                password += allChars.charAt(randomIndex);
            }

            System.out.println("\nYour new password is: " + password);
        } else {
            System.out.println("Please enter a valid number!");
        }

        reader.close();
    }
}