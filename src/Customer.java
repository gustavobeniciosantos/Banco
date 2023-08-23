
public class Customer {

    private String name;
    private String CPF;
    private	String email;
    private String adress;
    private Double balance = 3500.34;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public Double getBalance() {
        return balance;
    }
    public void setBalance(Double balance) {
        this.balance = balance;
    }



}
