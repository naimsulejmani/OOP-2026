package introduction.Date20260203;

public class AccountDemo {
    static void main() {
        Account a1 = new Account();
        a1.setName("Naim");
        System.out.printf("Account %s ka ne llogari gjithsej %.2f EUR.%n", a1.getName(), a1.getBalance());
        a1.deposit(100);
        a1.withdraw(200);
        a1.setName("  ");
        System.out.printf("Account %s ka ne llogari gjithsej %.2f EUR.%n", a1.getName(), a1.getBalance());


        System.out.println("------------------------------------------------------------------------------");


        Account a2 = new Account();
        a2.setName("Filan");


        System.out.printf("Account %s ka ne llogari gjithsej %.2f EUR.%n", a2.getName(), a2.getBalance());
        a2.withdraw(500);
        System.out.printf("Account %s ka ne llogari gjithsej %.2f EUR.%n", a2.getName(), a2.getBalance());
    }
}
