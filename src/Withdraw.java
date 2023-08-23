import java.util.Scanner;
public class Withdraw {

    Scanner read = new Scanner(System.in);


    public double withdraw(double value, Customer c1) {


        Double balance = c1.getBalance();

        c1.setBalance(balance-value);

        while(balance <= value) {
            write("");
            write("Saldo insuficiente, digite novamente um valor válido");


            value = read.nextDouble();
            c1.setBalance(balance-value);
            break;
        }

        write("");
        write("Saque efetuado!");





        return balance;



    }



    public void write(String text) {
        System.out.println(text);
    }
}
