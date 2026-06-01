import introduction.Pokemon;

public class Main {
    static void main() {
        int age = 10;
        Integer age1 = 20;
        Integer age2 = age;


        Boolean barcaEkipiMeIMire = false;
        Float f = 20.2f;


        int x = Integer.parseInt("200");
        float y = Float.parseFloat("300.2");

//        correctFactorsSlow(11111111111111111L);
        correctFactors(11111111111111111L);
    }

    static void wrongFactors(long n) {
        for (long i = 1; i < n; i++) {
            while (n % i == 0)
                System.out.println(i + " ");
            n /= i;
        }
    }

    static void correctFactorsSlow(long n) {
        for (long i = 2; i <= n ; i++) {
            while (n % i == 0) {
                System.out.println(i + " ");
                n /= i;
            }
        }
        if (n > 1) {
            System.out.println(n);
        } else System.out.println();

    }

    static void correctFactors(long n) {
        for (long i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                System.out.println(i + " ");
                n /= i;
            }
        }
        if (n > 1) {
            System.out.println(n);
        } else System.out.println();

    }
}
