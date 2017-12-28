package nextApp;

import java.util.Scanner;

public class PetitCalculs {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		System.out.println("Calcule arthmétique:\nEntrez le premier puis le second nombre:");
		int var1 = Integer.parseInt(sc1.nextLine());

		System.out.println("Entrez le second nombre:");
		int var2 = Integer.parseInt(sc2.nextLine());

		Addition ResultatAddition = new Addition(var1, var2);
		Soustraction2Nbres ResultatSoustraction = new Soustraction2Nbres();
		
		System.out.println( ResultatAddition.afficher() );
		System.out.println("Soustraction = " + ResultatSoustraction.soustraire(var1, var2) );
		sc1.close();
		sc2.close();
	}
}
