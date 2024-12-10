
import java.util.function.Consumer;

public class LambdaScopeTest3 {
    public int x = 0;
    class FirstLevel{
        public int x =1;
        void methodInFirstLevel(int x){
            Consumer<Integer> myConsumer = (y)->{
                System.out.println("x= "+x);  //Statement A
                System.out.println("y= "+y);
                System.out.println("this.x= "+this.x);
                System.out.println("LambdaScopeTest.this.x = "+LambdaScopeTest3.this.x);
            };
            myConsumer.accept(x);
        }
    }
    public static void main(String[] args) {
        LambdaScopeTest3 st = new LambdaScopeTest3();
        LambdaScopeTest3.FirstLevel f1 = st.new FirstLevel();
        f1.methodInFirstLevel(23);
       

    }
}
