package TP2_2;
import java.util.Scanner;

public class Exo4 {
	/*	Un nombre premier est un nombre uniquement divisible par 1 ou par lui-même. Par exemple, 7 n’est 
	divisible que par 1 ou par lui-même.*/

	/*	Écrire une qui renvoie en sortie un résultat booléen ayant comme valeur « true » si « n » est un nombre premier,
 	ou « false » sinon*/
	public static boolean FirstTest (int n) {
		int x=0;
		if (n==1) {return true;}
		else {
		for(int i=2;i<n;i++) {
			if (n%i==0) {
			x = x + 1;
			return false;
			}
			if (x > 0) {return false;}
			}
		}
		return true;
	}
	
	/*	Ecrire une seconde méthode  qui recherche et affiche à l’écran tous les nombres premiers compris entre 2 et n*/
	public static void ChercherNbPremier(int n) {
		for (int i=2;i<=n;i++) {
			System.out.println(i+" est un nombre premier : "+FirstTest(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		
		do {
			System.out.println("Veuillez saisir le nombre dont vous souhaitez tester s'il est premier ou non : ");
			Scanner input = new Scanner(System.in);
			n = input.nextInt();
			}
		while (n<=0);
		
		System.out.println(FirstTest(n)); //Afficher si n est premier ou non en faisant appel à la fonction FirstTest
		
		ChercherNbPremier(n);

		/*	On souhaite connaitre le temps d’exécution consommé par cette seconde fonction, ajouter au 
			code de la question 4, les commandes permettant de calculer et d’afficher le temps d’exécution 
			consommé par cette fonction pour n=100*/
		System.out.println("Le temps d'exécution est de "+System.currentTimeMillis() + " ms. ");
		
	}

}
