import java.util.Scanner;

public class nameInputFromUser {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array lenght :");
        int n = sc.nextInt();
        String name[] = new String[n];
        System.out.println("Enter the Name  :");
        for (int i = 0; i < n; i++) {
            name[i] = sc.next();
        }

        for (int i = 0; i < name.length; i++) {
            System.out.println("name is :" + name[i]);
        }

    }
}
