import java.util.Scanner;

public class MiniProject {
    public static void main(String[] args) {
        int mynum= (int)(Math.random()*100);
        Scanner sc= new Scanner(System.in);
        int userNum;
       
        do {
            System.out.println("Guess My Number");
             userNum= sc.nextInt();
            if(userNum==mynum){
                System.out.println("Wohoo---Correcr Number");
                break;
            }
            else if (userNum>mynum) {
                System.out.println("Your number is large");
                
                
            }
            else {
                System.out.println("Your number is small");
            }
        } while (userNum>=0);
        System.out.print("My number was");
        System.out.println(mynum);
    }
    
}
