public class Reverse
{
    public static void main(String[] args) 
	{
        // Declares Strings
		String original = args [0];
		String reversed = "";
		int middle = original.length() / 2;
		for (int i = original.length() - 1 ; i >= 0; i-- )
		{
			// builds the string reversed
			reversed += original.charAt ( i ); 
		} 
		System.out.println ( reversed );
		System.out.println ( "The middle character is " + reversed.charAt ( middle ) );
		}
		}
		
		
		
		
		