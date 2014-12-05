public class DenKortasteVagen {
	
	// mellanstationer returnerar en vektor med de mellanstationer som finns på den kortaste
	 // vägen. Ordningsnummer av den första mellanstationen finns på index 1, och ordningsnummer
	 // av den andra mellanstationen på index 2 i vektorn.
	public static int[] mellanstationer(double[] a, double[][] b, double[] c) {
		
		//int stationer[]= new int[2];//eftersom det finns 2 huvud stationer (U och V) mellan X och Y
		int indexI=0;
		int indexJ=0;
		double distansMellanStaioner =a[indexI] + b[indexI][indexJ] + c[indexJ] ;
		
		//går genom alla möjliga kombinationer av mellanstationer 
			//Yttre loop
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < c.length; j++)			 //Inre loop
			{	
				double aktuellDistans = a[i] + b[i][j] + c[j]; //Addera avstånderna
				if(aktuellDistans < distansMellanStaioner) //Om nuvarande avstånd < än förengående avstånd
				{
					indexI= i + 1; // eftersom indexet börjar från noll
					indexJ= j + 1;	
					distansMellanStaioner = aktuellDistans;
				}
			}
		}

		int[] stationer={indexI,indexJ};
		return stationer ;
	}
	 
	  // langd returnerar längden av den kortaste vägen.
	 public static double langd (double[] a, double[][] b, double[] c)
	 {
		 //skapa variabler för den kortaste avstånd och förengående avstånd
		 //samma som ovan men här hittar man den kortaste vägen
		 double kortasteVagen=a[0] + b[0][0] + c[0];//väg x+ u1 + v1 + y
		
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
