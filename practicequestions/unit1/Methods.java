class Example {
void storeData(){
    System.out.println("this is my first demo");
}
}
class Opertor{
    int x =10,y = 20;
    void addition(){
        System.out.println("addition = " + (x+y));
    }
    void subtraction(){
        System.out.println("subtraction - " + (x-y));
    }
}


public class Methods {
 
    public static void main(String[] args) {
        int x = 10 ,y = 20;
        int sum  = x + y;
        System.out.println("sum is " + sum);

  Example  star = new  Example();
   star.storeData();
Opertor addOpertor = new Opertor();
addOpertor.addition();
addOpertor.subtraction();
    
}
}