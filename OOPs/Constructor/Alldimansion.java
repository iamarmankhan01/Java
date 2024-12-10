
class Dimensional {
  int w, h, d;

  Dimensional() {
    w = 7;
    h = 5; // defautl Constructor
    d = 8;
  }

  Dimensional(int a, int b, int c) {
    w = a;
    h = b; // paramertrized construtor call by value
    d = c;
  }

  Dimensional(Dimensional f) {
    w = f.w;
    h = f.h; // paramertrized construtor call by reference
    d = f.d;
  }

  void calulateArea() {
    int ar = 2 * (w * h + h * d + d * w);
    System.out.println(ar);

  }
}

public class Alldimansion {
  public static void main(String[] args) {
    Dimensional d1 = new Dimensional();
    Dimensional d2 = new Dimensional(9, 3, 7);
    Dimensional d3 = new Dimensional(d2);
    d1.calulateArea();
    d2.calulateArea();
    d3.calulateArea();

  }
}
