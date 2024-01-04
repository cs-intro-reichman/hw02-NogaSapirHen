public class inOrder
{
    public static void main(String[] args) 
	{
		//generates the first number that should be printed anyway
	int firstNum = (int) ( Math.random()* 10 );
	System.out.print (firstNum);
	// generates the next number
	int randomNum = (int) ( Math.random()* 10 );
	while ( firstNum <= randomNum )
	{
		System.out.print ( " "+ randomNum );
		// saves the last number for the next check of the loop
		firstNum = randomNum;
		//generates new number
		randomNum = (int) ( Math.random()* 10 );
	}
	}
}	
