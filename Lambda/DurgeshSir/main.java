public class main{
    public static void main(String[] args) {

        //1111111111111111111
    //  myInter myInter=new MyInterImpl();
    //  myInter.sayHello();


    //222222222222222222

    // myInter i=new myInter() {
    //     public void sayHello(){
    //        System.out.println("This is first anonymous class"); 
    //     }
    // };
    // i.sayHello();

    // myInter i2=new myInter() {
    //     public void sayHello(){
    //        System.out.println("This is second anonymous class"); 
    //     }
    // };
    // i.sayHello();

   //using our interface with the help of lambda

    //   myInter i=()->{
    //   System.out.println("This is first lembda");
    //   };
    //   i.sayHello();


    //SumInter use in lambda=======================

    // SumInter SumInter = (int a,int b) ->{
    //   return a+b;
    // };
    // System.out.println(SumInter.sum(3,5));
    // System.out.println(SumInter.sum(5,7));
          //Or
       
    // SumInter SumInter = (a,b) -> a+b;
    
    // System.out.println(SumInter.sum(3,5));
    // System.out.println(SumInter.sum(5,7));   
          
     //======LengthInter String =============

     LengthInter lengthInter=(str -> str.length());
     System.out.println(lengthInter.getLenght("Arman khan"));



    }
}