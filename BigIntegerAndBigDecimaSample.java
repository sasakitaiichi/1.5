package objectandclass;
import java.lang.Integer;
import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerAndBigDecimaSample {
    public static void main(String[] args) {
        //long a= 2233720368547758079;

        BigInteger a =new BigInteger("2233720368547758079");
        BigInteger b = new BigInteger("2");
        BigInteger c =a.multiply(b);
        System.out.println(c);

        BigDecimal a1 = new BigDecimal(1.0);
        BigDecimal b1 = new BigDecimal(3);
        BigDecimal c1 = a1.divide(b1,200,BigDecimal.ROUND_UP);
        System.out.println(c1);

    }
}
