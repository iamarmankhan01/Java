class Company {
    String cname;
    int pin;

    void getCompany(String str, int x) {
        cname = str;
        pin = x;
    }
}

class Employee extends Company {
    String ename;
    int ecode;

    void getEmp(String name, int code) {
        ename = name;
        ecode = code;

    }

    void putEmp() {
        System.out.println("Company name\t" + cname);
        System.out.println("Pin code \t" + pin);
        System.out.println("Employee name \t" + ename);
        System.out.println("Employee code \t" + ecode);
    }
}

public class Inheritance3 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.getCompany("Stark industy", 226026);
        emp.getEmp("Arman", 01);
        emp.putEmp();

    }
}
