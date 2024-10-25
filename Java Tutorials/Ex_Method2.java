public class Ex_Method2 {
    
    void MyMethod(int i, double f){
        System.out.println(i);
    }
    void MyMethod(double f , int i){
        System.out.println(f+i);
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        Ex_Method2 me = new Ex_Method2();
        me.MyMethod(5.0+6);

    }
    

}
