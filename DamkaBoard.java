public class DamkaBoard
{
    public static void main(String[] args) 
	{
	 // Declares integer
	int n = Integer.parseInt ( args[0] );
	for ( int i = 0; i < n; i++ )
	{
		// every second row starts with space
		for ( int j = 0; j < n; j++ )
		{
			if ( i % 2 == 0 )
			System.out.print ( " *" );
			//System.out.print ( " *" );
			if ( i % 2 == 1 )
			System.out.print ( "* " );
		}
		// next row
		System.out.println (" ");
	}
	}
}