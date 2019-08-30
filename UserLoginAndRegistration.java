import java.util.ArrayList;

public class UserLoginAndRegistration {
    private ArrayList<User> users = new ArrayList<>();

    public boolean verifyLogin(String username, String Password) {
        return User.loginByUsernameAndPassword(users, username, Password);
    }

    public boolean addUser(User user) {
        users.add(user);
        return true;
    }
}