//this keyword are not use in Local Variable.

public class E {
    public static void main(String[] args) {
        E e1 = new E();
        e1.test();
    }
    public void test(){
        int k=45;
        System.out.println(this.k); //Error
    }
}
