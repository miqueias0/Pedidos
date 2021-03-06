package aplicação;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidades.Cliente;
import entidades.Ordem;
import entidades.OrdemItem;
import entidades.enums.OrdemStatus;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		OrdemItem ordemItem = new OrdemItem();		
		System.out.println("Entre com os dados do cliente:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Data de nascimento: ");
		Date dataDeNascimento = sdf.parse(sc.next());
		sc.nextLine();
		Cliente cliente = new Cliente(nome, email, dataDeNascimento);

		System.out.println("Dados da Ordem");
		System.out.print("Status: ");
		String ordemStatus = sc.nextLine();
		Ordem ordem = new Ordem();
		System.out.print("Quer a ordem de quantos itens? ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println("Entre com os dados do " + i + " item:");
			System.out.print("Nome do produto: ");
			String nomeItem = sc.nextLine();
			System.out.print("Preço do produto: ");
			double preco = sc.nextDouble();
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();
			ordem = new Ordem(nomeItem, preco, quantidade, new Date(), cliente, OrdemStatus.valueOf(ordemStatus));
			ordem.addItem(ordem);
		}
		
		System.out.println();
		System.out.println(ordem);
		sc.close();
	}
}
