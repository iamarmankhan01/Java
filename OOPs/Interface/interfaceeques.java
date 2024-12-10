//-Progrma to deminstration of interface

interface Company {
    String cname = "Trnent";
    int pin = 226026;

    // int a;
    void showdata();

    void msg();
    /*
     * void show()
     * {
     * syos("hello") //Error
     * }
     */
}

class Department implements Company {
    String dname;
    int dno;

    void getDept(String name, int no) {
        dname = name;
        dno = no;
    }
 
    public void showdata() {
        System.out.println("Comany name \t" + cname);
        System.out.println("pin code \t" + pin);
        System.out.println("Deprtment name \t" + dname);
        System.out.println("Depertmen number \t" + dno);
    }

    public void msg() {

    } // override
}

public class interfaceeques {
    public static void main(String[] args) {
        // Company cmp = new Company(); error show
        Department dp = new Department();
        dp.getDept("Software develoment", 5);
        dp.showdata();

        Company cmp = new Department();
        // cmp.getDept("web",6); Error
       // cmp.showdata();

    }

}
