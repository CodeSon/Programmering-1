/**
 * @author David Nartey
 * At Best�mma den kortaste v�gen i en trafiksystem
 * 
 *
 */

import java.util.Locale;
import java.util.Scanner;

public class BestamDenKortasteVagen {

	public static void main(String[] args) {

		System.out.println("Best�m den kortaste v�gen");
		System.out.println("--------------------------");
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);

		System.out.println("Antalet stationer i zone 2: ");
		int u = in.nextInt();
		System.out.println();

		System.out.println("Antalet stationer i zone 3: ");
		int v = in.nextInt();
		System.out.println();

		double a[] = new double[u]; 	// avst�nden fr�n x till u stationerna
		double b[][] = new double[u][v];// avst�nden fr�n u stationerna till v stattionerna
		double c[] = new double[v];		// avst�nden fr�n v stationerna till Y

		for (int i = 0; i < u; i++)
		{
			System.out.println("Ange avst�ndet fr�n X till U" + (i + 1));

			a[i] = in.nextDouble();
		}

		// Yttre for loop loopa genom U stationerna och den inre for loop loopa
		// genom V (f�r varje U loopa genom alla V)
		for (int i = 0; i < u; i++) {
			for (int j = 0; j < v; j++) 
			{
				System.out.println("Ange avst�ndet fr�n U" + (i + 1)//kompensrar f�r indexet som b�rjar fr�n noll
						+ " till V" + (j + 1));
				b[i][j] = in.nextDouble();
			}

		}
		

		for (int i = 0; i < v; i++)
		{
			System.out.println("Ange avst�ndet fr�n V" + (i + 1) + " till Y");//kompensrar f�r indexet som b�rjar fr�n noll

			c[i] = in.nextDouble();
		}
		
		in.close();
		
		int[] stationer = DenKortasteVagen.mellanstationer(a, b, c);//h�r stationerna p� den kortaste rutten
		double kortasteDistans= DenKortasteVagen.langd(a, b, c);//distansen f�r den kortaste rutten
		System.out.println("Den kortaste v�gen g�r genom U" + stationer[0] + " och V" + stationer[1] + " och avst�ndet �r " + kortasteDistans);

	}

}
