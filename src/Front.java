import java.util.Scanner;
public class Front {

    Scanner read = new Scanner(System.in);


    public int menu() {
        write("Selecione a opção");
        write("1. Sacar");
        write("2. Depositar");
        write("3. Ver saldo atual");
        write("4. Dados da conta");
        write("0. Sair");

        return read.nextInt();
    }






    public void write(String text) {
        System.out.println(text);
    }

}
