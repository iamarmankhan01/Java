public class LambdaTester2 {
    public static void main(String[] args) {
        LambdaTester2 tester = new LambdaTester2();

        //with type declaration
        MathOperation addition = (int a ,int b)->a+b;

        //with out type  declaration 
        MathOperation subtraction =(a,b)->a-b;

        //with return statement along with curly breaces
        MathOperation multiplication =(int a , int b)->a*b;

        //with return statement and without curly breaces
        MathOperation division =(int a , int b)->a/b;

        System.out.println("10+5 ="+ tester.operation(10,5 ,addition));
        System.out.println("10-5 ="+ tester.operation(10,5 ,subtraction));
        System.out.println("10*5 ="+ tester.operation(10,5 ,multiplication));
        System.out.println("10/5 ="+ tester.operation(10,5 ,division));

        GreetingService greetService1 =  message -> System.out.println("Hello "+message);
        
    GreetingService greetService2 =  message -> {System.out.println("Hello "+message);
        System.out.println("Hey "+message);};

        greetService1.sayMessage("Arman");
        greetService2.sayMessage("Atif");

    }
    @FunctionalInterface
    interface MathOperation{
        int operation(int a,int b);
    }
    @FunctionalInterface
    interface GreetingService{
        void sayMessage(String message);
        static void show(){ }
    }
    private int operation(int a ,int b,MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
}
/* 1. if u define landa expression without curly braces then u can give only single line in method body.

2. if u define landa expression with curly braces then u can give multiple line in method body.

        Lambda expressions are used primarily to define inline implementation of a functional interface, i,e., an interface with a single method only.  */