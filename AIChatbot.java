import java.util.Scanner;

public class AIChatbot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== CodeAlpha Task 3 - AI Chatbot ===");
        System.out.println("Hello! I am CodeAlpha Bot. Type 'bye' to exit.");

        while (true) {
            System.out.print("\nYou: ");
            String input = sc.nextLine().toLowerCase();

            if (input.contains("bye")) {
                System.out.println("Bot: Bye! Good luck with your internship :)");
                break;
            }
            else if (input.contains("hello") || input.contains("hi")) {
                System.out.println("Bot: Hello! How are you?");
            }
            else if (input.contains("your name")) {
                System.out.println("Bot: My name is CodeAlpha Bot.");
            }
            else if (input.contains("codealpha")) {
                System.out.println("Bot: CodeAlpha is a software company giving internships.");
            }
            else if (input.contains("java")) {
                System.out.println("Bot: Java is a popular programming language used to build apps.");
            }
            else if (input.contains("how are you")) {
                System.out.println("Bot: I am great! Thanks for asking.");
            }
            else if (input.contains("thank")) {
                System.out.println("Bot: You are welcome!");
            }
            else {
                System.out.println("Bot: Sorry, I did not understand. Can you ask something else?");
            }
        }
        sc.close();
    }
}
