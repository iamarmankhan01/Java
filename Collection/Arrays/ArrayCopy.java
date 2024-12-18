
public class ArrayCopy {

    public static void main(String[] args) {
        String[] names = new String[]{"A", "В", "С"};
        String[] extended = new String[5];
        extended[3] = "D";
        extended[4] = "F";
        System.arraycopy(names, 0, extended, 0, names.length);

        for (String str : extended) {
            System.out.println(str);
        }
    }
}

/*
and
first index represent the position of first array last
two index represent the position of second array*/
