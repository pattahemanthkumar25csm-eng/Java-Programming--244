// i used throw keyword
public class Eph3{

    public static void ArithmeticException(int age) {
if(age > 18){
    throw new ArithmeticException("you are not eligilble to vote");
}else{
System.out.println(" you are eligible to vote");  
} 
    }

public static void main(String[] args) {
   
try{
    ArithmeticException(20);
    System.out.println("access not denied for you");
}
catch(ArithmeticException ee){
    System.out.println("access provided");
}



System.out.println("this is 3rd program for exception handling to throw keyword");


}


}


