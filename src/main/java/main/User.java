package main;

public class User {
    private String username;
    private String password;

    public User(String username) {
        this.username = username;
        var invPass = new StringBuilder(username);
        this.password = invPass.reverse().toString();
    }

    public String getPassword() {
        return password;
    }
}
