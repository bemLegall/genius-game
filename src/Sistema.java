import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Sistema {
	int cont = 0;
	int oto = 1;
	ArrayList<Object> resp = new ArrayList<Object>();
	Integer test;

	List<Integer> lista = new ArrayList();
	Random random = new Random();

	public void reset() {
		System.out.println("\n");
	}
	
	public void mostra() {
		System.out.println("Confirme cada numero!!!");
		int sequencia = random.nextInt(4);
		lista.add(sequencia);
		while (true) {
			System.out.println("Resposta Correta: ");
			lista.forEach(lista ->{System.out.println(lista);});
			reset();
			Scanner scan = new Scanner(System.in);
			for (int i = 0; i < oto; i++) {
				test = scan.nextInt();
				
				resp.add(test);
			}

			if (lista.equals(resp)) {
				cont++;
				System.out.println("Voce acertou");
				System.out.println("pontuacao: "+ cont);
				reset();
			
				lista.add(random.nextInt(4));
				resp.clear();
				oto++;
				
			} else {
				System.out.println("Voce errou");
				break;
			}

		}

	}

}
