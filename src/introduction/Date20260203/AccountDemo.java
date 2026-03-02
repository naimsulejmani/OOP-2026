package introduction.Date20260203;

import java.util.Scanner;

public class AccountDemo {
    static void main() {
        Account a1 = new Account("Naim");
//        a1.setName("Naim");
        System.out.printf("Account %s ka ne llogari gjithsej %.2f EUR.%n", a1.getName(), a1.getBalance());
        a1.deposit(100);
        a1.withdraw(200);
        a1.setName("  ");
//        a1.balance = 1_000_000;
        System.out.printf("Account %s ka ne llogari gjithsej %.2f EUR.%n", a1.getName(), a1.getBalance());


        System.out.println("------------------------------------------------------------------------------");


        Account a2 = new Account("Erlenti",2_000);
//        a2.setName("Filan");


        System.out.printf("Account %s ka ne llogari gjithsej %.2f EUR.%n", a2.getName(), a2.getBalance());
        a2.withdraw(500);
        System.out.printf("Account %s ka ne llogari gjithsej %.2f EUR.%n", a2.getName(), a2.getBalance());


        Scanner reader = new Scanner(System.in);
//        Account a3 = new Account();
    }
}
