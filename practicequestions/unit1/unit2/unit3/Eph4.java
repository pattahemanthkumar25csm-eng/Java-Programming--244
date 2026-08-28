// using throws keyword
public class Eph4{
    public static void  throwskeyword(int age) throws ArithmeticException{
        if(age > 18){
    throw new ArithmeticException ("you are not eligilble to vote");
}else{
System.out.println(" you are eligible to vote");  
} 
    }

public static void main(String[] args) {
   
try{
    throwskeyword(15);
    System.out.println("access not denied for you");
}
catch(ArithmeticException ee){
    System.out.println("access provided");
}
finally{
    System.out.println("process done");
}
System.out.println("this is 4th program for exception handling to throw keyword");
}






















}