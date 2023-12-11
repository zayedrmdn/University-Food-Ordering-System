package Admin_Zayed;

public class AdminAccounts {
    
    private String username;
    private String password;
    private String role;
    private Double balance;
    
    public AdminAccounts(String username, String password, String role, Double balance) {
        
        this.username = username;
        this.password = password;
        this.role = role;
        this.balance = balance;
    }

    // Getter and setter methods for 'username'
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Getter and setter methods for 'password'
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Getter and setter methods for 'role'
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // Getter and setter methods for 'balance'
    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
