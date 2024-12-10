class Parent{
    void show(){
        System.out.println("Parent Class");
    }
}
class Child extends Parent{
    void show(){
        System.out.println("Child Class");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Parent obj=new Parent();
        obj.show();
        Child obj1=new Child();
        obj1.show();
    }
}
