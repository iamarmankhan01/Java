
//Program to demonstration of abstract Method and class

// abstract class Company {
//     String cname;

    // void getcompany(String name)// Concrete Method
    // {
    // cname = name;
    // }

    // abstract void showdata();

    // /*
    // * abstract void show()
    // * {
    // * System.out.println("Hello");
    // * }
    // */
    // abstract void msg();
    // }

    // class Employee extends Company {
    // String ename;

    // void getEmp(String name) {
    // ename = name;
    // }

    // // abstract void test1(); Error
    // void showdata()// Override
    // {
    // System.out.println("Company Name\t" + cname);
    // System.out.println("Employee Name\t" + ename);
    // }

    // void msg()// override
    // {
    // }
    // }

    // public class AbstractandmethodClass {
    // public static void main(String args[]) {
    // // Company cmp=new Company(); Error
    // Employee emp = new Employee();
    // emp.getcompany("Analyze InfoTech");
    // emp.getEmp("William James");
    // emp.showdata();
    // }
    // }


//===========================================================================================


    // Program to Demonstration of static variable and Method

//     class Employee {
//         String ename;
//         int ecode;
//         float esal;
//         static int count;

//         void getEmp(int code, String name, float sal) {
//             ecode = code;
//             ename = name;
//             esal = sal;
//             count++;
//         }

//         void showdata() {
//             System.out.println("Employee Code\t" + ecode);
//             System.out.println("Employee Name\t" + ename);
//             System.out.println("Employee Salary\t" + esal);
//         }

//         static void showcount() {
//             System.out.println("Total Employee=" + count);
//         }
//     }

// public class AbstractandmethodClass {
// int a=10;
// static int b=20;
// public static void main(String args[]){
// int c=20;//implicitly static
// //System.out.println("a="+a); Error
// System.out.println("b="+b);
// System.out.println("c="+c);
// System.out.println("count="+Employee.count);
// Employee.showcount();
// Employee emp1=new Employee();
// Employee emp2=new Employee();
// Employee emp3=new Employee();
// emp1.getEmp(1010,"William",40000.0f);
// emp2.getEmp(1011,"James",48000.0f);
// emp3.getEmp(1012,"Velly",70000.0f);
// emp1.showdata();
// emp2.showdata();
// emp3.showdata();
// Employee.showcount();
// //emp2.showcount();
// }
// }





