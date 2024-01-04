public class DamkaBoard
{
    public static void main(String[] args) 
	{
	 // Declares integer
	int n = Integer.parseInt ( args[0] );
	for ( int i = 0; i < n; i++ )
	{
		if ( i % 2 == 0 )
		{
			System.out.print ( "*" );
		}
		// every second row starts with space
		for ( int j = 0; j < n-1; j++ )
		{
			System.out.print ( " *" );
		}
		// next row
		if ( i % 2 == 1 )
			System.out.print ( " *" );
			else 
			System.out.print ( " " );
		System.out.println ( );
	}
	}
}