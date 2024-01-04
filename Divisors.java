public class Divisors
{
    public static void main(String[] args) 
	{
        // Declares integer
	int num = Integer.parseInt ( args[0] );
	for ( int i = 1; i <= num; i ++ ) 
	{
		//checks is it a divisor
	if ( num % i == 0 )
	System.out.println( i );
	}
	}
}
	
	