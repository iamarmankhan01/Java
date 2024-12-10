
class Number {
    int n, fact = 1, i;

    Number(int x) {
        n = x;
    }

    void printfactorial() {
        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.print("Factorial is:");
        System.out.println(fact);

    }
}

public class factorial {
    public static void main(String[] args) {
        Number n1 = new Number(6);
        n1.printfactorial();

    }
}
