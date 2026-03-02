package introduction.Date20260203;

import java.time.LocalDateTime;

public class BankAccount {

    private long accountNumber;
    private long cardNumber;
    private String holderName;
    private int monthValid;
    private int yearValid;
    private String pin;
    private int securityCode;
    private String cardType;
    private String bankName;
    private double balance;

    public BankAccount(long accountNumber, long cardNumber, String holderName, int monthValid, int yearValid, String pin, int securityCode, String cardType, String bankName) {
        this.accountNumber = accountNumber;
        this.cardNumber = cardNumber;
        this.holderName = holderName;
        this.monthValid = monthValid;
        this.yearValid = yearValid;
        this.pin = pin;
        this.securityCode = securityCode;
        this.cardType = cardType;
        this.bankName = bankName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public int getMonthValid() {
        return monthValid;
    }

    public void setMonthValid(int monthValid) {
        if (!(monthValid >= 1 && monthValid <= 12)) {
            System.out.println("Nuk ekziston!");
            return;
        }
        this.monthValid = monthValid;
    }

    public int getYearValid() {
        return yearValid;
    }

    public void setYearValid(int yearValid) {
        if (yearValid < 2026 || yearValid > 2100) {
            System.out.println("Out of range!");
            return;
        }
        this.yearValid = yearValid;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        if (pin == null || pin.isBlank() || pin.trim().length() != 4) {
            System.out.println("Wrong PIN!");
            return;
        }
        this.pin = pin.trim();
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(int securityCode) {
        if (securityCode < 0 || securityCode > 999) {
            System.out.println("PIN duhet te jete treshifror");
            return;
        }

        this.securityCode = securityCode;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double value) {
        if (value <= 0) {
            System.out.println("Nuk mund te depozitoni vlera <= 0 EUR.");
            return;
        }
        balance += value;
    }

    public void withdraw(double value) {
        if (value <= 0) {
            System.out.println("Nuk mundeni me terhjek para negative ose zero!");
            return;
        } else if (value > balance) {
            System.out.println("Nuk keni mjete te mjaftueshme ne llogari!");
            return;
        }
        balance -= value;
    }

    public void print() {
        System.out.println("Banka: " + bankName);
        System.out.println("---------------------------------");
        System.out.println("Balanci i " + holderName);
        System.out.println("Nr.logarise : " + accountNumber);
        System.out.println("CardType: " + cardType);
        System.out.println("---------------------------------");
        System.out.println("Balanci: " + balance + " EUR. ");
        System.out.println("Data e leshimit: " + LocalDateTime.now());
        System.out.println("---------------------------------");
    }


}
