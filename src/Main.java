import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, I can advise you on some daily activities based on your age. ");
        System.out.println("Please,write your age?");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n < 6) {
            System.out.println("You most likely going to kindergarten or staying at home");
        }
        if (n >= 7 && n <= 17) {
            System.out.println("You most likely going to school");
        }
        if (n >= 18 && n <= 22) {
            System.out.println("You are most likely studying at university");
        }
        if (n >= 23 && n <=59) {
            System.out.println("You are most likely working");
        }
        if (n >= 60) {
            System.out.println("You are most likely retired");
        }
    }
}