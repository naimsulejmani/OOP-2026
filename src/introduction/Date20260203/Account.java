package introduction.Date20260203;


//modifikatori_i_qasjes class EmriKlases {} -> EmriIKlases = EmrinEFajllit
public class Account {
    //instance variable, attribute,data,fields
    private String name;
    private double balance;


    public void setName(String _name) {
        if (_name == null || _name.isBlank() || _name.trim().length() < 2) {
            System.out.println("Name nuk guxon te jete null, blank apo te kete me pak se 2 karaktere (non-space)!");
            return;
        }
        name = _name.trim();
    }

    public String getName() {
        return name;
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

    public double getBalance() {
        return balance;
    }

}







