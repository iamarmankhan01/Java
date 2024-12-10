class Square{
    int  r;
    public int area(){
       int ar = r*r;
        return ar;
    }
    public int perimeter (){
        int sq = 4*r;
        return sq;

    }
   
}
public class CalculatingArea {

    public static void main (String args[]){
        Square s1 = new Square();
        s1.r= 6;
        System.out.println("the area is :"+s1.area());
        System.out.println("the perimeter is:"+s1.perimeter());

    }
}  
