public class ExceptionHandling {
    public static void main(String[] args) {
        //Try 
        int[]marks = {97,98,95};
        try{
            System.out.println(marks[5]);
        }catch(Exception exception){
            //Do things after catching
        }
        System.out.println("The student name is Saad");
    }
    
}
