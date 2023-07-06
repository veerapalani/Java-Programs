import java.util.ArrayList;
import java.util.Arrays;

public class Arraylisttoarray {
public static void main(String[] args) {
// Create an ArrayList
ArrayList<String> arrayList = new ArrayList<>();
arrayList.add("Hello");
arrayList.add("World");
arrayList.add("!");

// Convert ArrayList to array
String[] array = arrayList.toArray(new String[arrayList.size()]);

// Print the array
System.out.println("Array: " + Arrays.toString(array));
}
}