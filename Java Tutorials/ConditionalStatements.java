import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        //Conditional statement example
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the money = ");
    
        int cash = sc.nextInt();
        if(cash <10){
            System.out.println("Cannot buy anything");
            System.out.println("Get more cash");
        }
        else if (cash> 10 && cash<50) {
            System.out.println("Can get only one thing");
            
        }
        else{
            System.out.println("Can get both");
        }
    }
    
}
