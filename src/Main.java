import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static List<Produtos> produtos = new ArrayList<>();

    public static void main(String[] args) {
        cadastrarProdutos();
    }

    public static void cadastrarProdutos() {
        int escolha = 0;
        while (escolha != 2) {
            System.out.println("Deseja cadastrar um produto?\n1 - Sim.\n2 - Nâo.\n");
            escolha = sc.nextInt();
            if (escolha == 2) {
                break;
            }
            System.out.println("Digite o nome do produto: ");
            String nome = sc.next();
            System.out.println("Digite o preço do produto: ");
            double preco = sc.nextDouble();
            System.out.println("Digite o quantidade do produto: ");
            int quantidade = sc.nextInt();
            Produtos produto = new Produtos(nome, preco, quantidade);
            produtos.add(produto);
        }
        for (Produtos produto : produtos) {
            System.out.println(produto);
        }
    }
}
