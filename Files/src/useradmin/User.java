package useradmin;

class User {

    private int userID;
    private String userName;
    private String password;

    User(int userID, String userName, String password) {
        setUserID(userID);
        setUserName(userName);
        setPassword(password);
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserId: " + getUserID() + ". User name: " + getUserName()  + ". Password: " + getPassword();
    }
}
