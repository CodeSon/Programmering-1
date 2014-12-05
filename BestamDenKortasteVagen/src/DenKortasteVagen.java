public class DenKortasteVagen {
	
	// mellanstationer returnerar en vektor med de mellanstationer som finns p� den kortaste
	 // v�gen. Ordningsnummer av den f�rsta mellanstationen finns p� index 1, och ordningsnummer
	 // av den andra mellanstationen p� index 2 i vektorn.
	public static int[] mellanstationer(double[] a, double[][] b, double[] c) {
		
		//int stationer[]= new int[2];//eftersom det finns 2 huvud stationer (U och V) mellan X och Y
		int indexI=0;
		int indexJ=0;
		double distansMellanStaioner =a[indexI] + b[indexI][indexJ] + c[indexJ] ;
		
		//g�r genom alla m�jliga kombinationer av mellanstationer 
			//Yttre loop
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < c.length; j++)			 //Inre loop
			{	
				double aktuellDistans = a[i] + b[i][j] + c[j]; //Addera avst�nderna
				if(aktuellDistans < distansMellanStaioner) //Om nuvarande avst�nd < �n f�reng�ende avst�nd
				{
					indexI= i + 1; // eftersom indexet b�rjar fr�n noll
					indexJ= j + 1;	
					distansMellanStaioner = aktuellDistans;
				}
			}
		}

		int[] stationer={indexI,indexJ};
		return stationer ;
	}
	 
	  // langd returnerar l�ngden av den kortaste v�gen.
	 public static double langd (double[] a, double[][] b, double[] c)
	 {
		 //skapa variabler f�r den kortaste avst�nd och f�reng�ende avst�nd
		 //samma som ovan men h�r hittar man den kortaste v�gen
		 double kortasteVagen=a[0] + b[0][0] + c[0];//v�g x+ u1 + v1 + y
		
		 for (int i = 0; i < a.length; i++) {
			 for (int j = 0; j < c.length; j++) {

				 double aktuellDistans = a[i] + b[i][j] + c[j];

				 if(aktuellDistans < kortasteVagen)			
				 {
					 kortasteVagen = aktuellDistans;		
				 }
			 }
		 }
			
		  return kortasteVagen;
	 }
	 
}
