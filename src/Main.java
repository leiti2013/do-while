import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //n funfa Scanner leitor = new Scanner(System.in);

        //Produto produto = new Produto("ervilha",5.50); //igual

        Produto produto;

        boolean encerrar = false;

        String nome ="";
        double valor = 0;
        double total = 0;

        do{
            nome= JOptionPane.showInputDialog("Nome do produto: ");

            System.out.println("Valor do produto [apenas números]: ");
            valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do produto [apenas números]: "));

            produto = new Produto(nome,valor); //igual

            System.out.println(produto);

            total = total + produto.getValor();


            int opcao  = Integer.parseInt(JOptionPane.showInputDialog("Deseja mais alguma coisa?" + "[1] = SIM" + "[2] = Não"));
            encerrar = opcao == 1 ? false: true;

        }while (encerrar == false);

        System.out.println("Total da compra: "+ total);
    }
}