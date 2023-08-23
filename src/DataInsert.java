import java.util.Scanner;

public class DataInsert {


    Scanner read = new Scanner(System.in);

    public void dataInsert(Customer c1) {

        write("Seja bem-vindo ao Banco Real, primeiramente, insira seu nome");
        c1.setName(read.next());

        write("Insira seu CPF sem pontos");
        c1.setCPF(read.next());

        write("Insira seu email");
        c1.setEmail(read.next());

        write("Insira seu endereço");
        read.nextLine();
        c1.setAdress(read.nextLine());


    }



    public void write(String text) {
        System.out.println(text);
    }
}
