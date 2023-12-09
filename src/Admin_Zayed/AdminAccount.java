package Admin_Zayed;

public class AdminAccount{
    public String username;
    public String password;
    public String role;
    public double balance;
    public String table;
    
    public AdminAccount(String username, String password, String role, double balance, String table )
    {
        this.username = username;
        this.password = password;
        this.role = role;
        this.balance = balance;
        this.table = table;
    }
    
     public AdminAccount( )
    {
       this.username = username;
       this.balance = balance;
    }
    
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public double getBalance() {
        return balance;
    }

    public String getTable() {
        return table;
    }

    // Setter methods (if needed)
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setTable(String table) {
        this.table = table;
    }
}
