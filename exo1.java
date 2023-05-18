package TP2_2;
import java.util.Scanner;

public class exo1{

	public static void main(String[] args) {

		int U1 = 1 , U2 = 1;
		int n, Un;
		
		do {
			System.out.println("Veuillez saisir une valeur n>2 : ");
			Scanner input = new Scanner(System.in);
			n = input.nextInt();
			} while (n<2);
		
		System.out.println("Un = "+(U1)+"\n"+(U2)+("\n"));
		for(int i=2; i<n;i++) {
			Un = U1 + U2;
			System.out.println(Un+"\n");
			U1 = U2;
			U2 = Un;
		}
		
		
	}

}
