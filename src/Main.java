import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String text;
        char ch;
        int n = 0;
        Scanner sc = new Scanner(System.in);
        text = sc.nextLine();
        ch = sc.nextLine().charAt(0);
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch) {
                n++;
            }
        }
        System.out.println("The character " + ch + " appears " + n + " times in the string.");
    }
}