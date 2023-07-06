import java.util.Arrays;

public class sortingarrayzerovalueunchanged {
public static void main(String[] args) {
int[] array = {7, 8, 3, 6, 0, 7, 29, 12, 0, 14};
int[] sortedArray = sortArrayKeepingZeros(array);
System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
}

public static int[] sortArrayKeepingZeros(int[] array) {
// Create a new array to store non-zero elements
int[] nonZeroArray = new int[array.length];
int index = 0 ;

// Traverse the original array and copy non-zero elements to the new array
for (int num : array) {
if (num != 0) {
nonZeroArray[index] = num;
index++;
}
}

// Sort the non-zero elements
Arrays.sort(nonZeroArray);

// Place the sorted non-zero elements back into the original array
index = 0;
for (int i = 0; i < array.length; i++) {
if (array[i] != 0) {
array[i] = nonZeroArray[index];
index++;
}
}

return array;
}
}
