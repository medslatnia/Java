package TP2_2;

public class exo5 {
	
	/*	Ecrire une fonction « affseq » qui prend en paramètre un entier n et affiche à l’écran la séquence 
		{0,1, 2 , …n-1,n} dans cet ordre. */
	public static void affseq(int n) {
		if (n == 0) {
			System.out.println("0");
		} else {
		affseq(n-1);
		System.out.println(n);
		
		}
	}
	
	/*	Créer une seconde fonction affseqInv pour qu’elle fait un affichage inverse {n, n-1, n-2 , …1,0}.*/
	
	public static void affseqInv(int n) {
		if (n == 0) {
			System.out.println("0");
		} else {
		System.out.println(n);
		affseqInv(n-1);


		}
	}
	/*	Toujours avec la récursivité uniquement, écrire une fonction qui prend en 
		paramètre un entier n et qui retourne la somme de 1 à n inclusivement.*/
	public static int sum_n(int n) {
		if (n == 1) {
			return 1;
		} else {
				return n + sum_n(n-1);
			}
		}
	
	/*	écrire la fonction « facto » permettant de 
		calculer la factorielle d’un entier n donné en paramètre.*/
	public static int facto(int n) {
		if (n==1) {
			return 1;
		}
		else {
			return n * facto(n-1);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		affseq(10);
		affseqInv(10);
		System.out.println("La somme de 1 à n inclusivement est égal à : "+sum_n(10));
		System.out.println("Le factoriel de 1 à nt est égal à : "+facto(10));
	}

}
