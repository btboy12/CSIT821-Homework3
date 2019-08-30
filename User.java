import java.util.ArrayList;

public abstract class User {
    private String id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private UserType userType;
    private PermissionType permissionType;
    private Boolean status;

    public User(String id, String firstName, String lastName, String username, String password, UserType userType,
            PermissionType permissionType, Boolean status) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.userType = userType;
        this.permissionType = permissionType;
        this.status = status;
    }

    protected void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        if (password.length() > 7)
            this.password = password;
    }

    /**
     * @return the userType
     */
    public UserType getUserType() {
        return userType;
    }

    /**
     * @param userType the userType to set
     */
    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    /**
     * @return the permissionType
     */
    public PermissionType getPermissionType() {
        return permissionType;
    }

    /**
     * @param permissionType the permissionType to set
     */
    public void setPermissionType(PermissionType permissionType) {
        this.permissionType = permissionType;
    }

    public String getFullname() {
        return this.firstName + " " + this.lastName;
    }

    public boolean verifyUsernameAndPassword(String username, String Password) {
        return verifyUsername(username) && this.password == Password;
    }

    public boolean verifyUsername(String username) {
        return this.username == username;
    }

    @Override
    public String toString() {
        return String.format("id:%s\nfull name:%s\nusername:%s\nuser type:%s\npermission type:%s\nstatus:%b", id,
                getFullname(), username, userType, permissionType, status);
    }

    static public User findUserByUsername(ArrayList<User> users, String username) {
        for (User user : users) {
            if (user.username == username)
                return user;
        }
        return null;
    }

    static public boolean loginByUsernameAndPassword(ArrayList<User> users, String username, String Password) {
        for (User user : users) {
            if (user.username == username && user.password == Password)
                return true;
        }
        return false;
    }
}