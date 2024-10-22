import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        //How to take input
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your age : ");
        int age = sc.nextInt();
        System.out.println(age);
        //For Strings
        Scanner nc = new Scanner(System.in);
        System.out.println("Enter your name = ");
        String name = nc.next();
        System.out.println(name);
        Scanner mc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sentence = mc.nextLine();
        System.out.println(sentence);
    }
    
}
