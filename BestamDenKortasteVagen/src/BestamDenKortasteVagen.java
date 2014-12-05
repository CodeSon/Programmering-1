/**
 * @author David Nartey
 * At Bestämma den kortaste vägen i en trafiksystem
 * 
 *
 */

import java.util.Locale;
import java.util.Scanner;

public class BestamDenKortasteVagen {

	public static void main(String[] args) {

		System.out.println("Bestäm den kortaste vägen");
		System.out.println("--------------------------");
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);

		System.out.println("Antalet stationer i zone 2: ");
		int u = in.nextInt();
		System.out.println();

		System.out.println("Antalet stationer i zone 3: ");
		int v = in.nextInt();
		System.out.println();

		double a[] = new double[u]; 	// avstånden från x till u stationerna
		double b[][] = new double[u][v];// avstånden från u stationerna till v stattionerna
		double c[] = new double[v];		// avstånden från v stationerna till Y

		for (int i = 0; i < u; i++)
		{
			System.out.println("Ange avståndet från X till U" + (i + 1));

			a[i] = in.nextDouble();
		}

		// Yttre for loop loopa genom U stationerna och den inre for loop loopa
		// genom V (för varje U loopa genom alla V)
		for (int i = 0; i < u; i++) {
			for (int j = 0; j < v; j++) 
			{
				System.out.println("Ange avståndet från U" + (i + 1)//kompensrar för indexet som börjar från noll
						+ " till V" + (j + 1));
				b[i][j] = in.nextDouble();
			}

		}
		

		for (int i = 0; i < v; i++)
		{
			System.out.println("Ange avståndet från V" + (i + 1) + " till Y");//kompensrar för indexet som börjar från noll

			c[i] = in.nextDouble();
		}
		
		in.close();
		
		int[] stationer = DenKortasteVagen.mellanstationer(a, b, c);//här stationerna på den kortaste rutten
		double kortasteDistans= DenKortasteVagen.langd(a, b, c);//distansen för den kortaste rutten
		System.out.println("Den kortaste vägen går genom U" + stationer[0] + " och V" + stationer[1] + " och avståndet är " + kortasteDistans);

	}

}
