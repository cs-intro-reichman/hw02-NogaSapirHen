import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStatsTry {
	public static void main (String[] args) {
	// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
	// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  
	// define variabels for store the results.
		double average;
		int Sum2Children = 0;
		int Sum3Children = 0;
		int Sum4andmoreChildren = 0;
		double all = 0;
	// loop for T families.
		for	(int i = 0;i < T; i++)
		{
			int children = 0;
			boolean boy = false;
			boolean girl = false;
	// run while loop until get at least one child of each gender 	
			while(!boy || !girl){
				children = children + 1;
				all = all + 1;
	// run a random number to decide the child gender.
				double random = generator.nextDouble();
				if(random<0.5){
				girl = true;
				}
				else{
				boy = true;
				}
			}
	// updating the num of children results. 			
		if (children == 2){
		Sum2Children = Sum2Children + 1;
		}
		else if (children == 3){
		Sum3Children = Sum3Children + 1;
		}
		else {
		Sum4andmoreChildren = Sum4andmoreChildren+ 1;
		}
		}
	// calculate the average number of children.
		average = all/T;
	// print results.
		System.out.println("Average: " + average + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " +Sum2Children);		
		System.out.println("Number of families with 3 children: " +Sum3Children);
		System.out.println("Number of families with 4 or more children: " +Sum4andmoreChildren);		
	// find and print the most common number of children.
		if(Sum2Children >= Sum3Children && Sum2Children >= Sum4andmoreChildren){
			System.out.println("The most common number of children is 2.");
		}
		else if (Sum3Children >= Sum2Children && Sum3Children >= Sum4andmoreChildren){
			System.out.println("The most common number of children is 3.");
		}
		else{
			System.out.println("The most common number of children is 4 or more.");
		}		    
	}
}