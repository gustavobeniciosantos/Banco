
public class Deposit {

    public double deposit(double value, Customer c1) {



        Double balance = c1.getBalance();

        c1.setBalance(balance+value);

        write("");

        write("Depósito efetuado!");

        return balance;



    }



    public void write(String text) {
        System.out.println(text);
    }

}
