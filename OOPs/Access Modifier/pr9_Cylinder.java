
/* ----------------------------------video No- 44      cylinder    ------------------------------------
class cylinder{
    private int radius;
    private int height;
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height = height;
    }
}
    public static void main (String args[]){
        cylinder myCylinder =new cylinder();
        myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());
        myCylinder.setRadius(8);
        System.out.println(myCylinder.getRadius());

    }
}



//----------------------Calculate Surface area and volume of the Cylinder----------------

class cylinder{
    private int radius;
    private int height;
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height = height;
    }
        public double surfaceArea(){
            return 2 * 3.14* radius * radius + 2*3.14*radius*height;
        }
        public double surfaceVolum(){
            return 3.142*radius*radius*height;
        }
    }

public class pr9_Cylinder {
    public static void main (String args[]){
        cylinder myCylinder =new cylinder();
        myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());
        myCylinder.setRadius(8);
        System.out.println(myCylinder.getRadius());
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.surfaceVolum());

    }
}  */

//------------------------------Constructor used to inialize rectangle of length 4 and 5 for using custom parameters------------------------------------


class Rectangle{
    private int length;
    private int breadth;
    public Rectangle(){
        this.breadth = 4;
        this.length  = 5;
    }
    public Rectangle(int length, int breadth){
        this.breadth= breadth;
        this.length=length;
    }
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
}
public class pr9_Cylinder {
    public static void main (String args[]){
        Rectangle r= new Rectangle();
        System.out.println(r.getBreadth());
        System.out.println(r.getLength());


    }
}