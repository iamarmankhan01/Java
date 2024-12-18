import java.lang.reflect.Array;

public class CheckArrayType {
    public static void main(String args[]) {

        int[] z = {1, 2, 3}; // Corrected array declaration
        Class type = z.getClass(); // Get the class of the array

        if (type.isArray()) {
            Class elementType = type.getComponentType(); // Get the type of the array elements
            System.out.println("Array of: " + elementType);
            System.out.println("Length: " + Array.getLength(z)); // Get the length of the array
        }
    }
}
