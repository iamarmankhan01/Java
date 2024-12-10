class circle{
double r,ar,cr;
    void input(double x){
        r=x;
    }
    void area(){
        ar=Math.PI*r*r;
        System.out.println("Area of circle is "+ar);
    }
    void circum(){
        cr=2*Math.PI*r;
        System.out.println("Circumference is:"+cr);
    }
}
public class RunCIrcule {
    public static void main(String[] args) {  
    circle obj =new circle();
    obj.input(5.9);
    obj.area();
    obj.circum();
    
}
}
