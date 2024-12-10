
//-------------------- THIS KEYWORD--------------

// 1-Content of variable
// class Number
// {
// int a,b;//instance variable
// //int a;error
// void getdata(int a,int b)//here local variable
// {
// //a=a;
// //b=b;
// this.a=a;
// this.b=b;
// }
// void putdata()
// {
// System.out.println("a="+a);
// System.out.println("b="+b);
// }
// }
// public class thiskeyword{

// public static void main(String args[])
// {
// Number N=new Number();
// N.getdata(10,40);
// N.putdata();
// }
// } 

// 2-----------------------Context of Constructor---------------------

// class Number {
//     int a, b, c;

//     Number() {
//         this(10);
//         System.out.println("construtor1");
//     }

//     Number(int x) {
//         this(x, 20);
//         System.out.println("construtor2");
//     }

//     Number(int x, int y) {
//         this(x, y, 30);
//         System.out.println("construtor3");
//     }

//     Number(int x, int y, int z) {
//         a = x;
//         b = y;
//         c = z;
//         System.out.println("construtor4");
//     }

//     void showdata() {
//         System.out.println("a=" + a);
//         System.out.println("b=" + b);
//         System.out.println("c=" + c);
//     }
// }

// public class thiskeyword{

//     public static void main(String args[]) {
//         Number N = new Number();
//         N.showdata();
//     }
// }

//3-----------------------Context of Method-------------------

// class Company
// {

// String name="Analyze";
// int pin=226021;
// void showcmp()
// {
// System.out.println("company name\t"+name);
// }
// void showpin()
// {
// System.out.println("pin code\t"+pin);
// }
// void showdata()
// {
// System.out.println("company information");
// this.showcmp();
// showpin();
// }
// }
// public class thiskeyword{
// public static void main(String args[])
// {
// Company cmp=new Company();
// cmp.showdata();
// }
// }

class Base{
int a;
Base(){
    a=10;
    System.out.println("Defaualt constructor");
}  
    Base(int x){
        a=x;
        System.out.println(" parametrize Constructor");
}
}
class Derive extends Base{
    int b;
    Derive(){
        b=75;
        System.out.println("Default Constructor of  devived class");
    }
    Derive(int x){
        b=x;
        System.out.println("parametrized constructor of Devided classs");
    }
    void show(){
        System.out.println("a="+a);
         System.out.println("b="+b);                      
    }
}

public class thiskeyword{
    public static void main(String[] args) {
        Derive D1 =new Derive();
        Derive D2 = new Derive(95);
        D1.show();
        D2.show();

    }
}