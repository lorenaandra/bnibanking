package User;

public class TestUser {

    public static void main(String[] args) {
        User user = new User("Gigi", "Becali", "iamgigi", "iamgigi@yahoo.com");
//        User user2 = new User("Marcela", "Protopopescu", "parola", "marcelutza33@yahoo.com");

        user.openSavingsAccount();
        System.out.println(user);
    }
}
