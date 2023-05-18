package TP2_2;

public class exo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*	On souhaite programmer un logiciel qui simule un lancer de deux dés avec 
			36 combinaisons formant 11 sommes comprises entre 2 et 12.*/
		
		/*	le programme doit simuler le lancer 70 000 fois et 
		    sauvegarder les occurrences (fréquences) de chacune des sommes dans un tableau.*/
		int[] T1 = new int[70000];
		
		for (int i=0;i<70000;i++) {
			
			int dice1 = (int)((int) 1 + Math.random()*6 );
			int dice2 = (int)((int) 1 + Math.random()*6);
			
			T1[i] = dice1 + dice2;
		}
		
		/*	Il doit afficher ensuite les résultats et la somme la plus fréquente */
		
		int freqOcc = 0;
		int freqOccMax = 0;
		int freq = T1[0];
		
		System.out.println("T1 = ");
		for(int i=0;i<70000;i++) {
			System.out.println(T1[i]+"\n");
			
			if (T1[i] == freq) {
				freqOcc = freqOcc + 1;
				if (freqOccMax < freqOcc) {
					freqOccMax = freqOcc;
					freq = T1[i];
				}
			}
		}
		
		System.out.println("La somme la plus fréquente est = "+freq+"\nSon occurence est de : "+freqOccMax);

	}
	
}
