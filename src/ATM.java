import java.util.Scanner;

public class ATM {

    Customer c1 = new Customer();
    DataInsert client = new DataInsert();
    Scanner read = new Scanner(System.in);

    public ATM() {

        client.dataInsert(c1);

        write("Olá," +c1.getName()+", vamos começar?");

        boolean rep = true;

        while(rep) {

            Front front = new Front();
            int option = front.menu();

            if(option >4 || option < 0) {
                write("Opção incorreta");
                write("");
                write("Digite qualquer coisa para continuar");
                read.next();
                option = front.menu();
            }
            else {


                switch(option) {
                    case 1:
                        write("Digite o valor do saque");
                        double value = read.nextDouble();

                        Withdraw withdraw = new Withdraw();
                        withdraw.withdraw(value, c1);

                        write("");
                        write("Digite qualquer coisa para continuar");
                        read.next();


                        break;
                    case 2:
                        write("Digite o valor do depósito");
                        value = read.nextDouble();

                        Deposit deposit = new Deposit();
                        deposit.deposit(value, c1);

                        write("");
                        write("Digite qualquer coisa para continuar");
                        read.next();

                        break;
                    case 3:
                        write("");
                        write("---------Saldo atual: R$ "+ c1.getBalance()+"---------");
                        write("");

                        write("Digite qualquer coisa para continuar");
                        read.next();

                        break;

                    case 4:
                        write("Nome: "+c1.getName());
                        write("CPF: "+c1.getCPF());
                        write("E-mail: "+c1.getEmail());
                        write("Endereço: "+c1.getAdress());

                        write("");
                        write("Digite qualquer coisa para continuar");
                        read.next();


                        break;
                    case 0:
                        rep = false;
                }//switchcase
            }//if


        }//while


        System.out.print("Obrigado :)");



    }//constr



    public void write(String text) {
        System.out.println(text);
    }
}
