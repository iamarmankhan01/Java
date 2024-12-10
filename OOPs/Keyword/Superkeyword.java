
//------------context of variable --------------
// class Base {
//     int a = 10, b = 20;
// }

// class Derived extends Base {
//     int a = 70, b = 80;

//     void showdata() {
//         System.out.println("Sub Class Data");
//         System.out.println("a=" + a);
//         System.out.println("b=" + b);
//         System.out.println("Super Class Data");
//         System.out.println("a=" + super.a);
//         System.out.println("b=" + super.b);
//     }
// }

// public class Superkeyword {

//     public static void main(String[] args) {
//         Derived D = new Derived();
//         D.showdata();
//     }
// }

//===============================================================================================================================


// class A{
//     int a=19;
// }
// class B extends A{
//     void showdata(){
//        int a =50;

//        System.out.println(a);
//        System.out.println(super.a);
//     }
// }
//  public class Superkeyword {

//    public static void main(String[] args) {

//     B value =new B();
//     value.showdata();
//    }
// }

//----------------context of method------------

// class Base {
//     int a;
//     Base(int x) {
//         a = x;
//         System.out.println("Parametrized Constructor of Base Class");
//     }
// }
// class Derived extends Base {
//     int b;
//     Derived(int x) {
//         super(20);
//         b = x;
//         System.out.println("Parametrized Constructor of Derived Class");
//     }
//     void showdata() {
//         System.out.println("a=" + a);
//         System.out.println("b=" + b);
//     }
// }
// public class Superkeyword {
//     public static void main(String args[]) {
//         Derived D = new Derived(60);
//         D.showdata();
//     }
// }


//-================================================================================================================================

// class A{
// void showdata (){
// System.out.println("hello arman");
// }
// }
// class B extends A{
// void showdata(){
// System.out.println("hello Atif siddique");
// super.showdata();
// }
// }
// public class Superkeyword {

// public static void main(String[] args) {
// B value =new B();
// value.showdata();
// }
// }

// ---------------------Context of Parametrized-----------------

// class A{
// A(int a){
// System.out.println("the value is "+a);
// }
// }
// class B extends A {
// B(){
// super(50);
// System.out.println("Hello arman");
// }
// }
// public class Superkeyword {
// public static void main(String[] args) {
// B v = new B();
// }
// }


//-======================================================================================================================

// class Company {
//     String cname;
//     Company(String str) {
//         cname = str;
//         System.out.println("Class Company");
//     }
//     void showCompany() {
//         System.out.println("Company Name\t" + cname);
//     }
// }
// class Department extends Company {
//     String dname;
//     Department(String str1, String str2) {
//         super(str1);
//         dname = str2;
//         System.out.println("Class Department");
//     }
//     void showDept() {
//         showCompany();
//         System.out.println("Department Name\t" + dname);
//     }
// }
// class Employee extends Department {
//     String ename;
//     Employee(String cname, String dname, String ename) {
//         // int a=10;
//         super(cname, dname);
//         this.ename = ename;
//         System.out.println("Class Employee");
//     }
//     void showEmp() {
//         showDept();
//         System.out.println("Employee Name\t" + ename);
//     }
// }
// public class Superkeyword {
//     public static void main(String args[]) {
//         Employee emp = new Employee("Analyze", "SD", "William");
//         emp.showEmp();
//     }
// }
