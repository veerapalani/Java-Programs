public class sumintergervalueinstring {
public static void main(String[] args) {
String name = "V2i324ek";
int sum = 0;

for (int i = 0; i < name.length(); i++) {
char c = name.charAt(i);
if (Character.isDigit(c)) {
int digit = Character.getNumericValue(c);
sum += digit;
}
}

System.out.println("Sum of integer values in the string: " + sum);
}
}