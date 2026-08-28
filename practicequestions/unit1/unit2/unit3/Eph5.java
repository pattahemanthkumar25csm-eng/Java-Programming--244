
public class Eph5{
    public static void main(String[] args){
   
        try{
            String a = null;
            System.out.println("string is empty");
        }

       catch( NullPointerException npe){
        System.out.println("string is an excpetion");
       }
finally{
    System.out.println("process is done");
}

    }
}