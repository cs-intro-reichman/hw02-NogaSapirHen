public class Perfect
{
    public static void main(String[] args) 
	{
	   // Declares integer
	int num = Integer.parseInt ( args[0] );
	String endOfProgram = ( num + " is a perfect number since " + num + " = 1" );
	// every number can be divided by 1
	int sum = 1;
	for ( int i = 2; i < num; i ++ ) 
	{
		//checks is it a divisor
	if ( num % i == 0 ) {
		endOfProgram += " + " + i;
		// in order to see if it equals
		sum += i;
	}
	}
	if ( sum == num )
		System.out.println ( endOfProgram );
	else 
		System.out.println ( num + " is not a perfect number" );
	}
}