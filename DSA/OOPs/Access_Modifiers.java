class Account {
    public String name;
    protected String email;
    private String password;

    // getters & setters
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }
}

public class Access_Modifiers {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Chetan Anand";
        account1.email = "chetan@gmail.com";
        account1.setPassword("sbcc");
        System.out.println(account1.getPassword());
    }
}
