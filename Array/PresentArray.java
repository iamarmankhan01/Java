public class PresentArray {
    public static void main(String[] args) {
        float marks[] = { 45.4f, 12.2f, 23.4f, 67.3f, 78.7f };
        float num = 78.7f;
        boolean c = false;
        for (float element : marks) {
            if (num == element) {
                c = true;
                break;
            }
        }
        if (c) {
            System.out.println("The present in array ");
        } else {
            System.out.println("not present");
        }
    }
}


