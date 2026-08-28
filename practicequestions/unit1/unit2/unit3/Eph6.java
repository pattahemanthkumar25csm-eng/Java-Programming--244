public class Eph6{
    public static void main(String [] args){
        try{
            int a = 12;
            System.out.println("string is empty");
        }

       catch( NullPointerException npe){
        System.out.println("string is an excpetion");

       }
       finally{
        System.out.println("process done");
       }
     int b = Integer.parseInt("abc");
System.out.println("number format exception");

    }
}