import java.util.*;

public class Ou1 {

	public static void main(String[] args) {

		System.out.println("TEMPERATUR\n");

		// Inmatningsverktyg
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);

		// Mata in uppgifter om antalet veckor och antalet m�tningar

		System.out.println("Antalet veckor: ");
		int antalVeckor = in.nextInt();

		System.out.println("Antalet m�tningar: ");
		int antalMatningarPerVecka = in.nextInt();

		// Plats att lagra temperaturer

		double[][] t = new double[antalVeckor + 1][antalMatningarPerVecka + 1];

		// Mata in temperaturerna

		for (int vecka = 1; vecka <= antalVeckor; vecka++) // start at 1 and
															// stop when u reach
															// # of required
															// weeks

		{
			System.out.println("temperatur ---- vecka " + vecka + ":");// for
																		// every
																		// count,print
																		// out

			for (int matning = 1; matning <= antalMatningarPerVecka; matning++)
				// how to determine the max limit

				t[vecka][matning] = in.nextDouble();// read from the in buffer
													// to fill the table
		}

		System.out.println();

		// Visa temperaturerna
		// prints out the table
		System.out.println("temperaturerna: ");
		System.out.println();

		for (int vecka = 1; vecka <= antalVeckor; vecka++) {
			

			for (int matning = 1; matning <= antalMatningarPerVecka; matning++)

				System.out.print(t[vecka][matning] + " ");// printing out the
															// content of the
															// table

		}

		System.out.println();

		// den minsta,den st�rsta och medeltemperaturen -veckovis

		double[] minT = new double[antalVeckor + 1];
		double[] maxT = new double[antalVeckor + 1];
		double[] sumT = new double[antalVeckor + 1];
		double[] medelT = new double[antalVeckor + 1];

		// koden ska skrivas h�r
		// visa den minsta ,den st�rsta och medeltemp f�r varje vecka
		// koden skrivas h�r

		// den minsta ,den st�rsta och medeltemp - hela perioden

		double minTemp = 0;
		double maxTemp = 0;
		double sumTemp = 0;
		double temp = 0; // changed type from int
		double periodMinTemp = 0;
		double periodMaxTemp = 0;
		double periodSumTemp = 0;

		for (int vecka = 1; vecka <= antalVeckor; vecka++) {

			for (int matning = 1; matning <= antalMatningarPerVecka; matning++) {
				
				temp = t[vecka][matning]; // looking at current temp (at these
											// positions)

				if (matning == 1)// special case of the first measurement of
									// each wk to confirm the first value
									// entered
				{
					minTemp = temp;
				} else if (temp < minTemp) {

					minTemp = temp;

				}

				if (matning == 1)// special case of the first measurement of
									// each wk to confirm the first value
									// entered
				{
					maxTemp = temp;
				} else if (temp > maxTemp) {

					maxTemp = temp;

				}

				if (matning == 1)// special case of the first measurement of
									// each wk to confirm the first value
									// entered
				{
					sumTemp = temp;
				} else {

					sumTemp = sumTemp + temp;

				}
			}

			if (vecka == 1)// special case of the min temp of the first week to
							// confirm the first value entered
			{
				periodMinTemp = minTemp;
			}

			else if (minTemp < periodMinTemp) {
				periodMinTemp = minTemp;
			}

			if (vecka == 1)// special case of the max temp of the first week to
							// confirm the first value entered
			{
				periodMaxTemp = maxTemp;
			}

			else if (maxTemp > periodMaxTemp) {
				periodMaxTemp = maxTemp;
			}

			if (vecka == 1)// special case of the first measurement of each wk
							// to confirm the first value entered
			{
				periodSumTemp = sumTemp;
			} else {

				periodSumTemp = periodSumTemp + sumTemp;

			}
			System.out.println("Min temperaturen f�r vecka " + vecka + ": "
					+ minTemp);
			System.out.println();
			System.out.println("Max temperaturen f�r vecka " + vecka + ": "
					+ maxTemp);
			System.out.println();

			System.out.println("Sum temperaturen f�r vecka " + vecka + ": "
					+ sumTemp);
			System.out.println();

			System.out.println("Genomsnittstemperaturen f�r vecka " + vecka
					+ ": " + sumTemp / antalMatningarPerVecka);
			System.out.println();

		}

		System.out.println("Min temperaturen f�r perioden " + ": "
				+  periodMinTemp);
		System.out.println();
		System.out.println("Max temperaturen f�r perioden " + ": "
				+ periodMaxTemp);
		System.out.println();
		System.out.println("Sum temperaturen f�r perioden " + ": "
				+  periodSumTemp);
		System.out.println();

		System.out.println("Genomsnittstemperaturen f�r perioden "
				+ ": "
				+  periodSumTemp / (antalMatningarPerVecka * antalVeckor));
		

	}
}
