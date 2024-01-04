public class OneOfEachStats1
{
    public static void main(String[] args) 
	{
	// Declares integer
	int T = Integer.parseInt ( args[0] );
	int family2 = 0;
	int family3 = 0;
	int family4orMore = 0;
	double average = 0;
	// for each family
	int count = 0;
	for ( int i = 0; i < T; i ++ )
	{
	// each family
	boolean isGirl = false;
	boolean isBoy = false;
	while ( !isBoy || !isGirl )
	{
		// the int will be 1 or 0
	int random = (int) ( Math.random () + 0.5 );
	isGirl = ( random == 1 );
	isBoy = (random == 0 );
	count ++;
	}
	// adds to the general counts
	if ( count == 2 )
		family2 ++;
	if ( count == 3 )
		family3 ++;
	if ( count >= 4 )
		family4orMore ++;
	average += count; 
	}
	average = average / T ;
	System.out.println ( "Average: " + average + " children to get at least one of each gender." );
	System.out.println ( "Number of families with 2 children: " + family2 );
	System.out.println ( "Number of families with 3 children: " + family3 );
	System.out.println ( "Number of families with 4 or more children: " + family4orMore );
	int mostCommon = Math.max ( family2, Math.max ( family3, family4orMore ) );
	if ( mostCommon == family2 )
		System.out.println ( "The most common number of children is 2." );
	else if ( mostCommon == family3 )
		System.out.println ( "The most common number of children is 3." );
	else
		System.out.println ( "The most common number of children is 4 or more." );
}
}