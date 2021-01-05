package objectandclass;

public class StringSample2 {
    public static void main(String[] args) {
        int a = 1;
        String b = String.valueOf(a);
        System.out.println(b);
        System.out.println(b instanceof String);

        String c = a + "";
        System.out.println(c instanceof String);

        String e = String.valueOf("a");
        System.out.println(e);
        System.out.println(e instanceof String);

        String d = String.valueOf(true);
        System.out.println(d);
        System.out.println(d instanceof String);
    }
}
