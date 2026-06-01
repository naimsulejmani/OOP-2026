package introduction.records;

public class UserDemo {
    static void main() {
        User user1 = new User("Naim","ADMIN",true);
        User user2 = new User("Erlent","GUEST");
        User user3 = new User("Xhema");

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    }
}
