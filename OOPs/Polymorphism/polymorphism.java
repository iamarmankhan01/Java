//3-operator Overloading
// public class polymorphism{
//     public static void main(String[] args) {
// int a,b;
// String s1,s2;
// a=10;
// b=20;
// s1="10";
// s2="20";
// System.out.println(a+b);//Addition
// System.out.println(s1+s2);//Concatination
// System.out.println(a-b);//Subtraction
// System.out.println(-(a-b));//Unary Minus
// }

//     }

//---------------Method Overloading----------------

// class Result
// {
// int res;
// void sum(int x,int y)
// {
// }
// void sum(int x,int y,int y)// Number of Argument
// {
// }
// void sum(int x,Float y)//Type of Argument
// {
// }
// void sum(float x,int y)//Sequence of Argument
// {
// }
// /*void sum(int a,int b) Error
// {
// }*/
// }

//public class polymorphism{

/*
WAP to compute Area of following shape by approriate use of Method overloading
1. Area of Square
2. Area of Circle
3. Area of Rectangle
4. Area of Triangle
*/
// class Shape {
//     double ar;

//     void area(int a) {
//         ar = a * a;
//         System.out.println("Area of Square=" + ar);
//     }

//     void area(double r) {
//         ar = Math.PI * r * r;
//         System.out.println("Area of Circle=" + ar);
//     }

//     void area(int a, int b) {
//         ar = a * b;
//         System.out.println("Area of Rectangle=" + ar);
//     }

//     void area(int a, int b, int c) {
//         double s = (a + b + c) / 2.0;
//         ar = Math.sqrt(s * (s - a) * (s - b) * (s - c));
//         System.out.println("Area of Triangle=" + ar);
//     }
// }

// public class polymorphism {
//     public static void main(String args[]) {
//         Shape s = new Shape();
//         s.area(8.5);
//         s.area(7, 9);
//         s.area(8);
//         s.area(8, 6, 9);
//     }
// }

/*
WAP to find following operation using Method overloading
1. Largest between 2 Numbers
2.largest among 3 Numbers 
*/

// class Largest {
//     int large(int a, int b) {
//         if (a > b)
//             return a;
//         else
//             return b;
//     }

//     int large(int a, int b, int c) {
//         if (a > b && a > c)
//             return a;
//         else if (b > c)
//             return b;
//         else
//             return c;
//     }
// }

// public class polymorphism {
//     public static void main(String args[]) {
//         Largest ob = new Largest();
//         System.out.println("large(67,80)=" + ob.large(67, 80));
//         System.out.println("large(8,10,99)=" + ob.large(8, 10, 99));
//     }
// }

//--------------------------Constructor Overloading---------------------

// class Company
// {
// String cname;
// Company()
// {
// }
// Company(String str)
// {
// cname=str;
// }
// Company(Company cmp)
// {
// cmp.cname=cname;
// }
// }

//Program to demonstration of Method Overriding
// class Base {
//     int a;
//     void getBase(int x) {
//         a = x;
//         System.out.println("Base Class is intialized");
//     }
//     void showdata() {
//         System.out.println("This is Base Class Method");
//         System.out.println("a=" + a);
//     }
// }
// class Derived extends Base {
//     int b;
//     void getDerived(int x) {
//         b = x;
//         System.out.println("Derived Class is intialized");
//     }
//     void showdata()// Method overriding
//     {
//         System.out.println("This is Base Class Method and overriden by Derived Class");
//         System.out.println("a=" + a);
//         System.out.println("b=" + b);
//     }
// }
// public class polymorphism {
//         public static void main(String args[]) {
//         Base B = new Base();
//         Derived D = new Derived();
//         B.getBase(10);
//         D.getBase(20);
//         D.getDerived(40);
//         B.showdata();
//         D.showdata();
//     }
// }

/*
Property 3 of super Keyword : using super keyword we can get atual definition of base class Method 
wich is overriden buy Derived Class
*/
class Base {
    int a;
    void getBase(int x) {
        a = x;
        System.out.println("Base Class is intialized");
    }
    void showdata() {
        System.out.println("This is Base Class Method");
        System.out.println("a=" + a);
    }
}
class Derived extends Base {
    int b;
    void getDerived(int x) {
        b = x;
        System.out.println("Derived Class is intialized");
    }
    void showdata()// Method overriding
    {
        System.out.println("This is Base Class Method and overriden by Derived Class");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
    void show() {
        System.out.println("Actual Definition");
        super.showdata();
        System.out.println("Overriden Definition");
        showdata();
    }
}
public class polymorphism {
    public static void main(String args[]) {
        Derived D = new Derived();
        D.getBase(20);
        D.getDerived(40);
        D.show();
    }
}
