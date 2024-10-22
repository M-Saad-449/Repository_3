public class LogicalOperators {
    public static void main(String[] args) {
        int a = 40;
        int b = 45;
        if(a<50 && b<50)
        System.out.println("Both are less than 50");

        if(a<50 || b<50){
            System.out.println("Atleast one is less than 50");
        }
        boolean isAdult = false;
        if(!isAdult){
            System.out.println("Adult");

        }
        else{
            System.out.println("Not Adult");
        }
    }
    
}
