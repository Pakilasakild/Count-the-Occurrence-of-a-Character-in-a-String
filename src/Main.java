import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String text;
        int o = 0;
        Scanner sc = new Scanner(System.in);
        text = sc.nextLine();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'o') {
                o++;
            }
        }
        System.out.println("The character 'o' appears " + o + " times in the string.");
    }
}