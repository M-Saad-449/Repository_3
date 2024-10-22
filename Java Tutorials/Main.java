public class Main {

    public static void main(String[] args) {
              //Primitive types
              byte age = 30;
              int phone = 1234567890;
              long phone2= 12345678900L;
              float pi=3.14F;
              char letter= '@';
              boolean isAdult=true;
              System.out.println(age);
              System.out.println(phone);
              System.out.println(phone2);
              System.out.println(pi);
              System.out.println(letter);
              System.out.println(isAdult);
              //Noe-Primitive Types
              String name=new String("Saad");
              System.out.println(name.length());
              //Concatenate ---> means joining two stinrgs 
              String name1= "Saad";
              String name2= "Babar";
              String name3= name1+name2;
              System.out.println(name3);
              String name4= name1 + "and" + name2;
              System.out.println(name4);
              //charAt
              System.out.println(name.charAt(0));
              //Length
              System.out.println(name.length());
              String name5 = "Saab";
              String name6= name5.replace('S', 'K');
              System.out.println(name6);
              String name7= "Saad and Kaab";
              System.out.println(name7.substring(9, 13));


              
      
      
          }
      }
      