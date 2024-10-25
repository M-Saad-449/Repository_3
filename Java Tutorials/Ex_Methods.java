
public class Ex_Methods {
    public static void MyMethod(String name){
        System.out.println(name);
    }
    public static void MyMethod(String name, String Fathername){
        System.out.println(name);
        System.out.println(Fathername);
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        Ex_Methods me = new Ex_Methods();
        me.MyMethod("1st implementation of my method called");
        me.MyMethod("2nd implementation of my Method","my Method called");

    }
    
}
