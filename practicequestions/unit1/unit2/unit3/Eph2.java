
// it is second operation is try with multiple catch's and arrayindexoutofbounds operation also done
public class Eph2{
    public static void main(String [] args){
        try{
            int i;
    int a [] = {10,20,30,40,50};
    System.out.println(" the value of i" + a[4]);
}
catch(ArithmeticException ae){
        System.out.println(" the value of i is not an exception handling of arithmetic exception");
}
catch(ArrayIndexOutOfBoundsException   aioob){
        System.out.println(" the value of i not defined here" );
}
catch(NullPointerException Npe){
    System.out.println(" the value of i is not an exception handling of nullpointerexception");
}

System.out.println(" this program consists of multiple catches and arrayindexoutofbounds operation also done");

System.out.println("this is my second program");

}
}
