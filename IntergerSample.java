package objectandclass;
import java.lang.Integer;

public class IntergerSample {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(new Integer(10).compareTo(new Integer(11)));
        
        Integer o1 =Integer.valueOf(12);
        System.out.println(o1==12);

        System.out.println(Integer.parseInt("11"));
        System.out.println(Integer.parseInt("11",2));
        System.out.println(Integer.parseInt("11",8));
        System.out.println(Integer.parseInt("1A",16));
    }
}
