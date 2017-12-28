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
		
//		int ResultatAddition = var1 + var2 ;
//		int ResultatSoustraction = var1 - var2 ;
		
		Addition ResultatAddition = new Addition(var1 , var2);
		soustraction2Nbres ResultatSoustraction = new soustraction2Nbres(var1, var2); 
		
		System.out.println("Résultat addition ="+ ResultatAddition.afficher());
		System.out.println("Résultat soustraction ="+ ResultatSoustraction.afficher());
		sc1.close();
		sc2.close();
	}
}
