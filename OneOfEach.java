public class OneOfEach
{
    public static void main(String[] args) 
	{
	boolean isGirl = false;
	boolean isBoy = false;
	int count = 0;
	while ( !isBoy || !isGirl )
	{
		// the int will be 1 or 0
	int random = (int) ( Math.random () + 0.5 );
	if ( random == 1 ) {
		isGirl = true;
		System.out.print ( "g " );
	}
	else {
		isBoy = true;
		System.out.print ( "b " );
	}
	// counts the amount of children
	count ++;
	}
	System.out.println ( " You made it... and now you have " + count + " children." );
	}
	}
	
	