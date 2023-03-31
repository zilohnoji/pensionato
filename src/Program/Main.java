package Program;

import java.util.Scanner;
import java.util.Locale;
import Entities.Configs;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.print("Número de estudantes: ");
		int n = sc.nextInt();
		Configs[] vect = new Configs[n];
		Configs instance = new Configs();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.print("Nome do estudante: ");
			String name = sc.nextLine();
			instance.setName(name);

			System.out.print("\nDigite o email: ");
			String email = sc.nextLine();
			instance.setEmail(email);

			vect[i] = new Configs(name, email);
		}

		System.out.println("Registros:\n");
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("[%d] Nome: %s | Email: %s\n", i+1, vect[i].getName(), vect[i].getEmail());
		}

		sc.close();
	}

}
