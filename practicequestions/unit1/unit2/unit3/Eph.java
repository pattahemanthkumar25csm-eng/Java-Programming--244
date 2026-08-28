

// we doing an operation of try with single catch 

public class Eph {
    public static void main(String[] args) {

  int i = 10, j = 0;
try{
  int k = i/j;
  System.out.println("the vlaue of k" + k);
    }
    catch(ArithmeticException ae){
        System.out.println(" the value of k is undefined");
    }

  System.out.println("this is first exception handling program");
   System.out.println("thi sis very important line");

    }
}
