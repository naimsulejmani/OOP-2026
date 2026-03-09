package introduction.summary;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntDecDemo {
    static void main() {
        BigInteger nr1 = new BigInteger("123187686248923648712648912648129364892134628917462198746928458932759837590832750375309573295732890573290573029573259073754932759032759032");
        BigInteger nr2 = new BigInteger("987854906798056793480674903674390764390674390674908674906743967406436974069749068743067453096745067403749085674596743906743674640967403967");
        System.out.println(nr1.add(nr2));

        int x = 10;
        Integer y = 20;

        System.out.println(nr1.pow(3));

        System.out.println(nr1.doubleValue());

        BigDecimal nr3 = new BigDecimal("1231339847189743097421094790347.2139048721472190472198472019847219477");
        BigDecimal nr4 = new BigDecimal("9084373214721890473219047219034.89987349327429742903472190473290471329047293948247");
        System.out.println(nr3.add(nr4));
        System.out.println(nr3.divide(BigDecimal.TEN).add(BigDecimal.ONE));




    }
}
