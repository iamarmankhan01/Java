class Number{
    int a,b;
    Number(){
        a=20;
        b=50;
        System.out.println("class number is intitalize");
    }
    Number(Number N){
        a=N.a;
        b=N.b;
        System.out.println("Duplicate copy of class Number is creatd");
    }
    void swap(){
        int temp;
        temp =a;
        a=b;
        b=temp;
    }
    void showdata(){
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}

public class constructor4 {
    public static void main(String[] args) {
        Number N1 = new Number();
        Number N2 = new Number(N1);
        N1.swap();
        System.out.println("Swip Data");
        N1.showdata();
        System.out.println("Actural Data");
        N2.showdata();

    }
}
