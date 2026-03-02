package introduction.Date20260203;

public class BankAccountDemo {
    static void main() {

        BankAccount b1 = new BankAccount(1L, 442L,
                "Naim", 12, 2028, "1111", 134,
                "Debit", "TEB");

        b1.deposit(1000);
        b1.print();


    }
}
