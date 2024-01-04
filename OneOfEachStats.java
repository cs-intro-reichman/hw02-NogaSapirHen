import java.util.Random;
public class OneOfEachStats
{
    public static void main(String[] args) 
	{
	// Declares integer
	int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
		  Random generator = new Random(seed);  
	int family2 = 0;
	int family3 = 0;
	int family4orMore = 0;
	double average = 0.0;
	int mostCommon = 0;
	// for each family
	for ( int i = 0; i < T; i ++ )
	{
	// each family
	boolean isGirl = false;
	boolean isBoy = false;
	int count = 0;
	while ( isGirl == false || isBoy == false )
	{
		// the int will be 1 or 0
	double rnd = generator.nextDouble();
	isGirl = ( rnd < 0.5 );
	isBoy = (rnd >= 0.5 );
	count ++;
	}
	// adds to the general counts
	if ( count == 2 )
		family2 ++;
	if ( count == 3 )
		family3 ++;
	if (!( count < 4 ) )
		family4orMore ++;
	average += count; 
	}
	average = average / T ;
	System.out.println ( "Average: " + average + " children to get at least one of each gender." );
	System.out.println ( "Number of families with 2 children: " + family2 );
	System.out.println ( "Number of families with 3 children: " + family3 );
	System.out.println ( "Number of families with 4 or more children: " + family4orMore );
	mostCommon = Math.max ( family2, Math.max ( family3, family4orMore ) );
	if ( mostCommon == family2 )
		System.out.println ( "The most common number of children is 2." );
	else if ( mostCommon == family3 )
		System.out.println ( "The most common number of children is 3." );
	else
		System.out.println ( "The most common number of children is 4 or more." );
}
}