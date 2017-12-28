package nextApp;

import java.util.Scanner;

public class PetitCalculs {
	public static void main(String[] args) {
		System.out.println("Calcule arthmétique:\nEntrez le premier nombre:");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Calcule des éntrées:\nEntrez le second nombre:");
		Scanner sc2 = new Scanner(System.in);
		int ResultatAdition = 15;
		System.out.println(sc1.nextLine()+"+"+sc2.nextLine() +"="+ ResultatAdition);
		sc1.close();
		sc2.close();
	}
	
}
