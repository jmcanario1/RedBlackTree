import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		PV arv = new PV();
		while(true){
			System.out.println("Escolha uma opcao:");
			System.out.println("1 - Inserir");
			System.out.println("2 - Remover");
			System.out.println("3 - Buscar");
			System.out.println("4 - Terminar");
			Scanner input = new Scanner(System.in);
			int menu = input.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("\nDigite o valor do No:");
				int no1 = input.nextInt();
				arv.adiciona(no1);
				System.out.println("\n");
				RedBlackTreePrinter.printRedBlackTree(arv);
				System.out.println("\n");
			break;
			
			case 2:
				System.out.println("\nDigite o valor do No:");
				int no2 = input.nextInt();
				arv.remove(no2);
				System.out.println("\n");
				RedBlackTreePrinter.printRedBlackTree(arv);
				System.out.println("\n");
			break;
			
			case 3:
				System.out.println("\nDigite o valor do No:");
				int no3 = input.nextInt();
				RedBlackTreePrinter.searchNode(arv, no3);
				System.out.println("\n");
				RedBlackTreePrinter.printRedBlackTree(arv);
				System.out.println("\n");
			break;
			
			case 4:
				RedBlackTreePrinter.printRedBlackTree(arv);
				System.out.println("\n");
				input.close();
				System.exit(0);
			default:
				System.out.println("\nDigite uma opcao valida.");
				System.out.println("\n");
			break;
			}
		}
			

	}
	
}
