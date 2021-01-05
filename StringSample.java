package objectandclass;

import java.util.Arrays;

public class StringSample {
    public static void main(String[] args) {
        String a = "Welcome to Java";

        String message = new String("Welcome to Java");
        char[] charArrays = {'G', 'O', 'O', 'D'};
        String message2 = new String(charArrays);
        System.out.println(a);
        System.out.println(message);
        System.out.println(message2);

        String a1 = "Welcome";
        System.out.println(a1.replace('e', 'E'));
        System.out.println(a1.replaceFirst("e", "E"));

        String b = "Java is great";
        String[] result = b.split("#");
        System.out.println(Arrays.toString(result));
    }
}
