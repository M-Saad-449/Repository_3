public class BREAKandCONTUINUE {
    public static void main(String[] args) {
        //Break And Continue
        //Break
        int i = 0;
        while(true){
            
            
            System.out.println(i);
            i++;
            if(i>5){
                break;
            }

        }
        int k=1;
        while (true) {
            if(k==3){
                k++;
                continue;
            }
            System.out.println(k);
            k++;
            if (k>5) {
                break;
                
            }
            
        }
    }
    
}
