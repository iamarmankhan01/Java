public class G {
       int i;
    public static void main(String[] args) {
        G g1 = new G();
        g1.test(100);
    }
    public void test (int i){
        this.i=i;
        System.out.println(this.i); 
    }
}
