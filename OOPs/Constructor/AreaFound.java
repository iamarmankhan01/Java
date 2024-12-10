
class circle {
    int r;

    void Rectangle(int l, int b) {

        int ar = b * l;
        System.out.println("Area of Rectangle is " + ar);
    }

    void Triangle(int b, int h) {
        float cr = b * h * 0.5f;
        System.out.println("Triangle is:" + cr);
    }
}

public class AreaFound {
    public static void main(String[] args) {
        circle obj = new circle();
        obj.Rectangle(4, 6);
        obj.Triangle(7, 8);

    }
}
