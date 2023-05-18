package TP2_2;
import java.util.Arrays;
import java.util.Scanner;

public class exo2 {

	public static void main(String[] args) {
		
		/*	Écrire un programme allouant dynamiquement un emplacement pour trois tableaux 
		 d’entiers t1, t2 et t3, dont la taille est fournie par l’utilisateur.*/
		int n;
		
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Veuillez saisir une taille positive des tableaux : ");
			n = input.nextInt();
		} while (n<=0);

		
		int[] T1 = new int[n];
		int[] T2 = new int[n];
		int[] T3 = new int[n];
		
		/*	Utiliser le tableau T1 pour y placer des valeurs entières
		  saisies également par l’utilisateur,*/
		
		for (int i=0;i<n;i++) {
			System.out.println("Veuillez saisir une valeur : ");
			T1[i] = input.nextInt();
		}
		
		/*	Le tableau T2 est destiné à recevoir les carrés des nombres contenus dans T1*/
		for (int i=0;i<n;i++) {
			T2[i] = T1[i] * T1[i];
		}
		
		/*	Afficher les valeurs du tableau T2 en utilisant la boucle for-each*/
		System.out.println("T2 = ");
		for (int X : T2) {
			System.out.println(X+"\n");
		}
		
		/*	Remplir le tableau  T3 par des valeurs aléatoires comprises entre 5 et 99 */
		for (int i=0;i<n;i++) {
			int elem = (int)((int) 5 + Math.random()*99 );
			T3[i] = elem;
		}
		
		/*	Trier les éléments de T3 dans l’ordre croissant*/
		Arrays.sort(T3);
		
		/*	Afficher les valeurs du tableau T3 en utilisant la boucle for-each.*/
		System.out.println("T3 = ");
		for(int Z : T3) {
			System.out.println(Z+"\n");
		}
		
		/*	Afficher les valeurs maximales et minimales de T3 */
		int max = Arrays.stream(T3).max().getAsInt();
		System.out.println("Le maximum de T3 = "+max);
		
		int min = Arrays.stream(T3).min().getAsInt();
		System.out.println("Le minimum de T3 = "+min);
	}

}
